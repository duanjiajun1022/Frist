package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pojo.Hider;

import service.HiderService;

@Controller
public class HiderController {

	@Autowired
	public HiderService hs;

	public HiderService getHs() {
		return hs;
	}

	public void setHs(HiderService hs) {
		this.hs = hs;
	}

	@RequestMapping("/getAll")
	public String getAll(HttpServletRequest request,
			HttpServletResponse response) {
		List<Hider> list = hs.getAll();
		request.getSession().setAttribute("list", list);
		return "index.jsp";
	}

	/*
	 * @RequestMapping("/getDel") public String getDel(HttpServletRequest
	 * request, HttpServletResponse response) { int id =
	 * Integer.parseInt(request.getParameter("id")); hs.getDel(id); return
	 * "getAll"; }
	 */

	@RequestMapping("getDel")
	@ResponseBody
	// 声明该方法返回字符串不是路劲跳转 而是一个单纯的字符串跳转
	public String getDel(int id) {

		int num = hs.getDel(id);
		if (num > 0) {
			return "true";
		} else {
			return "false";
		}
	}

	@RequestMapping("/getList")
	public String getList(int id, HttpServletRequest request) {
		Hider h = hs.getList(id);
		request.getSession().setAttribute("list", h);
		return "upd.jsp";
	}

	@RequestMapping("getUpd")
	public String getUpd(Hider h) {
		hs.getUpd(h);
		return "getAll";
	}
}

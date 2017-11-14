package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.HiderMapper;

import pojo.Hider;

@Service
public class HiderServiceImpl implements HiderService {

	@Autowired
	public HiderMapper hm;

	public HiderMapper getHm() {
		return hm;
	}

	public void setHm(HiderMapper hm) {
		this.hm = hm;
	}

	public List<Hider> getAll() {
		// TODO Auto-generated method stub
		return hm.getAll();
	}

	public int getDel(int id) {
		// TODO Auto-generated method stub
		return hm.getDel(id);
	}

	public int getUpd(Hider h) {
		// TODO Auto-generated method stub
		return hm.getUpd(h);
	}

	public Hider getList(int id) {
		// TODO Auto-generated method stub
		return hm.getList(id);
	}

}

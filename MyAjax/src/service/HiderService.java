package service;

import java.util.List;

import pojo.Hider;

public interface HiderService {
	public List<Hider> getAll();

	public int getDel(int id);

	public int getUpd(Hider h);

	public Hider getList(int id);
}

package dao;

import java.util.List;

import pojo.Hider;

public interface HiderMapper {
	public List<Hider> getAll();

	public int getDel(int id);

	public int getUpd(Hider h);

	public Hider getList(int id);
}

package com.Singers.daos;

import java.util.List;

import com.Singers.models.Singers;

public interface SingersDao {
	
	public boolean insertSingers(Singers Singers);
	
	public List<Singers> getAllSingers();
	
	public boolean updateSinger(Singers updateSinger, int id);
	
	public boolean deleteSinger(int id);

}

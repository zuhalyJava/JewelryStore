package com.Singers.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Singers.models.Singers;

public class SingersDaoImpl implements SingersDao {
	Connection Con = null;
	
	public SingersDaoImpl(Connection Con) {
		this.Con=Con;
		
	}
	
	

	@Override
	public boolean insertSingers(Singers Singers) {
//		System.out.println("this is from SingersDaoImpl");
//		System.out.println(Singers);
		
		boolean status = false;
		try {
			String sql = "insert into Singers(id, firstName, lastName, phoneNumber, email)values(?,?,?,?,?)";
			
			PreparedStatement preparedStatement = Con.prepareStatement(sql);
			preparedStatement.setInt(1, Singers.getId());
			preparedStatement.setString(2, Singers.getFirstName());
			preparedStatement.setString(3, Singers.getLastName());
			preparedStatement.setInt(4, Singers.getPhoneNumber());
			preparedStatement.setString(5, Singers.getEmail());
			
			int returndata = preparedStatement.executeUpdate();
			
			if(returndata > 0) {
				status = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return status;
	}

	@Override
	public List<Singers> getAllSingers() {
		
		
		List<Singers> styList = new ArrayList<Singers>();
		try {
			String sql = "select * from Singers";
			
			PreparedStatement preparedStatement = Con.prepareStatement(sql);
	
			
			ResultSet  result = preparedStatement.executeQuery(sql);
			
			
			while(result.next()) {
				Singers s = new Singers();
				s.setId(result.getInt(1));
				s.setFirstName(result.getString(2));
				s.setLastName(result.getString(3));
				s.setPhoneNumber(result.getInt(4));
				s.setEmail(result.getString(5));
				styList.add(s);
				
			}
		      
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return styList;
	}

	@Override
	public boolean updateSinger(Singers updatedSinger, int id) {
		boolean status = false;
		try {
			String sql = "update Singers set firstName=?, lastName=?, phoneNumber=?,email=? where id = ?";
			
			PreparedStatement preparedStatement = Con.prepareStatement(sql);
			preparedStatement.setString(1, updatedSinger.getFirstName());
			preparedStatement.setString(2, updatedSinger.getLastName());
			preparedStatement.setInt(3, updatedSinger.getPhoneNumber());
			preparedStatement.setString(4, updatedSinger.getEmail());
			preparedStatement.setInt(5, id);
			int returndata = preparedStatement.executeUpdate();
			
			if(returndata > 0) {
				status = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteSinger(int id) {
		
		boolean status = false;
		try {
			String sql = "delete from Singer where id = ?";
			
			PreparedStatement preparedStatement = Con.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int returndata = preparedStatement.executeUpdate();
			
			if(returndata > 0) {
				status = true;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
	}

}
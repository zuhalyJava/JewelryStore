package com.Singers.services;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.Singers.daos.SingersDaoImpl;
import com.Singers.models.Singers;

public class SingersServices {
	
	SingersDaoImpl SingersDao = null;
	
	public SingersServices(Connection Con) {
		SingersDao = new SingersDaoImpl(Con);
	}
	
	
	public void CreateSingers(Scanner sc) {
		
		

		System.out.println("enter id:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter firstName:");
		String firstName = sc.nextLine();
		System.out.println("enter lastName:");
		String lastName = sc.nextLine();
		System.out.println("enter phoneNumber:");
		int phoneNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("enter email:");
		String email = sc.nextLine();
		
		Singers Singers = new Singers(id, firstName, lastName, phoneNumber, email);
		
		boolean status = false;
		
		status = this.SingersDao.insertSingers(Singers);
		
		
		if(status) {
			System.out.println("singer has been added successfully");
		}else {
			System.out.println("please check your code or connection");
		}
	
	}
	
	
	public void getAllSingers() {
		
		List<Singers> SingersList =this.SingersDao.getAllSingers();
		
		for(int i=0; i<SingersList.size();i++) {
			System.out.println("Singers "+ i);
			System.out.println(SingersList.get(i));
		}
		
	}
	
	
	public void updateSingers(Scanner sc) {
		
		
		System.out.println("Enter which id need to be updated:");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter firstName:");
		String firstName = sc.nextLine();
		System.out.println("enter lastName:");
		String lastName = sc.nextLine();
		System.out.println("enter phoneNumber:");
		int phoneNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("enter email:");
		String email = sc.nextLine();
		
		
		Singers updatedSingers = new Singers(id, firstName, lastName, phoneNumber, email);
		
		boolean status = this.SingersDao.updateSinger(updatedSingers, id);
		
		
		if(status) {
			System.out.println("Singer has been updated successfully");
		}else {
			System.out.println("please check your code or connection");
		}
		
	}
	
	public void deleteSingers(Scanner sc) {
		
		
		
		System.out.println("Enter which id need to delete:");
		int id = sc.nextInt();
		sc.nextLine();
	boolean status = this.SingersDao.deleteSinger(id);
		
		if(status) {
			System.out.println("Singer has been deleted successfully");
		}else {
			System.out.println("please check your code or connection");
		}
		
	}


	public static void CreateSingers1() {
		// TODO Auto-generated method stub
		
	}
	


	}




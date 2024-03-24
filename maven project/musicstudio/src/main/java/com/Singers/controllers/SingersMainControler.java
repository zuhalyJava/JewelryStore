package com.Singers.controllers;

import java.sql.Connection;
import java.util.Scanner;

import com.Singers.services.SingersServices;
import com.Singers.util.SingersConnectionStatements;

public class SingersMainControler {

	public static void main(String[] args) {

		Connection Con = SingersConnectionStatements.createConnection();
		
		SingersServices Services =new SingersServices(Con);
		

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------******-----Welcome to our best voice Show-------******--------------");

		int option = 0;
        boolean stop = false;
		
         while(!stop) {
        		System.out.println("1. create Singers");
        		System.out.println("2. get all Singers");
        		System.out.println("3. update Singers");
        		System.out.println("4. delete Singers");
        		System.out.println("5. Exit");
        	option = sc.nextInt();
        	sc.nextLine();
     		switch (option) {
     		case 1:
     			Services.CreateSingers(sc);
     			break;
     		case 2:
     			Services.getAllSingers();
     			break;
     		case 3:
     			Services.updateSingers(sc);
     			break;
     		case 4:
     			Services.deleteSingers(sc);
     			break;
     		case 5:
     			stop = true;
     			System.out.println("Exit done");
     			sc.close();
     			SingersConnectionStatements.closeConnection(Con);
     			break;
     		}
     			
     		
         }


	}



	}



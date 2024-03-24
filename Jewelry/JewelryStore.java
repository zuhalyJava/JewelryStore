package myJewelryStoreProject;

import java.util.Scanner;

public class JewelryStore {

	public static void main(String[] args) {
		
//		Welcome to Store 
//		 
//		a. add item to Inventory
//		b. check Inventory
//		if you select "a" option it will show these options 
//		create laptop
//		create table
//		create light  
//		        if select option 1 , it will ask question to create a laptop        
//		        if select option 2, it will ask question to create a table
//		         if select option 3 , it will ask question to create a light
//		 
//		if you select "b" option it will show these options 
//		       
//		    1. laptop Inventory 
//		   2. table Inventory
//		   3. light Inventory 
//		 
//		         if select option 1 , it will show the   laptop  Inventory 
//		                                               will ask a question to go back ?
//		         if select option 1 , it will show the   light  Inventory 
//		                                               will ask a question to go back ?
//		         if select option 1 , it will show the   table  Inventory 
//		                                               will ask a question to go back ?
//		 


		Necklace Necklace =new Necklace(925, "Italy Necklace", "Sterling Silver", 18, 16,"Silver");
		
		Bracelet Bracelet = new Bracelet(14, "Ross-Simons Italian", "14k Yellow Gold", 250, 7,1);
		
		Ring Ring = new Ring(14,"Carat LAB GROWN DIMOND", "White Gold",1987, 8, "White Gold");
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Welcome to our Jewelry Store");
		System.out.println("These are our new arrival items please have a look and choose your favorates");
		//...........
	
		int option;
		
		option= Scan.nextInt();
		
		switch (option) {
		
		case 1:
		
		System.out.println("enter id number");
		
		int id= Scan.nextInt();
		Scan.nextLine();
		
		System.out.println("enter name");
		
		String name= Scan.nextLine();
		
		
		System.out.println("enter type");
		
		String type= Scan.nextLine();
		
		
		System.out.println("enter price");
		
		int price= Scan.nextInt();
		Scan.nextLine();
		
		System.out.println("enter size");
		
		int size= Scan.nextInt();
		Scan.nextLine();
		
		System.out.println("enter color");
		
		String color= Scan.nextLine();
		
		break;
		
		
		case 2:
			
			System.out.println("enter id number");
			
			int id2= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter name");
			
			String name2= Scan.nextLine();
			
			
			System.out.println("enter type");
			
			String type2= Scan.nextLine();
			
			
			System.out.println("enter price");
			
			int price2= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter size");
			
			int size2= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter color");
			
			String color2= Scan.nextLine();
			
			System.out.println("enter quantity");
			int quantity= Scan.nextInt();
			Scan.nextLine();
			
			break;
			
		case 3:
			
			System.out.println("enter id number");
			
			int id3= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter name");
			
			String name3= Scan.nextLine();
			
			
			System.out.println("enter type");
			
			String type3= Scan.nextLine();
			
			
			System.out.println("enter price");
			
			int price3= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter size");
			
			int size3= Scan.nextInt();
			Scan.nextLine();
			
			System.out.println("enter color");
			
			String color3= Scan.nextLine();
			
			System.out.println("enter material");
			int material= Scan.nextInt();
			Scan.nextLine();
			
			break;
			
			
			
			
		
		}

	}

}

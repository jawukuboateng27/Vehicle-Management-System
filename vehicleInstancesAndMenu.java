package edu.uga.cs1302.vehicles;

import java.util.Scanner;

public class vehicleInstancesAndMenu {
	
	static int count; // this gives the total number of vehicle instances
	String response; // This stores user input
	Vehicle[] vehicles = new Vehicle[15]; // This initializes the array with size 15
	
	public vehicleInstancesAndMenu() {
		menu();
	}//vehicleInstancesAndMenu
	
		/*
		 * vehicles[] gives the instances for other Vehicle classes
		 */
	public void vehicles_Instances() {
		
		
		vehicles[0] = new Airplane("Airbus A220-100", "Delta Airlines", "2019", 2, 120, 300, 221, 250);
		vehicles[1] = new Airplane("Airbus A319-100", "Delta Airlines", "2018", 2, 200, 450, 319, 300);
		vehicles[2] = new Airplane("Airbus A320-200", "Delta Airlines", "2018", 2, 220, 500, 320, 320);
		
		vehicles[3] = new Automobile("Corolla LE", "Toyota", "2020", 300, 6, 150);
		vehicles[4] = new Automobile("Civic SE", "Honda", "2018", 310, 6, 160);
		vehicles[5] = new Automobile("Sentra", "Nissan", "2019", 360, 6, 200);
		
		vehicles[6] = new Ship("APM - Maersk", "Maersk", "1904", 400000, "Carnival",2695, 35);
		vehicles[7] = new Ship("MSC", "Mediterranean Shipping Company", "1970", 30000 ,"Mediterranean Shipping Company",2565, 32);
		vehicles[8] = new Ship("COSCO", "China Ocean Shipping Company", "1990", 650000, "China Ocean Shipping Company",36201, 40);
		
		vehicles[9] =  new Tesla("Tesla Model 3", "Tesla", "2020", 1, 250, 200, 6, 300);
		vehicles[10] = new Tesla("Tesla Model S", "Tesla", "2020", 1, 300, 220, 6, 390);
		vehicles[11] = new Tesla("Tesla Model Y", "Tesla", "2020", 1, 400, 360, 6, 420);
		
		vehicles[12] = new BatMobile("Model A","Wayne Industries", "2020", 4 , 300, 600 , 40000, "Wayne Industries", 500, 320);
		vehicles[13] = new BatMobile("Model C", "Wayne Industries", "2019", 3 , 290, 400, 32000, "Wayne Industries", 450, 310);
		vehicles[14] = new BatMobile("Model T", "Wayne Industries", "2018",3 , 250, 360, 280000, "Wayne Industries", 370, 310);
		
			count = vehicles.length;
		
	}//vehicles_Instances

    /*
	 *This method is used to set set isValid to true
	 *@return true This returns true for the isValid statement 
	 */
	public static boolean isValid(String response) {
		return !response.equals("1")&& !response.equals("2")&& !response.equals("3") && !response.equals("4") && !response.equals("5") && !response.equals("6") && !response.equals("h") && !response.equals("q");
	}//isValid
	
	/*
	 * This method prints out the menu for the program
	 */
	public void menu() {
		Scanner scan = new Scanner(System.in);
		
		 while(1 != 0) {
			System.out.println("Welcome! \n1 - To see how many vehicles are in the system\n2 - To see the name and the class of each vehicle\n3 - To see which vehicles can fly.\n4 - To see which vehicles can float.\n5 - To see which vehicles can fly and float.\n6 - To see a description of each vehicle.\nh - to see brief help information about the system.\nq - To terminate the program.");
					response = scan.nextLine();
					
					while(isValid(response)) {
						System.err.println("Please enter a  number between 1 - 6, or h for Help and q to Terminate the program.");
							response = scan.nextLine();
					}//while(isValid(response))
				
			switch(response) {
			case "1":
				if(response.equals("1")) {
					vehicles_Instances();
					System.out.println("There are "+vehicleInstancesAndMenu.count+" vehicles in the system.");
					break;
				}//case 1
				
			case "2":
				if(response.equals("2")) {
					for(int i = 0; i< vehicles.length;i++) {
						vehicles_Instances();
						System.out.println( "Name: "+vehicles[i].getName()+" Class: "+vehicles[i].getClass().getSimpleName()+"\n" );
					}
					break;
				}//case 2
				
			case "3":
				if(response.equals("3")) {
					
					Vehicle airplane = new Airplane(response, response, response, 0, 0, 0, 0, 0);
					Vehicle batMobile = new BatMobile(response, response, response, 0, 0, 0, 0, response, 0, 0);
					Vehicle tesla = new Tesla(response, response, response, 0, 0, 0, 0, 0);
					vehicles_Instances();
					for(int i = 0; i < vehicles.length; i++) {
						if( (vehicles[i] instanceof Airplane) || (vehicles[i] instanceof BatMobile)||(vehicles[i] instanceof Tesla) ){
							System.out.println( "Name: "+vehicles[i].getName() + "\tType: "+vehicles[i].getClass().getSimpleName() );
								System.out.println();
							}else {
						}
						
					}
					break;
				}///case 3
				
			case "4":
				if(response.equals("4")) {
					Vehicle ship = new Ship(response, response, response, 0, response, 0, 0);
					Vehicle batMobile = new BatMobile(response, response, response, 0, 0, 0, 0, response, 0, 0);
					vehicles_Instances();
					for(int i = 0; i < vehicles.length; i++) {
						if( (vehicles[i] instanceof Ship) || (vehicles[i] instanceof BatMobile) ){
							System.out.println( "Name: "+vehicles[i].getName() + "\tType: "+vehicles[i].getClass().getSimpleName() );
								System.out.println();
							}else {
						}
					}
					break;
				}//case 4
			case "5":
				if(response.equals("5")) {
					Vehicle batMobile = new BatMobile(response, response, response, 0, 0, 0, 0, response, 0, 0);
					vehicles_Instances();
					for(int i = 0; i < vehicles.length; i++) {
						if(vehicles[i] instanceof BatMobile){
							System.out.println( "Name: "+vehicles[i].getName() + "\tType: "+vehicles[i].getClass().getSimpleName() );
								System.out.println();
							}else {
						}
						
					}
					break;
				}//case 5
				
			case "6":
				if(response.equals("6")) {
					for(int i = 0; i< vehicles.length;i++) {
						vehicles_Instances();
						System.out.println( vehicles[i]+"\n" );
					}
					break;
				}// case 6
				
			case "h":
				if(response.equals("h")) {
					System.out.println("Please enter a number between 1 - 6.");
					break;
				}//case h
				
			case "q":
				if(response.equals("q")) {
					System.out.println("Thank You!");
					System.exit(0);
					break;
				}//case q
				
			}//switch
		}//while
	}//menu		
}//vehicleInstancesAndMenu


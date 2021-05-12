package edu.uga.cs1302.vehicles;

public abstract class Vehicle implements Transporter{
	
	public String name;
	public String mName; 
	public String year; 
	
	/**
	 * @param name This is the name of the a vehicle
	 * @param mName This is the manufacture's name 
	 * @param year This is the manufacturing year
	 */
	public Vehicle(String name, String mName, String year) {
		this.name = name;
		this.mName = mName;
		this.year = year;
	}
		
	/**
	 * This method returns the name of a vehicle
	 * @return String This returns the string of a vehicle's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This method sets the name of a vehicle
	 * @param name This sets the name of a vehicle
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * This method returns the name of a manufacter's name
	 * @return String This returns the string of the manufacter's name
	 */
	public String getmName() {
		return mName;
	}
	
	/**
	 * This method sets the name of a manufacter's name
	 * @mName This sets the manufacter's name
	 */

	public void setmName(String mName) {
		this.mName = mName;
	}
	
	/*
	 * This method returns the year of manufacturing
	 * @return String This gives the year of manufacturing
	 */
	public String getYear() {
		return year;
	}
	
	/*
	 * This method returns the year of manufacturing
	 * @year This sets the year of manufacturing
	 */
	public void setYear(String year) {
		this.year = year;
	}
	
	/*
	 * This method returns basic information about a vehicle
	 * @return String This returns some information about a vehicle
	 */
	public String toString(){
		return "Name: "+name+"\nManufacturer's name: "+mName+"\nYear: "+year;
		
	}
	
}

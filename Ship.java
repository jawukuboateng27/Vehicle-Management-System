package edu.uga.cs1302.vehicles;

public class Ship extends Vehicle implements Floatable{
	
	private String shippingLineOwner;
	private int tonnage;
	private int topSpeed;
	private int maxPassengers;
	
	/**
	 * @param name This gives the name of the Ship
	 * @param mName This gives the manufacter's name
	 * @param year This gives the year of manufacturing
	 * @param tonnage This gives the tonnage of the Ship
	 * @param shippingLineOwner This gives the name of the shipping line owner
	 * @param maxPassengers This gives the max passenger number that the Ship can hold
	 * @param topSpeed This gives the top speed of the Ship
	 */
	
	public Ship(String name, String mName, String year, int tonnage, String shippingLineOwner, int maxPassengers, int topSpeed ) {
		super(name, mName, year);
		this.shippingLineOwner = shippingLineOwner;
		this.tonnage = tonnage;
		this.maxPassengers = maxPassengers;
		this.topSpeed = topSpeed;
	}

	/* 
	 * This method returns the tonnage of the Ship
	 * @return int This returns the int value for the tonnage of the Ship
	 */
	public int getTonnage() {
		
		return tonnage;
	}
	
	/* 
	 * This method sets the tonnage for the Ship
	 * @param sets the tonnage for the Ship 
	 * 
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	/**
	 * This method sets the shipping line owner's name
	 * @param owerName This sets the shipping line owner's name
	 */
	public void setShippingLine(String owerName) {
		shippingLineOwner = owerName;
	}
	
	/**
	 * This method returns the Shipping line owner's name
	 * @return String This returns the name of the shipping line owner
	 */
	public String getShippingLine() {
		return shippingLineOwner;
	}
	/*
	 * This method returns the max passengers on the Ship
	 * @return int This returns the int for the max passengers on the Ship
	 */
	public int getMaxPassengers() {
		return  maxPassengers;
	}

	/*
	 * This method sets the max passengers on the Ship
	 * @param maxPassengers sets the max passengers on the Ship
	 */
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	/*
	 * This method returns the max top speed attained by the Ship
	 * @return int This returns the int for the max top speed by the Ship
	 */
	public int getTopSpeed() {
		return topSpeed;
	}

	/*
	 * This method sets the max top speed by the Ship
	 * @param topSpeed sets the max top speed by the Ship
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	/*
	 * This method returns all infomation about the Ship
	 * @return String returns the string of information about the Ship
	 */
	public String toString() {
		return "\nType: "+getClass().getSimpleName()+"\nName: "+getName()+"\nManufacturer: "+getmName()+"\nManufacture year: "+getYear()+"\nTonnage: "+tonnage+"\nOwner: "+getShippingLine()+"\nMax Passenges: "+getMaxPassengers()+"\nTop speed: "+getTopSpeed()+" mph";

	}

}

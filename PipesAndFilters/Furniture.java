package passc;

abstract class Furniture {
	String components;								// furniture components
	
	public int x;
	
	public String operate() {					// adds components to an existing furniture
		return components;
	}
	
 public abstract double cost();					// calculates the time cost of a furniture

}
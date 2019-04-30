package passc1;

abstract class Furniture {
	String components;						// furniture components
	int furniturePriority=1;				// priority used to add a certain operation to chair
    static int nr=0;
	
	public String operate() {
		return components;
	}
	
	public void evolve() {			// using priority to set which functionality can operate on the object
		furniturePriority++;
	}
	
	public void evolve(int i) {    // for package , final stage
		furniturePriority=100;
	}
	
	public String getChair() {
		return "Chair " + ++nr + " in progress";			// how many chairs are in progress
	}
	
	public abstract int chairPriority();
	
	
}
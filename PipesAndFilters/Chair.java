package passc;

class Chair extends Furniture {
	
	
	protected double k;
	public Chair() {
		components = "\tChair\n";				// subset of furniture(chair)
	}
	
	public double cost() {						// cost 0 - no components yet
		return 0;
	}
	
}

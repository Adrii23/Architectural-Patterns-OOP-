package passc1;

class Chair extends Furniture {							// subset of furniture
	
	public Chair() {
		components = "";
	}
	
	public int chairPriority() {						// returns priority of a chair
		return furniturePriority;						// the stage in which a chair is
	}
	
}
package passc1;

class PackageChair extends KnowledgeSource {
	
	public PackageChair(String name) {
		super(name);
	}
	
	public String execAction() {
	   return "Package chair";
	}
	
	public int getPriority() {
		return 5;
	}
	
	public boolean updateBlackboard(Furniture c) {
		if(c.chairPriority()==1 || c.chairPriority()==2)		   // a chair must have at least cut seat and assemble feet								
			return false;
		if(c.chairPriority()>3 && c.chairPriority()<=getPriority()) {	// last operation on chair
			c.components = c.operate() + "  " + execAction();
			c.evolve(100);										// return a priority that cannot add another operation
		 return true;
		} else return false;
	}
	
}
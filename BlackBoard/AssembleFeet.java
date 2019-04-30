package passc1;


class AssembleFeet extends KnowledgeSource {
	
	public AssembleFeet(String name) {
		super(name);
	}
	
	public String execAction() {
	   return "Assemble feet";
	}
	
	public int getPriority() {
		return 2;
	}
	
	public boolean updateBlackboard(Furniture c) {			//priority 2 - must be done second
		if(c.chairPriority()==getPriority()) {
			c.components = c.operate() + "  " + execAction();
			c.evolve();
		 return true;
		} else return false;
	}
	
}

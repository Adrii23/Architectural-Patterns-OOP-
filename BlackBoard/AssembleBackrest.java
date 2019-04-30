package passc1;

class AssembleBackrest extends KnowledgeSource {
	
	public AssembleBackrest(String name) {
		super(name);
	}
	
	public String execAction() {
	   return "Assemble backrest";
	}
	
	public int getPriority() {
		return 3;  
	}
	
	public boolean updateBlackboard(Furniture c) {				// priority 3 - can be a third operation
		if(c.chairPriority()==getPriority()) {					// this operation can be ignored on a chair
			c.components = c.operate() + "  " + execAction();  
			c.evolve();
		 return true;
		} else return false;
	}
	
}

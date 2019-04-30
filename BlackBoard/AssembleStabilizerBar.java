package passc1;

class AssembleStabilizerBar extends KnowledgeSource {
	
	public AssembleStabilizerBar(String name) {
		super(name);
	}
	
	public String execAction() {
	   return "Assemble stabilizer bar";
	}
	
	public int getPriority() {
		return 4;  
	}
	
	public boolean updateBlackboard(Furniture c) {
		if(c.chairPriority()==getPriority()) {						// priority 4 
			c.components = c.operate() + "  " + execAction();		// this operation can be ignored 
			c.evolve();												
		 return true;
		} else return false;
	}
	
}

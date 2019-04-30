package passc1;

class CutSeat extends KnowledgeSource {
	
	public CutSeat(String name) {
		super(name);
	}
	
	public String execAction() {
	   return "Cut Seat";
	}
	
	public int getPriority() {
		return 1;
	}
	
	public boolean updateBlackboard(Furniture c) {
		if(c.chairPriority()==getPriority()) {						//CutSeat has priority 1 . Must be done first to a chair
			c.components = c.operate() + "  " + execAction();
			c.evolve();
		 return true;
		} else return false;
	}
	
}

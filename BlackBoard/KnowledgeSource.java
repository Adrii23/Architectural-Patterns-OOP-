package passc1;

abstract class KnowledgeSource {						// operations on a chair
	
	//KS operates on Blackboard

	protected String name;
	
	public KnowledgeSource(String name) {
		this.name=name;
	}
	
	public abstract String execAction();				// adds action to chair
	public abstract int getPriority();					// current level of priority on chair
	
	public abstract boolean updateBlackboard(Furniture c);    // gets a chair, adds operation to it, updates the blackboard
															  // with the new chair
	public String getWorker() {
		return "" + name + " : " + execAction();			  // a worker operates
	}
	
}
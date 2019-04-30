package passc2;



abstract class Workers {
    
	protected EventBus eventBus;
    protected Chair chair;
    protected String name;
    protected boolean available = true;

    public Workers(String name,EventBus eventBus) {
        this.name=name;
        this.eventBus = eventBus;
    }

    public abstract void operate(Chair chair);

       public boolean isAvailable() {
       return available;
    }
    
}
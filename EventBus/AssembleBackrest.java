package passc2;

class AssembleBackrest extends Workers {

    public AssembleBackrest(String name,EventBus eventBus) {
        super(name,eventBus);
    }
    
    public void operate(Chair chair) {
        chair.setBackrest(true);
        System.out.println("Assemble Backrest is processed and done by " + name);
        this.eventBus.publish(Event.DONE_AB, chair);
        this.available = true;
    }
}

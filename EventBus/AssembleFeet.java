package passc2;

class AssembleFeet extends Workers {

    public AssembleFeet(String name,EventBus eventBus) {
        super(name,eventBus);
    }

    
    public void operate(Chair chair) {
        chair.setFeet(true);
        System.out.println("Assemble Feet is processed and done by " + name);
        this.eventBus.publish(Event.DONE_AF, chair);
        this.available = true;
    }
}

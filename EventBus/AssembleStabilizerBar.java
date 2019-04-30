package passc2;

class AssembleStabilizerBar extends Workers {

    public AssembleStabilizerBar(String name,EventBus eventBus) {
        super(name,eventBus);
    }

    
    public void operate(Chair chair) {
        chair.setStabilizerBar(true);
        System.out.println("Assemble Stabilizer bar is processed and done by " + name);
        this.eventBus.publish(Event.DONE_SB, chair);
        this.available = true;
    }
}

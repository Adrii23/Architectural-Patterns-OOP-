package passc2;

class PackageChair extends Workers {

    public PackageChair(String name,EventBus eventBus) {
        super(name,eventBus);
    }

    
    public void operate(Chair chair) {
        chair.setPacked(true);
        System.out.println("Assemble Packed Chair is processed and done by " + name);
        this.eventBus.publish(Event.DONE_PC, chair);
        this.available = true;
    }
}
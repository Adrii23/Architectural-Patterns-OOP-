package passc2;

class CutSeat extends Workers {

    public CutSeat(String name,EventBus eventBus) {
        super(name,eventBus);
    }

    
    public void operate(Chair chair) {
        chair.setSeat(true);
        System.out.println("Cut Seat is processed and done by " + name);
        this.eventBus.publish(Event.DONE_CS, chair);
        this.available = true;
    }
}

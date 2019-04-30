package passc2;

public class Main {
	
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();

        Workers ion = new CutSeat("Ion",eventBus);
        Workers vasile = new AssembleFeet("Vasile",eventBus);
        Workers petru = new AssembleStabilizerBar("Petru",eventBus);
        Workers gheo = new AssembleBackrest("Gheo",eventBus);
        Workers costi = new PackageChair("Costi",eventBus);

        eventBus.register(ion, Event.INCOMING);
        eventBus.register(vasile, Event.DONE_CS);
        eventBus.register(petru, Event.DONE_AF);
        eventBus.register(gheo, Event.DONE_SB);
        eventBus.register(costi, Event.DONE_AB);
        eventBus.register(costi, Event.DONE_PC);

        eventBus.publish(Event.INCOMING, new Chair());
    }
    
}

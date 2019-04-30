package passc1;

public class Main {
	public static void main(String[] argv) {
		
		Blackboard b = new Blackboard();
		
		KnowledgeSource ion = new CutSeat("Ion");						// adds worker Ion with CutSeat
		b.addWorkers(ion);
		KnowledgeSource vasile = new AssembleFeet("Vasile");			// adds worker Vasile with AssembleFeet
		b.addWorkers(vasile);
		KnowledgeSource viorel = new AssembleFeet("Viorel");			// adds worker Viorel with AssembleFeet
		b.addWorkers(viorel);
		KnowledgeSource petru = new AssembleBackrest("Petru");			// adds worker Petru with AssembleBackrest
		b.addWorkers(petru);
		KnowledgeSource gheo = new AssembleStabilizerBar("Gheo");		// adds worker Gheo with AssembleStabilizerBar
		b.addWorkers(gheo);
		KnowledgeSource costi = new PackageChair("Costi");				// adds worker Costi with PackageChair
		b.addWorkers(costi);
		KnowledgeSource alex = new AssembleBackrest("Alex");			// adds worker Alex with AssembleBackrest
		b.addWorkers(alex);
		
		Furniture c1 = new Chair();
		b.addChairs(c1);
		Furniture c2 = new Chair();
		b.addChairs(c2);
		Furniture c3 = new Chair();
		b.addChairs(c3);
		
		b.showWorkers();					// displays all the workers
		b.showChairs();						// displays all the chairs
		System.out.println();
		b.operateOnChair();					// displays how the blackboard works to operate all the chairs
		
	    
				
	}
}
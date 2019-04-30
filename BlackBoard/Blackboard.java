package passc1;

import java.util.*;

class Blackboard {
	
	private List<Furniture> chairs=new ArrayList<Furniture>();			// a list of chairs
	private List<KnowledgeSource> workers=new ArrayList<KnowledgeSource>();		// a list of workers who operate on chairs
	
	
	public void addWorkers(KnowledgeSource ks) {				// adds functionality
		workers.add(ks);
	}
	
	public void addChairs(Furniture f) {						// adds objects
		chairs.add(f);
	}
	
	public void showWorkers() {									// shows all the workers that operate on that blackboard
		if(workers.isEmpty())
			System.out.println(" No workers at this moment :( ");
				else {
					System.out.println("   Workers :");
					Iterator<KnowledgeSource> it=workers.iterator();
					while(it.hasNext()) 
	    		    System.out.println(it.next().getWorker());
					 }
		}
	
	public void showChairs() {										//shows all chairs that need to be done
		if(chairs.isEmpty())
			System.out.println(" No chairs at this moment :( ");
				else {
					System.out.println("\n   Chairs :");
					Iterator<Furniture> it=chairs.iterator();
					while(it.hasNext()) 
	    		    System.out.println(it.next().getChair());
					 }
		}
	
	public void operateOnChair() {									// adding functionality to an existing chair
		
		//Iterator<KnowledgeSource> itWorker = workers.iterator();
		//Iterator<Furniture> itChairs= chairs.iterator();
		
		    for(int i = 0 ; i < chairs.size() ; i++ )				// for all the chairs that exist in that blackboard
		 	 	while(chairs.get(i).furniturePriority!=100) {		// do the work loop until all of them are at max priority (PackageChair)
		 	 		int k=new Random().nextInt(workers.size());		// generate random worker
		 	 		int l=new Random().nextInt(chairs.size());		// generate random chair
		 	 		int p=l+1;										// the number of the chair we are about to perform
		 	 		System.out.print(workers.get(k).execAction() + " on Chair no. " + p + " - ");
		 	 		
		 	 			if(workers.get(k).updateBlackboard(chairs.get(l)))
		 	 					System.out.println("Success - Chair " + p + " : " + chairs.get(l).components); // success - show that chair no p has added the k functionality to it
		 	 			else 
		 	 					System.out.println(workers.get(k).name + " cannot perform this operation at this point!"); // otherwise - that action cannot be performed to chair due his current stage
	        }
         }
	}

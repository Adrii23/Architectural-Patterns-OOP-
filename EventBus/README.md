The workers are helped by an Event Bus that takes an unfinished chair from a worker that has already finished his operation and take 
the chair to the next worker.  
The Event Bus knows for every worker which operation it has.  
Each worker subscribes to a certain event, where he knows he can interfere.  
The set of events would be : DONE_CS, DONE_AF, DONE_AB, DONE_SB, DONE_PC + INCOMING.  
Publisher/Subscriber - uses the Event Bus to subscribe or publish events and to get notifications from it

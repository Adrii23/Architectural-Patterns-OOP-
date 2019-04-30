# Architectural-Patterns-OOP-
 ** For Pipes and Filters, Blackboard and Event Bus **
 
We simulate the activity of a factory that is producing chairs. The factory has workers for this operations : 

C = Cut seat  
F = Assemble feet   
B = Assemble backrest   
S = Assemble stabilizer bar   
P = Package chair    

Assemble feet and assemble backrest can be done only after the CutSeat operation, assemble stabilizer bar only after assemble feet and package chair can be done once the chair is assembled. Each process takes a certain amount of time.

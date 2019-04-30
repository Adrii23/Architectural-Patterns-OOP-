
The factory uses pipelines to create chairs.  
An example of pipeline with 5 workers would be : Ion:C , Vasile:F, Petru:B, Gheo:S, Costi:P.

Filter (independent between each other) - one has knowledge of only the operation he has to make on a chair  
Pipe (carries data between two consecutive filters) - the only way of communication  

Another pipeline example would be : Ion:C, Petru:B, Vasile:F, Gheo:S, Costi:P.  
If the factory decides to make another type of chair (without backrest for example), the pipeline would be : Ion:C, Vasile:F, Gheo:S, Costi:P  

We assume that the workers work as : Ion=10 min, Petru=15 min, Vasile=40 min, Gheo=20 min, Costi=10 min.

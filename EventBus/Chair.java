package passc2;

class Chair {
	
    private boolean cutSeat;
    private boolean assembleFeet;
    private boolean assembleBackrest;
    private boolean assembleStabilizerBar;
    private boolean packedChair;

    public Chair() {
        this.cutSeat = false;
        this.assembleFeet = false;
        this.assembleBackrest = false;
        this.assembleStabilizerBar = false;
        this.packedChair = false;
    }

    public boolean isDone(){
        if(cutSeat) { 
          if(assembleFeet) {
        	  if(assembleBackrest) {
        		  if(assembleStabilizerBar) {
        			  if(!packedChair)
        				  return true;
        			  else return false;
        		  } else return false;
        	  } else return false;
        } else return false;
    } else return false;
  }
    
    public void setSeat(boolean seat) {
        this.cutSeat = seat;
    }

    public void setFeet(boolean feet) {
        this.assembleFeet = feet;
    }

    public void setBackrest(boolean backrest) {
        this.assembleBackrest = backrest;
    }

    public void setStabilizerBar(boolean stabilizerBar) {
        this.assembleStabilizerBar = stabilizerBar;
    }

    public void setPacked(boolean packed) {
        this.packedChair = packed;
    }

    public String toString() {
        return "\nChair is done !\nCutSeat :  " + cutSeat + "\nAssembleFeet : " + assembleFeet + "\nAssembleBackrest : "
        	+ assembleBackrest + "\nAssembleStabilizerBar : " + assembleStabilizerBar + "\nPackageChair : " + packedChair;
    }
}

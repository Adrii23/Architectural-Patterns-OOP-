package passc;


class CutSeat extends FurnitureDecorator {
	Furniture furniture;
	public CutSeat(String nume,Furniture furniture) {      // name - worker ; furniture - on which we operate
		super(nume);
		this.furniture=furniture;
	}
	
	public String operate() {
		return furniture.operate() + "C : \" Cut Seat \"  : " + nume + "\n" ;   //adding the operation on the chair
	}
	
	public double cost() {
		return furniture.cost() + 10;						// current cost + time cost for this operation
	}
	
}

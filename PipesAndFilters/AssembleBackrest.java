package passc;

class AssembleBackrest extends FurnitureDecorator {
	Furniture furniture;
	public AssembleBackrest(String nume,Furniture furniture) {
		super(nume);
		this.furniture=furniture;
	}
	
	public String operate() {
		return furniture.operate() + "B : \" Assemble Backrest \"  : " + nume + "\n";
	}
	
	public double cost() {
		return furniture.cost() + 15;
	}
	
}

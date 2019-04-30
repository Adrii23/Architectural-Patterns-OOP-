package passc;


class AssembleFeet extends FurnitureDecorator {
	Furniture furniture;
	protected String prim;
	public int k;
	public AssembleFeet(String nume,Furniture furniture) {
		super(nume);
		this.furniture=furniture;
	}
	
	public String operate() {
		return furniture.operate() + "F : \" Assemble Feet \"  : " + nume + "\n";
	}
	
	public double cost() {
		return furniture.cost() + 40;
	}
	
}


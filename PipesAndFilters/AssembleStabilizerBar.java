package passc;

class AssembleStabilizerBar extends FurnitureDecorator {
	Furniture furniture;
	public AssembleStabilizerBar(String nume,Furniture furniture) {
		super(nume);
		this.furniture=furniture;
		
	}
	
	public String operate() {
		return furniture.operate() + "S : \" Assemble Stabilizer Bar \"  : " + nume + "\n";
	}
	
	public double cost() {
		return furniture.cost() + 20;
	}
	
}

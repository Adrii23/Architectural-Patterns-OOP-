package passc;


class PackageChair extends FurnitureDecorator {
	Furniture furniture;
	public PackageChair(String nume,Furniture furniture) {
		super(nume);
		this.furniture=furniture;
	}
	
	public String operate() {
		return furniture.operate() + "P : \" Package Chair \"  : " + nume + "\n";
	}
	
	public double cost() {
		return furniture.cost() + 10;
	}
	
}



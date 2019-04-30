package passc;


class Pipeline {
	
	public void pipeline1(Furniture input) {					// an example of pipeline , creating a chair in this order
		input=new CutSeat("Ion",input);
		input=new AssembleFeet("Vasile",input);
		input=new AssembleBackrest("Petru",input);
		input=new AssembleStabilizerBar("Gheo",input);
		input=new PackageChair("Costi",input);
		System.out.println(input.operate() + " Time cost : " + input.cost()+ " minutes\n");
	}
	
	public void pipeline2(Furniture input) {
		input=new CutSeat("Ion",input);
		input=new AssembleBackrest("Vasile",input);
		input=new AssembleFeet("Petru",input);
		input=new AssembleStabilizerBar("Gheo",input);
		input=new PackageChair("Costi",input);
		System.out.println(input.operate() + " Time cost : " + input.cost() + " minutes\n");
	}
	
	public void pipeline3(Furniture input) {
		input=new CutSeat("Ion",input);
		input=new AssembleFeet("Vasile",input);
		input=new AssembleStabilizerBar("Gheo",input);
		input=new PackageChair("Costi",input);
		System.out.println(input.operate() + " Time cost : " + input.cost() + " minutes\n");
	}
	
}



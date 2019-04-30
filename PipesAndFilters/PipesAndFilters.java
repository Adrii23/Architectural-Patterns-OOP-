package passc;

public class PipesAndFilters {
	public static void main(String[] argv) {
			
			Furniture chair=new ChairPiece(); 				//creating a chair
			Pipeline p=new Pipeline();						//creating a pipeline
			p.pipeline1(chair);								//operating on the chair using a certain pipeline
			p.pipeline2(chair);
			p.pipeline3(chair);
			
				
		
	}
}
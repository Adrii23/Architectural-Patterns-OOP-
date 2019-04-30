package passc;

abstract class FurnitureDecorator extends Furniture {      // using Decorator Design Pattern for creating a chair in a 
																	// certain way dynamically at run time
protected String nume;
public int tentativa;
public abstract String operate();

public FurnitureDecorator(String nume) {			 // every chair has a worker performing a certain operation on it
this.nume=nume;
}

}


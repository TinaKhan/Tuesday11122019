package abstractionOOP;
//An abstract  class can extends one abstract class and implements more than one interface
public abstract class Subway implements LIRR, Metronorth {
	public abstract void ticket();
	public void faster() {
		System.out.println("those train run very fast");
	}

}

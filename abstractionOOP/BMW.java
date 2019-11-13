package abstractionOOP;
// A class can extends one abstract class and implements more than one interface
//Here BMW is a concrete class
public class BMW extends Subway implements Car, Drone {

	@Override
	public void start() {
		System.out.println("bwm start with automatic key");
		
	}

	@Override
	public void stop() {
		System.out.println("bmw stop with automation key");
		
	}

	@Override
	public void brake() {
		System.out.println("bmw has automatic brake");
		
	}

	@Override
	public void shape() {
		System.out.println("spherical");
		
	}

	@Override
	public void ticket() {
		System.out.println("we need ticket to ride");
		
	}

	@Override
	public void westbound() {
		System.out.println("longisland");	
	}

	@Override
	public void fastest() {
		System.out.println("connecticut");
		
	}

}

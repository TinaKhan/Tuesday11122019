package abstractionOOP;
 //control+a
	//shift+control+f
	//A class can implements many interface and extends only one Abstract class
	//Here Toyota is a concrete class 

public class Toyota extends FlyingCar implements Car, ElectricCar {
	
	public void carWeight() {// method can't be declared in Class //method can be implemented in class
		System.out.println("Toyota produce the light weight car");
	}

	public void start() {
		System.out.println("Toyota have key driven start");
	}

     public void stop() {
		
		System.out.println("Toyota have key driven stop");
	}

	public void brake() {
		System.out.println("Toyota have manual break");
		
	}
	public void autoPilot() {
		System.out.println("Toyota doesn't have plan for autopilot right now");
		
	}

	public void battery() {
		System.out.println("Toyota is improving their battery");
		
	}

	public void shape() {
		System.out.println("Toyota have research fund for Drone shape");
		
	}
	
}

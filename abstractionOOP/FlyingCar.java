package abstractionOOP;

public abstract class FlyingCar implements Drone { //abstract class contain abstract and non abstract method
	
	public abstract void autoPilot(); //abstract method - method declared,not implemented
	
	public void flyingFeature() { //non abstract method - method implemented
		System.out.println("Flying car have flying feature, it can fly");
	}

}

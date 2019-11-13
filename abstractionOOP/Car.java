package abstractionOOP;

public interface Car {
	
	public abstract void start(); //method can be declared in interface //we can avoid writing abstract inside it
	public void stop();//method can't be implemented in interface
	public void brake();//by default all the methods are abstract method
	//from java 8, they introduce 2 type of method which are implemented in interface
	public default void honk() { //if we use default keyword then method must be implemented, or can't be declared
		System.out.println("Every car must have honk");
	}
	public static void gear() { //static method can't be declared, must be implemented
		System.out.println("Gear must be in 4 type");
	
	}
	
	//need to add 2 more method tomorrow

}

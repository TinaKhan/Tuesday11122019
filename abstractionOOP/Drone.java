package abstractionOOP;

public interface Drone {
    public void shape();
    public default void colorOfDrone() {
    	System.out.println("silver color");
	}
    public static void price() {
    	System.out.println("very expensive");
	}
}

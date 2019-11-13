package abstractionOOP;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota(); //Interface Cannot be instantiated
        car.start();
        car.stop();
        car.brake();
        car.honk();
        //Car.gear();
        //Car.gear(); //when a method or variable is static, we don't need an object to call them
        //a class or interface can directly call it
        
        Car car1 = new BMW();
        car1.start();
        car1.stop();
        car1.brake();
        car1.honk();
        Car.gear();
        
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.brake();
        bmw.honk();
        //static method can not be implemented by a class.
        bmw.colorOfDrone();
        bmw.shape();
        bmw.faster();
        bmw.ticket();
        bmw.fastest();
        bmw.westbound();
        
        
        
        Drone dr = new BMW();
        dr.shape();
        dr.colorOfDrone();
        Drone.price();
        
        Subway sw = new BMW();
        sw.faster();
        sw.ticket();
        sw.fastest();
        sw.westbound();
        
        LIRR lr = new BMW();
        lr.westbound();
        
        Metronorth mn = new BMW();
        mn.fastest();
        
        
        
        
        
        
       
        Toyota ty = new Toyota();
        ty.start();
        ty.stop();
        ty.brake();
        
        ty.carWeight();
        
        ty.autoPilot();
        ty.flyingFeature();
        
        ty.battery();
        
        ty.battery();
        
        
        FlyingCar fc = new Toyota(); //Abstract class Cannot be instantiated
        
        fc.autoPilot();
        fc.flyingFeature();
        
        ElectricCar ec = new Toyota();
        ec.battery();
        
        Drone dr2 = new Toyota();
        dr2.shape();
        
       	}
        
//        Car car2 = new Marcedes();
//        car2.start();
//        car2.stop();
//        car2.brake();
//        
//        Marcedes ms = new Marcedes();
//        ms.start();
//        ms.stop();
//        ms.brake();
//        ms.betterEngine();
        
       

}

abstract class Vehicle{
	public abstract int getNoOfWheels();
}
class Car extends Vehicle{
	
	@Override
	public int getNoOfWheels(){
		return 4;
	}
}
class Bike extends Vehicle{

	@Override
	public int getNoOfWheels(){
		return 2;
	}
}
class Auto extends Vehicle{

	@Override
	public int getNoOfWheels(){
		return 3;
	}
} 
public class AbstractionExample{
	public static void main(String[] args) {
		
		Car car = new Car();
		Bike bike = new Bike();
		Auto auto = new Auto();

		System.out.println("\nCar has   : "+car.getNoOfWheels()+" wheels.");
		System.out.println("Bike has   : "+bike.getNoOfWheels()+" wheels.");
		System.out.println("Auto has   : "+auto.getNoOfWheels()+" wheels.");
	}
}
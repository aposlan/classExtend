package classextend;

public class Car extends Vehicle{
	int seats;
	
	public Car(String model, String brand, int year, int hp, double price, int seats) {
		super(model, brand, year, hp, price);
		this.seats = seats;
	}

}
package classextend;

public class Motorcycle extends Vehicle{
	String tacts;
	public Motorcycle(String model, String brand, int year, int hp, double price, String tacts) {
		super(model, brand, year, hp, price);
		this.tacts = tacts;
	}
	
}

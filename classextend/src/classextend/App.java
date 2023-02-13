package classextend;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Car c1 = new Car("Z350", "Nissan", 2007, 200, 20000, 4);
		Motorcycle m1 = new Motorcycle("Duke", "KTM", 2010, 20, 1500, "4-tact");
		
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(c1);
		vehicles.add(m1);
		
	}

}

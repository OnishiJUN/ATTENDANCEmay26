
public class ToyotaVios extends vehicle {
	
	//Child class of vehicles or parent class
	String name = "ToyotaVios";
	String tire = "The car comes with the 15″ tire size of 185/60R15.\n";
	String drive = "The car to maximum of 171 km/h. It took 12 seconds for the Vios to reach 100 kph.\n";

	void car() {
		 
		 System.out.println(color);
		 System.out.println(price);
		 System.out.println(speed);
	 }
	@Override
	void run() {
		System.out.println("Car Drive");
	}
	void stop() {
		System.out.println("Vehicle Stop");
		
	}
}

 
 
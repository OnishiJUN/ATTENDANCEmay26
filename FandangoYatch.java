		
public class FandangoYatch extends vehicle {
	//Child class of vehicles or parent class
	String name2 = "Fandango Yatch";
	String sail = "The main sail of the Yatch is 11 meters height and width is 4 meters.\n";
	String knots = "The Yatch top speed of 18 kn. The yacht carries 26,700 litres of fuel on board.\n";
	
	
	void boat() {
		System.out.println(color2);
		System.out.println(price2);
		System.out.println(speed2);
	}
	@Override
	void run() {
		System.out.println("Boat Float");
	}
	void stop() {
		System.out.println("Boat Stop");
		
	}
}


public class U2SpyPlane extends vehicle  {
	//Child class of vehicles or parent class
	String name1 = "U2 Spy Plane";
	String wings = "The wings span of U2SpyPlanen has 31 meters.\n";
	String air = "The U2 Spy Plane is flying at 805Km/h and used for spying enemy location.\n";
	
	void plane() {
		
		System.out.println(color1);
		System.out.println(price1);
		System.out.println(speed1);
	}
	@Override
	void run() {
		System.out.println("Plane Fly");
	}
	void stop() {
		System.out.println("Plane Landed");
		
	}
}

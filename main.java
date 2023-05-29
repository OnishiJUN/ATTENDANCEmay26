
public class main {

	public static void main(String[] args) {
		
		// Main program and display the following inputs
		ToyotaVios obj = new ToyotaVios ();
		System.out.println("==============================");
		System.out.println(obj.name);
		System.out.println("==============================\n");
		System.out.println(obj.tire);
		System.out.println(obj.drive);
		obj.car();
		obj.run();
		obj.stop();
		
		U2SpyPlane obj1 = new U2SpyPlane();
		System.out.println("==============================");
		System.out.println(obj1.name1);
		System.out.println("==============================\n");
		System.out.println(obj1.wings);
		System.out.println(obj1.air);
		obj1.plane();
		obj1.run();
		obj1.stop();
		
		FandangoYatch obj2 = new FandangoYatch();
		System.out.println("==============================");
		System.out.println(obj2.name2);
		System.out.println("==============================\n");
		System.out.println(obj2.sail);
		System.out.println(obj2.knots);
		obj2.boat();
		obj2.run();
		obj2.stop();
	}

}

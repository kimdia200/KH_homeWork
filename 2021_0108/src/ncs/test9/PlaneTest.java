package ncs.test9;

public class PlaneTest {
	public static void main(String[] args) {
		Airplane a = new Airplane("L747",1000);
		Cargoplane b = new Cargoplane("C40",1000);
		
		System.out.println("Plane              fuelSize\r\n" + 
				"----------------------------- ");
		System.out.println(a.getPlaneName()+"\t\t\t"+a.getFuelSize());
		System.out.println(b.getPlaneName()+"\t\t\t"+b.getFuelSize());
		
		System.out.println("100 운항");
		a.flight(100);
		b.flight(100);
		
		System.out.println("Plane              fuelSize\r\n" + 
				"----------------------------- ");
		System.out.println(a.getPlaneName()+"\t\t\t"+a.getFuelSize());
		System.out.println(b.getPlaneName()+"\t\t\t"+b.getFuelSize());

		System.out.println("200주유");
		a.refuel(200);
		b.refuel(200);
		System.out.println("Plane              fuelSize\r\n" + 
				"----------------------------- ");
		System.out.println(a.getPlaneName()+"\t\t\t"+a.getFuelSize());
		System.out.println(b.getPlaneName()+"\t\t\t"+b.getFuelSize());
		
		
	}
}

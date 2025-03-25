
public class Facility {
	public static void show(Vehicle v1) {
		v1.start();
	}
	public static void main(String...args) {
		Car c1=new Car();
		Bike b1=new Bike();
		Aeroplane a1=new Aeroplane();
		show(c1);
		show(b1);
		show(a1);
	}
}

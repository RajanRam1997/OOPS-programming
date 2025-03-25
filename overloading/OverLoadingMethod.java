
public class OverLoadingMethod {
	public static void area(int len,int bre) {
		System.out.println("Area of Rectangle :"+len*bre);
	}
	public static void area (float radius) { 
	System.out.println("Area of Circle :"+(3.14*radius*radius));
	}
	public static void main(String[]args) {
		area(2,3);
		area(50.90f);
	}
}
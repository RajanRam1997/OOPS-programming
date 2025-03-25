
public class Volume {
	public static void volume(int len,int bre,int height) {
		System.out.println("The Volume of Rectangle :"+len*bre*height);
	}
	public static void volume(float radius,float height) {
		System.out.println("The Volume of Cylinder :"+3.14*radius*radius*height);
	}
	public static void volume(float radius) {
		System.out.println("The volume of Sphere :"+((5f/4f)*3.14*radius*radius*radius));
	}
	public static void main(String...args) {
		volume(5,9,6);
		volume(5,7,6);
		volume(4.5f,5.3f);
	}
}
	


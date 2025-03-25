//overloading
public class Calculater{
	public static void sum(int a,int b) {
		System.out.println("The sum of two int number :" +(a+b));
	}
	public static void sum(String a, String b ) {
		System.out.println("The sum of Two String Number :"+(a+b));
	}
	public static void sum(float a,float b,float c) {
		System.out.println("The sum of all float number"+(a+b+c));
	}
	public static void main(String... Arguments) {
		sum(12,50);
		sum("HELLO","RAJAN");
		sum(50.50f,60.50f,40.20f);
	}
}

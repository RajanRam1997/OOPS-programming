
public class Main {
	public static void main(String[]args) {
		//to call the methods form any class
		//we have to create an object of the class
		//ClassName objectname=new ClassName();
		Student s1 =new Student();
		s1.setRoll(205);
		s1.setName("rajan ram");
		s1.setMarks(65);
		
		System.out.println("Student Roll No:"+s1.getRoll());
		System.out.println("Student Roll No:"+s1.getName());
		System.out.println("Student Roll No:"+s1.getMarks());
	}
}

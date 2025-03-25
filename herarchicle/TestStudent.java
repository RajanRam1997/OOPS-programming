
public class TestStudent {
	public static void main(String ...args) {
		SchoolStudent s1=new SchoolStudent();
		s1.setRoll(102);
		s1.setName("Rajan Ram");
		s1.setStd(9);
		s1.setMarks(85);
		CollegeStudent s2=new CollegeStudent();
		s2.setRoll(45);
		s2.setName("RamBabu Ram");
		s2.setYear(4);
		s2.setStream("Science");
		s2.setMarks(65);
		System.out.println("SchoolStudent Infromation");
		System.out.println("Roll :"+s1.getRoll());
		System.out.println("Name :"+s1.getName());
		System.out.println("Std :"+s1.getStd());
		System.out.println("Marks :"+s1.getMarks());
		System.out.println("CollegeStudent Infromation");
		System.out.println("Roll :"+s2.getRoll());
		System.out.println("Name :"+s2.getName());
		System.out.println("Year :"+s2.getYear());
		System.out.println("Stream :"+s2.getStream());
		System.out.println("Marks :"+s2.getMarks());
	}
}



public class Doctor {
	int id;
	String name;
	static String hospitalname;
	static void setHospitalName() {
		hospitalname="Super Specilist Hospital";
	}
	Doctor(int did,String dname){
		this.id=did;
		this.name=dname;
	}
	public String toString() {
		return("Doctor Id :"+id)+
				("Doctor Name :"+name)+("Hospital Name :"+
				hospitalname);
	}
	public static void main(String...args ) {
		Doctor.setHospitalName();
		Doctor d=new Doctor(104,"Vidut Patel");
		Doctor d1=new Doctor(105,"Abhishek Kamble");
		System.out.println(d);
		System.out.println(d1);
	}
}

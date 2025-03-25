
public class Medicine {
	String name;
	float price;
	Medicine(){   //default constructor
		this("d-cold total",20.0f);
	}
	//the different way to write to call constructor
	Medicine(String name){
		this(name,20.0f);
	}
	Medicine(String name,float price){
		this.name=name;
		this.price=price;
		
	}
	public String toString() {
		return"Medincine Name :"+name+"Medicine Price"+price;
	}
	public static void main(String args[]) {

		Medicine m1=new Medicine();
		System.out.println(m1);
	}
}

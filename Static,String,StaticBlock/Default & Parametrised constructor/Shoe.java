
public class Shoe {
	String Bname;
	String color;
	int size;
	int price;
	Shoe(String b,String c,int s,int p){
		Bname=b;
		color=c;
		size=s;
		price=p;
	}
	public void showData() {
		System.out.println("Brand Name :" +Bname);
		System.out.println("Shoe Color :" +color);
		System.out.println("Shoe size :" +size);
		System.out.println("Shoe price:" +price);
	}
	public static void main(String[]args) {
		Shoe s1=new Shoe("WoodLand","Tan",8,5550);
		s1.showData();
	}
}

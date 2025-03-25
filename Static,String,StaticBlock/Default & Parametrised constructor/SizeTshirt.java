
public class SizeTshirt {
	String Bname;
	String color;
	int size;
	int price;
	SizeTshirt(String b,String c,int s,int p){
		Bname=b;
		color=c;
		size=s;
		price=p;
	}
	public void showData() {
		System.out.println("Brand Name :" +Bname);
		System.out.println("TShirt Color :" +color);
		System.out.println("TShirt size :" +size);
		System.out.println("TShirt price:" +price);
	}
	public static void main(String[]args) {
		SizeTshirt t1=new SizeTshirt("Jockey","Gray",38,550);
		t1.showData();
	}
}

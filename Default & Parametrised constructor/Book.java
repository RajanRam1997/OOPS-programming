
public class Book {
	int bid;
	String title;
	String aname;
	int price;
	Book(){
		bid=976312;
		title="HOW TO DEVELOP SELF-CONFIDENCE&INFLUENCE PEOPLE BY PUBLIC SPEAKING";
		aname="DALE CARNEGIE";
		price=450;
	}
	public String toString() {
		return"Book ID:"+bid+"Title:"+title+"Aurther Name:"+aname+"Book Price"+price;
	}
		public void showData() {
			System.out.println("Book Id:"+bid);
			System.out.println("Title:"+title);
			System.out.println("Aurther Name:"+aname);
			System.out.println("Book Price:"+price);
			}
		public static void main(String[]args) {
			Book b1=new Book();
			b1.showData();
			System.out.println(b1.toString());
		}
}

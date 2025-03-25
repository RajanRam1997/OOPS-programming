
public class NoteBook {
	String cname;
	int page;
	float price;
	NoteBook(){
		this("ClassMate",250,50.50f);
	}
	NoteBook(String cname,int page,float price){
		this.cname=cname;
		this.page=page;
		this.price=price;
	}
	/*public void setData() {
		this.cname="Classmate";
		this
	}*/
	public String toString() {
		return"ClassMate :"+cname+"No of Page :"+page+"Price"+price;
	}
	public static void main(String[]args) {
		NoteBook n1=new NoteBook();
		System.out.println(n1);
	}
}

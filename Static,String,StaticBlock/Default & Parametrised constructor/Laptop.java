
public class Laptop {
	String lcn;
	String pro;//Processer
	int price;
	int ramsize;
	int harddisk;
	Laptop(){
		lcn="Dell";
		pro="IntelCoreProcesser";
		price=35000;
		ramsize=12;
		harddisk=1024;
	}
	Laptop(String l,String p,int pr,int rs,int hd){
		lcn=l;
		pro=p;
		price=pr;
		ramsize=rs;
		harddisk=hd;
	}
	public void showData() {
	System.out.println("Laptop Company Name:"+lcn);
	System.out.println("Processer Name:"+pro);
	System.out.println("Laptop Price:"+price);
	System.out.println("Laptop Ram Size:"+ramsize);
	System.out.println("Laptop HardDisk:"+harddisk);
	}
	public String toString() {
		return"Laptop Company Name:"+lcn+"Processer Name:"+pro+"Laptop Price:"+price+
		"Laptop Ram Size:"+ramsize+"Laptop HardDisk:"+harddisk;
	}
	public static void main(String[]args) {
	Laptop l1=new Laptop();
	Laptop l2=new Laptop("HP","IntelCoreProcesser",40000,16,1024);
	l1.showData();
	l2.showData();
	System.out.println(l1.toString());
	System.out.println(l2.toString());
	}
}

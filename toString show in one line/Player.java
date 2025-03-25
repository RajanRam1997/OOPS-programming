
public class Player {
	int pid;
	String name;
	String country;
	/*Player(){
		pid=13;
		name="Dhoni";
		country="India";	
	}*/
	Player(int p,String n,String c){
		pid=p;
		name=n;
		country=c;
	}
	public void showData() {
	System.out.println("Player Id:"+pid);
	System.out.println("Player Name:"+name);
	System.out.println("Player Country Name:"+country);
	}
	public String toString() {
		return"Player ID:"+pid+"Player Name:"+name+"Player Country:"+country;
	}
	public static void main(String[]args) {
	//Player p1=new Player();
	Player p2=new Player(5,"Dhoni","India");
	//p1.showData();
	p2.showData();
	//System.out.println(p1.toString());
	System.out.println(p2.toString());
	}
}


	class Elephant{
		void eat() {
			System.out.println("Elephant Eat Sugercane.");
		}
	}
	class ElephantChiled extends Elephant{
		void walk() {
			System.out.println("Elephant Chiled Wlking into the Jungle.");
		}
	}
	class ElephantFather extends ElephantChiled{
		void rest() {
			System.out.println("Elephant Father Resting in Water.");
		}
	}
	class ElephantMother extends ElephantFather{
		void waiting() {
			System.out.println("ElephantMother Waiting to his Father to Come from to under Water.");
		}
	}
	public class ExampleInh {
	public static void main(String... args) {
		ElephantMother e1=new ElephantMother();
		e1.eat();
		e1.walk();
		e1.rest();
		e1.waiting();
	}
	}

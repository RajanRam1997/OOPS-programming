// Base class
	class Animal{
    void eat() {
        System.out.println("This animal eats food.");
    }
	}
// Intermediate class inheriting from Animal
class Mammal extends Animal{
    void walk() {
        System.out.println("This mammal walks on four legs.");
    }
}

// Derived class inheriting from Mammal
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class BabyDog extends Dog{
	void child() {
		System.out.println("Drink Milk");
	}
}
class MultilevelInheritance {
// Main class to demonstrate multilevel inheritance
    public static void main(String[] args) {
       BabyDog myDog = new BabyDog();
        
        // Calling methods from all levels of the hierarchy
        myDog.eat();   // Method from Animal class
        myDog.walk();  // Method from Mammal class
        myDog.bark();  // Method from Dog class
        myDog.child(); //Method from BabyDog class
    }
}
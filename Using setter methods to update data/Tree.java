public class Tree {
    int id;
    String name;
    float height;

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for height
    public void setHeight(float height) {
        this.height = height;
    }

    // Constructor to initialize Tree object
    Tree(int id, String name, float height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    // Method to reset data (optional demonstration)
    public void setData() {
        this.id = 15;
        this.name = "Mango";
        this.height = 50.60f;
    }

    // Method to display tree details
    public void showData() {
        System.out.println("Tree ID: " + id);
        System.out.println("Tree Name: " + name);
        System.out.println("Tree Height: " + height + " meters");
    }

    // Main method
    public static void main(String... args) {
        // Creating a Tree object using the constructor
        Tree t1 = new Tree(12, "Guava", 30.20f);
        Tree t2 = new Tree(20, "Mango", 50.20f);
        t1.showData();
        t2.showData();

        /*// Using setter methods to update data
        System.out.println("\nUpdating tree data using setter methods...");
        t1.setId(20);
        t1.setName("Banana");
        t1.setHeight(25.75f);
        t1.showData();*/

       // Resetting data using setData method
        System.out.println("\nResetting tree data using setData method...");
        t1.setData();
        t1.showData();
    }
}
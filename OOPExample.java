// Abstract class (Abstraction)
abstract class Animal {
    String name; // Instance variable (Encapsulation)

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void displayInfo() {
        System.out.println("Animal: " + name);
    }
}

// Dog class (Inheritance - Dog is an Animal)
class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name); // Call parent class constructor
    }

    // Implement abstract method (Polymorphism - method overriding)
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Main class
public class OOPExample {
    public static void main(String[] args) {
        // Create object (Encapsulation & Abstraction)
        Dog myDog = new Dog("Buddy");

        // Call methods
        myDog.displayInfo(); // Access parent class method
        myDog.makeSound(); // Access overridden method
    }
}

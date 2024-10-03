package Java_Programming;

// Defining an interface
interface Animal {
    void eat(); // Abstract method
    void sound(); // Abstract method
}

// Implementing the interface in a class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Implementing the interface in another class
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Creating a Dog object
        Animal cat = new Cat(); // Creating a Cat object

        // Calling methods on the Dog object
        dog.eat();
        dog.sound();

        // Calling methods on the Cat object
        cat.eat();
        cat.sound();
    }
}

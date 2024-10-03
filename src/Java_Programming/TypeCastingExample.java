package Java_Programming;

// Define the Creature class
class Creature {
    void makeSound() {
        System.out.println("Creature sound");
    }
}

// Define the Cat class that extends Creature
class Bird extends Creature {
    @Override
    void makeSound() {
        System.out.println("Bird Sound");
    }
}

public class TypeCastingExample {
    public static void main(String[] args) {
        Creature creature = new Bird(); // Upcasting
        creature.makeSound(); // Calls Cat's makeSound method

        // Downcasting
        Bird b1 = (Bird) creature; // Explicit downcasting
        b1.makeSound(); // Calls Cat's makeSound method

        // Demonstrating ClassCastException
        // Uncommenting the following lines will throw ClassCastException at runtime
        // Creature anotherCreature = new Creature();
        // Cat anotherCat = (Cat) anotherCreature; // This would throw ClassCastException
    }
}

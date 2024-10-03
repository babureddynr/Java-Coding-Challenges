package Java_Programming;

// Base class
class Irtc {
    void bookYourTicket() {
        System.out.println("Your ticket is successfully booked.\nThank you for choosing us!");
    }
}

// Subclass
class SpecialIrtc extends Irtc {
    @Override
    void bookYourTicket() { // Overriding the method
        System.out.println("Your special ticket is successfully booked.\nThank you for choosing our premium service!");
    }
}

// Main class
public class BookmyTicket {
    public static void main(String[] args) {
        Irtc t1 = new Irtc(); // Reference of the base class
        Irtc t2 = new SpecialIrtc(); // Reference of the base class pointing to a subclass object

        // Method calls demonstrating runtime polymorphism
        Customer.ticket1(t1); // Calls Irtc's bookYourTicket
        Customer.ticket1(t2); // Calls SpecialIrtc's bookYourTicket
    }
}

// Customer class
class Customer {
    static void ticket1(Irtc c1) {
        c1.bookYourTicket(); // This will call the overridden method if c1 is a SpecialIrtc object
    }
}

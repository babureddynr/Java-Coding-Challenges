package Java_Programming;



//Define an abstract class
abstract class Shape {
 // Abstract method (does not have a body)
 abstract void draw();

 // Concrete method
 void display() {
     System.out.println("This is a shape.");
 }
}

//Subclass that extends the abstract class
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a circle.");
 }
}

//Another subclass that extends the abstract class
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a rectangle.");
 }
}

public class AbstractionExample {
 public static void main(String[] args) {
     Shape circle = new Circle(); // Creating a Circle object
     circle.draw(); // Calls the draw method for Circle
     circle.display(); // Calls the display method

     Rectangle r1 = new Rectangle(); // Creating a Rectangle object
     r1.draw(); // Calls the draw method for Rectangle
     r1.display(); // Calls the display method
 }
}

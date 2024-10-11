package Guess_OutPut;
interface MyInterface1
{
	default void defaultmethod()
	
	{
		System.out.println("default method");
	}
	static void staticmethod()
	{
		System.out.println("static method");
	}
}
public class Interface_Example  implements MyInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyInterface1.staticmethod();
Interface_Example m1= new Interface_Example();
m1.defaultmethod();

	}

}

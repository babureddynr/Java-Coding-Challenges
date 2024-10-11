package Guess_OutPut;

@FunctionalInterface
interface MyInterface
{
	void execute();
}
public class FuntionInterfaceExample {

	public static void main(String[] args) {
		MyInterface fun= ()->System.out.println("funtion interface");
		fun.execute();
	}

}

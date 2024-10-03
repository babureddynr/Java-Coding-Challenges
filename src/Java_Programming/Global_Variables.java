package Java_Programming;

public class Global_Variables {
	static int a=10;
	static int b=10;
	int add()
	{
		return a+b;
	}
	
public static void main(String[] args) {
	Global_Variables g1= new Global_Variables();
	System.out.println(g1.add());
}
}

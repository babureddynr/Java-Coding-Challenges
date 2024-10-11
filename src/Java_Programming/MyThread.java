package Java_Programming;

public class MyThread  extends Thread{

	public void run()
	
	{
		for(int i=0; i<=100; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

}

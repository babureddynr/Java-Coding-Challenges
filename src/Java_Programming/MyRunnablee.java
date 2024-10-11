package Java_Programming;

public class MyRunnablee implements Runnable {
	public void run()
	{
		for(int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
		System.out.println("Runnable is started");
	}
	public static void main(String[] args) {
		Thread t1= new Thread(new MyRunnablee());
		t1.start();
				
	}

}

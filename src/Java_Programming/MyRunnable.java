package Java_Programming;

public class MyRunnable implements Runnable {

	public void run()
	{
		try {
			Thread.sleep(1000);
			System.out.println("Wake up after a 1 second");
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
	}
}

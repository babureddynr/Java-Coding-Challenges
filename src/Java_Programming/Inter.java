package Java_Programming;

interface Sample {

	void dips();

	void sample();
}

class Sample2 implements Sample {

	public void dips() {
		System.out.println("i am using disp method");

	}

	public void sample() {
		System.out.println("i am using sample method");
	}

}

public class Inter {
	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		System.out.println();
		s2.dips();
		s2.sample();

	}
}

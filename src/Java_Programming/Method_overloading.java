package Java_Programming;

public class Method_overloading {

	void send(int no) {
		System.out.println("send phone number");
	}

	void send(String txt) {
		System.out.println("send text message");
	}

	void send(int no, String txt) {
		System.out.println("send both text numbers");
	}

	void send(String txt, int no) {
		System.out.println("send txt and numbers");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading m1 = new Method_overloading();
		m1.send(11);
		m1.send("hi", 111);
		m1.send(1010, "jello");
		m1.send("hello i am sending txt");

	}

}

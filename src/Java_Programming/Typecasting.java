package Java_Programming;

class Whatsapp {
	void payemt() {
		System.out.println("Send payemt through the number");
	}
}

class Whatsapp_v2 extends Whatsapp {
	void payemt() {
		System.out.println("Send payemt through scanner");
		super.payemt();
	}
}

public class Typecasting {
	public static void main(String[] args) {
		Whatsapp_v2 v2 = new Whatsapp_v2();
		v2.payemt();

	}
}

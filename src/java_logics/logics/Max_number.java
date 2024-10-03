package java_logics.logics;

class Payement {
	void payement() {
		System.out.println("pay with phone number");
	}
}

class Payement2 extends Payement {
	@Override
	void payement() {
		System.out.println("pay with both payemt and upi");
		super.payement();
	}
}

public class Max_number {

	public static void main(String[] args) {

		Payement2 p2 = new Payement2();
		p2.payement();
	}

}

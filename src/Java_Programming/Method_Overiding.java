package Java_Programming;

class Facebook_V1 {
	void send() {
		System.out.println("send photos only");
	}
}

class Facebook_V2 extends Facebook_V1 {
	@Override
	

	void send()

	{

		System.out.println("send both images and videos");
	}

}

public class Method_Overiding {

	public static void main(String[] args) {
	Facebook_V2 v2 = new Facebook_V2();
	v2.send();
	}

}

package Java_Programming;

class Facebook {
	private String pwd = "Babu123@";

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Facebook f1 = new Facebook();
		System.out.println(f1.getpwd());
		f1.setpwd("new password");
		System.out.println(f1.getpwd());
	}

}

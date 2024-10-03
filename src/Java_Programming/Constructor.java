package Java_Programming;

public class Constructor 
{
	int id;
	String name;
	String address;
	Constructor(int id, String name, String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		System.out.println(id+" "+name+" "+address);
		
	}
	

	public static void main(String[] args) {
	Constructor c1= new Constructor(12, "reddy", "nmp halli village");
	

	}

}

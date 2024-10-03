package Java_Programming;

class Book {
	void details() {
		String name = "rich dad poor dad";
		int price = 100;
		System.out.println(name + "" + price);
	}
}

class Author extends Book {
	void publisher() {
		String author = "abc";
		String publisher = "amazon";
		System.out.println(author + "" + publisher);
	}
}

public class Upcasting_Downcasting {

	public static void main(String[] args) {
		Book b1 = new Author();

//b1.details();
		Author a1 = (Author) b1;
		a1.details();
		a1.publisher();
	}

}

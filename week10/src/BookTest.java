
public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book("Romeo & Juliet", 1580495788, 2004, 5.51,
				"Williams Shakespeare",480);
		Book b2 = new Book("Going Home", 1231441, 1999, 10.98, "Danielle Steele", 280);
		
		Book b3 = b1;
		System.out.println(b1+"\n"+b2+"\n"+b3);
		
		System.out.println("Are they the same book? "+b1.equals(b2));
		System.out.println("Are they the same book? "+b1.equals(b3));
	}
}

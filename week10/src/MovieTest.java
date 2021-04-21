
public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie("Lord Of Rings", 2001, 74.99, "J. R. R. Tolkien" );
		System.out.println(m1 +"\n"+m2);
		m1.setTitle("Men in Black");
		boolean  answer = m1.equals(m2);
		System.out.println(answer);
		
		m2.getMovieQuote();
		m2.priceChange();
		
		Movie.moviesCreated();
	}
}

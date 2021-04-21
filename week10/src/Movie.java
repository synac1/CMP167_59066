/**
 * 
 * @author yanil_jjrab3j
 * desc: week 10 exercise
 */
public class Movie {
	private String title;
	private int year;
	private double price;
	private String directorName;
	private static int moviesCreated;
	
	public Movie() {
		this("", 1900, 0.00, "");
	}
	public Movie ( String title, int year, double price, String directorName) {
		this.title = title;
		this.year  = year;
		this.price = price;
		this.directorName = directorName;
		moviesCreated++;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	//getter
	public String getTitle() {
		return title;
	}
	public int getYear() {
		return year;
	}
	public double getPrice() {
		return price;
	}
	public String getDirectorName() {
		return directorName;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( obj instanceof Movie) {
			Movie otherMovie = (Movie) obj;
			return (title.equals(otherMovie.title)
					&& year == otherMovie.year
					&& Math.abs(price -otherMovie.price)< .000001
					&& directorName.equals(otherMovie.directorName));
		}
		return false;
	}
	@Override
	public String toString() {
		String output = String.format("This movie %s came out in %d, the director is %s, and price is %.2f", title, year, directorName, price);
		return output;
	}
	
	public void getMovieQuote() {
		System.out.println("Not all who wanders is lost");
	}
	public void priceChange() {
		double value = Math.random();
		if (value < .5) {
			this.price--;
		}else {
			this.price++;
		}
		System.out.println("Price changed to "+price);
	}
	public static void moviesCreated() {
		System.out.println(moviesCreated);
	}

}

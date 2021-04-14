/**
 * 
 * @author yanil_jjrab3j
 * desc: Book Class example
 * created: 4.14.21
 * 
 **/
public class Book {
	private String title;
	private int isbn;
	private int yearPublished;
	private double price;
	private String author;
	private int pages;
	
	public Book(String title, int isbn, int yearPublished, double price, String author, int pages) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.yearPublished = yearPublished;
		this.price = price;
		this.author = author;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getisbn() {
		return isbn;
	}

	public void setisbn(int isbn) {
		this.isbn = isbn;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", yearPublished=" + yearPublished + ", price=" + price
				+ ", Author=" + author + ", pages=" + pages + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if ( this == obj) {
			return true;
		}
		if(obj instanceof Book) {
			Book otherBook = (Book) obj;
			if (author.equals(otherBook.author)
					&& title.equals(otherBook.title)
					&& isbn==otherBook.isbn
					&& yearPublished==otherBook.yearPublished
					&& Math.abs(price-otherBook.price)<.00001
					&& pages==otherBook.pages) {
				return true;
			}
		}
		return false;
	}
}

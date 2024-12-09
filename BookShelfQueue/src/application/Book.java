package application;

public class Book {
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
		
		public String getTitle() {
			return this.title;
		}
		public String getAuthor() {
			return this.author;
		}
		
		public int getYear() {
			return this.year;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public void setAuthor(String author) {
			this.author = author;
		}
		
		public void setYear(int year) {
			this.year = year;
		}

		//need to use polymorphism to create a redefined version of equals
		
		public boolean equals(Object o) {
				Book b = (Book)o;
		
		if(this.author.equalsIgnoreCase(b.getAuthor()) && this.title.equalsIgnoreCase(b.getTitle()))
			return true;
		else
			return false;
		}
		
		public String toString() {
			return "The book " + this.title + "written by " + this.author
					+ "was published in " + this.year + "\n";
		}
	}



package application;

import util.*;
import java.util.Scanner;

public class BookShelfLinked {
	LinkedQueue<Book> bookQueue;

	public BookShelfLinked() {
		bookQueue = new LinkedQueue<Book>();
		int num;
		inputBooks();
		displayQueue();
	}

	public void inputBooks() {
		Scanner scan = new Scanner(System.in);
		String title, author;
		int pubYear;
		Book aBook;

		for (int num = 1; num <= 3; num++) {
			System.out.print("Enter the title of the book: ");
			title = scan.nextLine();

			System.out.print("Enter the name of the author of the book: ");
			author = scan.nextLine();

			System.out.print("Enter the publishing year of the book: ");
			pubYear = scan.nextInt();
			scan.nextLine();
			
			aBook = new Book(title, author, pubYear);
			bookQueue.enqueue(aBook);
		}
	}

	public void displayQueue() {
		Book aBook;
		while(!bookQueue.isEmpty()) {
			System.out.println("Displaying the contents of the queue... ");
			aBook = (Book) bookQueue.first();
			System.out.println(aBook.getTitle());
			bookQueue.dequeue();
		}
	}

	public static void main(String[] args) {
		new BookShelfLinked();
	}
}
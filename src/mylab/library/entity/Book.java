package mylab.library.entity;

import java.time.LocalDate;

public class Book extends Object {
	private String title;
	private String author;
	private String ISBN;
	private LocalDate releaseDate;
	private boolean isCheckOut;
	
	public Book() {
		
	}
	
	public Book(String title, String author, String ISBN, LocalDate releaseDate, boolean isCheckOut) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.releaseDate = releaseDate;
		this.isCheckOut = isCheckOut;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public void setIsCheckOut(boolean isCheckOut) {
		this.isCheckOut=isCheckOut;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getISBN() {
		return ISBN;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public boolean getIsCheckOut() {
		return isCheckOut;
	}
	
	public void checkOut() {
		isCheckOut = true;
	}
	public void returnBook() {
		isCheckOut = false;
	}
	
	@Override
	public String toString() {
		return "Title : "+title+"\nAuthor : "+author+"\nISBN : "+ ISBN+"\nRelease Date : " + releaseDate + "Is Check out : "+isCheckOut;
	}
	
}

package com.task2;

public class Book 
{
	private String title;
	private String author;
	private String ISBN;
	private int numPages;
	
	public Book()
	{
		super();
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "N/A";
		this.numPages = 0;
	}

	public Book(String title, String author) 
	{
		super();
		this.title = title;
		this.author = author;
		this.ISBN = "N/A";
		this.numPages = 0;
	}

	public Book(String title, String author, String iSBN) 
	{
		super();
		this.title = title;
		this.author = author;
		this.ISBN = "N/A";
		this.numPages = 0;
	}

	public Book(String title, String author, String iSBN, int numPages) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.numPages = numPages;
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

	public int getNumPages() {
		return numPages;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", numPages=" + numPages + "]";
	}

	
	
}

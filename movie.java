/*
Author: Blane Staskiewicz
E-mail: bas6248@psu.edu
Course: CMPSC 221
Assignment: Programming Assignment 4
Due date: 3/31/2020
Files: package movies - driver.java, movie.java, AwardWinningMovie.java
Purpose: Java application that is a shopping cart, uses Arraylists to
  enter new items into the cart and checkout with card.
Compiler/IDE: Java SE Development Kit 13.0.2/Eclipse Foundation
  IDE 2019-12
Operating system: macOS Catalina Version 10.15.2
Reference(s): Java 10 API - Oracle Documentation
  (https://docs.oracle.com/javase/10/docs/api/)
  Chapters 9, 10, 11, 12, 14 Lecture Slides
*/ 

package movies;

public class movie{
			
	private String title;
	private String rating;
	private String genre;
	private String director;
	private String star;
	
	public movie(String ti, String ra, String ge, String di, String st) {
		title = ti;
		rating = ra;
		genre = ge;
		director = di;
		star = st;
	}
	/** This method returns values of movie
	 * 
	 * @return		values to for movie values
	 */
	public String toString() {
		return ("Title:    " + title + "\n" +
		"Rating:    " + rating + "\n" +
		"Genre:    " + genre + "\n" +
		"Director:   " + director + "\n" +
		"Star:    " + star + "\n"
		);
	}
	/** This method returns true/false if both movie objects are equal
	 * 
	 * @return		boolean val, comparing two objects
	 */
    public boolean equals(movie x, movie y) {  
        return (x.title == y.title && x.rating == y.rating && x.genre == y.genre 
        		&& x.director == y.director && x.star == y.star);
    } 
	/** This method returns title
	 * 
	 * @return	title
	 */
	public String gettitle() {
		return title;
	}
	/** This method returns rating
	 * 
	 * @return	rating
	 */
	public String getrating() {
		return rating;
	}
	/** This method returns genre
	 * 
	 * @return	genre
	 */
	public String getgenre() {
		return genre;
	}
	/** This method returns director
	 * 
	 * @return	director
	 */
	public String getdirector() {
		return director;
	}
	/** This method returns star
	 * 
	 * @return	star	
	 */
	public String getstar() {
		return star;
	}
	/** This method sets title
	 */
	public void settitle(String title) {
		this.title = title;
	}
	/** This method sets rating
	 */
	public void setrating(String rating) {
		this.rating = rating;
	}
	/** This method sets genre
	 */
	public void setgenre(String genre) {
		this.genre = genre;
	}
	/** This method sets director
	 */
	public void setdirector(String director) {
		this.director = director;
	}
	/** This method sets star
	 */
	public void setstar(String star) {
		this.star = star;
	}
}
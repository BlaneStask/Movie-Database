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

public class AwardWinningMovie extends movie{
	
	private String awardTitle;
	private String awardYear;
	
	public AwardWinningMovie(String ti, String ra, String ge, String di, String st, String aT, String aY) {
		super(ti, ra, ge, di, st);
		awardTitle = aT;
		awardYear = aY;
	}
	/** This method returns values of movie
	 * 
	 * @return		values to for movie values
	 */
	public String toString() {
		return ("Title:        " + gettitle() + "\n" +
		"Rating:       " + getrating() + "\n" +
		"Genre:        " + getgenre() + "\n" +
		"Director:     " + getdirector() + "\n" +
		"Star:         " + getstar() + "\n" + 
		"Award Title:  " + awardTitle + "\n" + 
		"Award Year:   " + awardYear + "\n"
		);
	}
	/** This method returns true/false if both movie objects are equal
	 * 
	 * @return		boolean val, comparing two objects
	 */
    public boolean equals(movie x, movie y) {  
        return (x.gettitle() == y.gettitle() && x.getrating() == y.getrating() && x.getgenre() == y.getgenre() 
        		&& x.getdirector() == y.getdirector() && x.getstar() == y.getstar() && 
        		((AwardWinningMovie) x).getawardTitle() == ((AwardWinningMovie) y).getawardTitle() && 
        		((AwardWinningMovie) x).getawardYear() == ((AwardWinningMovie) y).getawardYear());
    } 
	/** This method returns awardTitle
	 * 
	 * @return	awardTitle
	 */
	public String getawardTitle() {
		return awardTitle;
	}
	/** This method returns awardYear
	 * 
	 * @return	awardYear	
	 */
	public String getawardYear() {
		return awardYear;
	}
	/** This method sets awardTitle
	 */
	public void settitle(String awardTitle) {
		this.awardTitle = awardTitle;
	}
	/** This method sets awardYear
	 */
	public void setrating(String awardYear) {
		this.awardYear = awardYear;
	}
}
package movies;

/**
* <h1>Movie Database</h1>
*
* @author  Blane Staskiewicz
*/
public class movie{	
	private String title;
	private String rating;
	private String genre;
	private String director;
	private String star;
	
	/** 
	* Constructor initializes values of the movie
	*
	* @param ti    Title
	* @param ra    Rating
	* @param ge    Genre
	* @param di    Director
	* @param st    Star
	*/
	public movie(String ti, String ra, String ge, String di, String st) {
		title = ti;
		rating = ra;
		genre = ge;
		director = di;
		star = st;
	}
	
	/** 
	* This method returns values of the movie
	* 
	* @return   Movie values
	*/
	public String toString() {
		return ("Title:    " + title + "\n" +
		"Rating:    " + rating + "\n" +
		"Genre:    " + genre + "\n" +
		"Director:   " + director + "\n" +
		"Star:    " + star + "\n"
		);
	}
	
	/** 
	* This method returns true/false if both movie objects are equal
	*
	* @param   x  Movie Object  
	* @param   y  Movie Object
	* @return  boolean value, comparing the two movie objects
	*/
        public boolean equals(movie x, movie y) {  
        	return (x.title == y.title && x.rating == y.rating && x.genre == y.genre 
        		&& x.director == y.director && x.star == y.star);
        }
	
	/** 
	* This method returns title
	*
	* @return  title
	*/
	public String gettitle() {
		return title;
	}
	
	/** 
	* This method returns rating
	*
	* @return  rating
	*/
	public String getrating() {
		return rating;
	}
	
	/** 
	* This method returns genre
	*
	* @return  genre
	*/
	public String getgenre() {
		return genre;
	}
	
	/** 
	* This method returns director
	*
	* @return  director
	*/
	public String getdirector() {
		return director;
	}
	
	/** 
	* This method returns star
	*
	* @return  star
	*/
	public String getstar() {
		return star;
	}
	
	/** 
	* This method sets title
	*
	* @param  title
	*/
	public void settitle(String title) {
		this.title = title;
	}
	
	/** 
	* This method sets rating
	*
	* @param  rating
	*/
	public void setrating(String rating) {
		this.rating = rating;
	}
	
	/** 
	* This method sets genre
	*
	* @param  genre
	*/
	public void setgenre(String genre) {
		this.genre = genre;
	}
	
	/** 
	* This method sets director
	*
	* @param  director
	*/
	public void setdirector(String director) {
		this.director = director;
	}
	
	/** 
	* This method sets star
	*
	* @param  star
	*/
	public void setstar(String star) {
		this.star = star;
	}
}

package movies;
import java.util.*;

/**
* <h1>Driver for Movie Database</h1>
* This program acts as a database for films, 
* all directed by Quentin Tarantino and gives information
* about the searched for film or popular films
*
* @author  Blane Staskiewicz
*/
public class driver{
	/** 
	* This method is the main/driver method
	* 
	* @throws Exception 
	* @param  args      Unused
	*/
	public static void main(String[] args) throws Exception {
		ArrayList<AwardWinningMovie> database = new ArrayList<AwardWinningMovie>();
		
		AwardWinningMovie obj0 = new AwardWinningMovie("Reservoir Dogs", "R", "Drama/Mystery", "Quentin Tarantino", "Harvey Keitel", "Best Film", "1992");
		database.add(obj0);
		AwardWinningMovie obj1 = new AwardWinningMovie("Pulp Fiction", "R", "Drama/Crime", "Quentin Tarantino", "John Travolta", "Best Original Scene Play", "1995");
		database.add(obj1);
		AwardWinningMovie obj2 = new AwardWinningMovie("Jackie Brown", "R", "Drama/Mystery", "Quentin Tarantino", "Robert De Niro", "Best Actor", "1998");
		database.add(obj2);
		AwardWinningMovie obj3 = new AwardWinningMovie("Kill Bill: Vol1", "R", "Mystery/Crime", "Quentin Tarantino", "Lucy Liu", "Best Villain", "2003");
		database.add(obj3);
		AwardWinningMovie obj4 = new AwardWinningMovie("Kill Bill: Vol2", "R", "Drama/Crime", "Quentin Tarantino", "Michael Madsen", "Best Fight", "2004");
		database.add(obj4);
		AwardWinningMovie obj5 = new AwardWinningMovie("Death Proof", "R", "Drama/Slasher", "Quentin Tarantino", "Kurt Russell", "Best Film Nominee", "2007");
		database.add(obj5);
		AwardWinningMovie obj6 = new AwardWinningMovie("Inglourious Basterds", "R", "Drama/Action", "Quentin Tarantino", "Brad Pitt", "Best Actor in a Supporting Role", "2010");
		database.add(obj6);
		AwardWinningMovie obj7 = new AwardWinningMovie("Django Unchained", "R", "Drama/Blaxploitation", "Quentin Tarantino", "Jamie Foxx", "Best Jaw Dropping Moment", "2013");
		database.add(obj7);
		AwardWinningMovie obj8 = new AwardWinningMovie("The Hateful Eight", "R", "Drama/Mystery", "Quentin Tarantino", "Samuel L. Jackson", "Best Original Music Score", "2016");
		database.add(obj8);
		AwardWinningMovie obj9 = new AwardWinningMovie("Once Upon a Time in Hollywood", "R", "Drama/Comedy-drama", "Quentin Tarantino", "Leonardo DiCaprio", "Best Actor in a Supporting Role", "2020");
		database.add(obj9);
		
    		Scanner s = new Scanner(System.in);
        
		System.out.println("run: ");
		System.out.println("------------------------------------------");
		System.out.println("EXPERIMENTAL AWARD-WINNING MOVIE DATABASE*");
		System.out.println("------------------------------------------");
		System.out.println("   (*Funded in part by IMDb.com)");
		System.out.println("Please note that the movie titles are displayed alphabetically by default.");
        
		int input = 0;

		// loops until val == 3 is returned
		while(input != 3) {
			input = welcome(s);
		    // Popular movies
		    if(input == 1) {
				System.out.println("Selected award-winning movies: ");
				System.out.println("1) Inglourious Basterds");
				System.out.println("2) Django Unchained");
				System.out.println("3) The Hateful Eight");
				System.out.println("4) Once Upon a Time in Hollywood");
				System.out.println("5) Pulp Fiction");
				System.out.println();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println();

				int user_input = valid(s);
				film_info(database, user_input);
				inquire(database, user_input, s);
		    }
		    // Search the database
		    else if(input == 2) {
			String input2 = "";
			while(input2 != "T" && input2 != "S") {
				System.out.println();
				System.out.print("Type T to search by title or S to search by star: ");
					String input1 = s.nextLine();
				input2 = input1.toUpperCase().trim();
				System.out.println();	

				// by title
				if(input2.equals("T")) {
					System.out.println("Please enter a movie title: ");
					String input3 = s.nextLine();
					String input4 = input3.toUpperCase().trim();
					System.out.println();

					// check everything in the database
					for(int i = 0; i < database.size(); i++) {
						String title = (database.get(i)).gettitle();
						String title_upper = title.toUpperCase();
						if(input4.equals(title_upper)) {
							System.out.println(database.get(i).toString());
							System.out.println();
						}
					}
					break;
				}
				// by star name
				else if(input2.equals("S")) {
					System.out.println("Please enter a star name: ");
					String input3 = s.nextLine();
					String input4 = input3.toUpperCase().trim();
					System.out.println();

					// check everything in the database
					for(int i = 0; i < database.size(); i++) {
						String star = (database.get(i)).getstar();
						String star_upper = star.toUpperCase();
						if(input4.equals(star_upper)) {
							System.out.println(database.get(i).toString());
							System.out.println();
						}
					}
					break;
				}
				else if(input2 != "T" && input2 != "S"){
					System.out.println("** Invalid choice! Please enter T or S. **");
					System.out.println();
				}
			}
		    }
		}
        
		// end output, if val == 3
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Thanks for using our experimental database!");
			System.out.println();
	}
	
	/** 
	* This method welcomes the user and asks to choose an option
	* 
	* @param  s     Scanner used to get user input
	* @return val 	returns input value from welcome
	*/
	public static int welcome(Scanner s) {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Select an option from the menu below.");
		System.out.println("1) Display the list of popular movies");
		System.out.println("2) Search the database");
		System.out.println("3) Quit");
		
		String input = s.nextLine();
		int val = Integer.parseInt(input);
		
		// if value is not an option
		if(val != 1 && val != 2 && val != 3) {
			// loop until value is an option
			while(val != 1 && val != 2 && val != 3) {
				System.out.print("Your choice? ");
				System.out.println(val);
				System.out.println("** You must enter a number from 1 through 3! **");
				
				String input1 = s.nextLine();
				val = Integer.parseInt(input1);
			}
			// invalid, now valid
			System.out.print("Your choice?: ");
			System.out.println(val);
			
			System.out.println();
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			
			return val;
			
		}
		// valid the first time
		System.out.print("Your choice?: ");
		System.out.println(val);
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		return val;
	}
	
	/** 
	* This method is used to make sure input value is a valid number
	* 
	* @param  s   Scanner used to get user input
	* @return 0   Not expected to return 0
	*/
	public static int valid(Scanner s) {
		int user_input = 0;
		while(user_input != 1 && user_input != 2 && user_input != 3 && user_input != 4 && user_input != 5) {
			try {
	    		System.out.print("Please enter the number of the movie you would like to know more about: ");
	    		String input3 = s.nextLine();
	    		int user_input1 = Integer.parseInt(input3);
	    		System.out.println();
	    		return user_input1;
			}
			catch(Exception e) {
				System.out.println("Exception: java.util.InputMismatchException");
				System.out.println("Movie choice must be an integer. Please try again.");
				System.out.println();
			}
		}
		return 0; // not execpted to return here
	}
	
	/** 
	* This method outputs the info based on the users input value
	* 
	* @param  database    Arraylist containing the award winning movies
	* @param  user_input  users choice of movie
	*/
	public static void film_info(ArrayList<AwardWinningMovie> database, int user_input) {
		// print values for selected movie
		if(user_input == 1) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).gettitle().equals("Inglourious Basterds")) {
					System.out.println(database.get(i).toString());
					System.out.println();
				}
			}
		}
		else if(user_input == 2) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).gettitle().equals("Django Unchained")) {
					System.out.println(database.get(i).toString());
					System.out.println();
				}
			}
		}
		else if(user_input == 3) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).gettitle().equals("The Hateful Eight")) {
					System.out.println(database.get(i).toString());
					System.out.println();
				}
			}
		}
		else if(user_input == 4) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).gettitle().equals("Once Upon a Time in Hollywood")) {
					System.out.println(database.get(i).toString());
					System.out.println();
				}
			}
		}
		else if(user_input == 5) {
			for(int i = 0; i < database.size(); i++) {
				if(database.get(i).gettitle().equals("Pulp Fiction")) {
					System.out.println(database.get(i).toString());
					System.out.println();
				}
			}
		}
	}
	
	/** 
	* This method is used to make sure input value is a number
	* 
	* @param  database    Arraylist containing the award winning movies
	* @param  user_input  users choice of movie
	* @param  s           Scanner used to get user input
	*/
	public static void inquire(ArrayList<AwardWinningMovie> database, int user_input, Scanner s) {
		System.out.println("Inquire about another movie (Y/N)? ");
		String input3 = s.nextLine();
		String input4 = input3.toUpperCase().trim();

		// while user still wants to inquire
		while(!input4.equals("N")) {
	    		if(input4.equals("Y")) {
	        		int user_input1 = valid(s);
	        		film_info(database, user_input1);
	        		
	        		System.out.println("Inquire about another movie (Y/N)? ");
	        		input3 = s.nextLine();
	            		input4 = input3.toUpperCase().trim();
			}
			// invalid
			else if(!input4.equals("Y") && !input4.equals("N")) {
				System.out.println("** Invalid Choice! Please enter Y or N. **");
				System.out.println("Inquire about another movie (Y/N)? ");
				String input5 = s.nextLine();
			    input4 = input5.toUpperCase().trim();
			}
			else {
				break;
			}
    		}
	}
}

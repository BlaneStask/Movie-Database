package movies;
import java.util.*;

public class driver{
	/** This method is the main/driver method
	 * 
	 * @throws Exception 
	 * @call   calls other methods to validate and output movies
	 */
	public static void main(String[] args) throws Exception{
		ArrayList<OnDemandMovie> database = new ArrayList<OnDemandMovie>();
		
		//movie list
		OnDemandMovie obj0 = new OnDemandMovie("Reservoir Dogs", "R", "Drama/Mystery", "Quentin Tarantino", "Harvey Keitel", 3.99, "03/18/20", 7);
		database.add(obj0);
		OnDemandMovie obj1 = new OnDemandMovie("Pulp Fiction", "R", "Drama/Crime", "Quentin Tarantino", "John Travolta", 5.95, "05/23/20", 4);
		database.add(obj1);
		OnDemandMovie obj2 = new OnDemandMovie("Jackie Brown", "R", "Drama/Mystery", "Quentin Tarantino", "Robert De Niro", 4.99, "08/06/21", 7);
		database.add(obj2);
		OnDemandMovie obj3 = new OnDemandMovie("Kill Bill: Vol1", "R", "Mystery/Crime", "Quentin Tarantino", "Lucy Liu", 9.99, "01/16/20", 5);
		database.add(obj3);
		OnDemandMovie obj4 = new OnDemandMovie("Kill Bill: Vol2", "R", "Drama/Crime", "Quentin Tarantino", "Michael Madsen", 8.95, "04/13/20", 5);
		database.add(obj4);
		OnDemandMovie obj5 = new OnDemandMovie("Death Proof", "R", "Drama/Slasher", "Quentin Tarantino", "Kurt Russell", 2.99, "07/28/20", 30);
		database.add(obj5);
		OnDemandMovie obj6 = new OnDemandMovie("Inglourious Basterds", "R", "Drama/Action", "Quentin Tarantino", "Brad Pitt", 5.99, "03/03/21", 3);
		database.add(obj6);
		OnDemandMovie obj7 = new OnDemandMovie("Django Unchained", "R", "Drama/Blaxploitation", "Quentin Tarantino", "Jamie Foxx", 6.95, "03/22/20", 4);
		database.add(obj7);
		OnDemandMovie obj8 = new OnDemandMovie("The Hateful Eight", "R", "Drama/Mystery", "Quentin Tarantino", "Samuel L. Jackson", 10.99, "02/21/20", 2);
		database.add(obj8);
		OnDemandMovie obj9 = new OnDemandMovie("Once Upon a Time in Hollywood", "R", "Drama/Comedy-drama", "Quentin Tarantino", "Leonardo DiCaprio", 15.99, "07/09/21", 2);
		database.add(obj9);
		
    	Scanner s = new Scanner(System.in);
        
		System.out.println("Movies available to rent: ");
		System.out.println();
        
		//prints movies
    	for(int i = 0; i < database.size(); i++){
    		int location = i + 1;
    		System.out.println("Choice " + location + ": ");
    		System.out.println(database.get(i).toString());
    		System.out.println();
    	}

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        //get price based on input
        double payment = 0;
        int user_input = valid(s);
        for(int i = 0; i < database.size(); i++){
        	if((i + 1) == user_input){
        		payment = database.get(i).getPrice();
        	}
        }
        
        //end output after choosing a movie to rent
		System.out.print("Rental Payment due: ");
		System.out.println(payment);
		System.out.println("Thank you for your business!");
	}
	/** This method is used to make sure input value is a valid number
	 * 
	 * @param	s
	 */
	public static int valid(Scanner s){
		int user_input = 0;
		while(user_input != 1 && user_input != 2 && user_input != 3 && user_input != 4 && user_input != 5 && user_input != 6
				&& user_input != 7 && user_input != 8 && user_input != 9 && user_input != 10) {
			try{
	    		System.out.print("Please enter the number of the movie you wish to rent: ");
	    		String input2 = s.nextLine();
	    		int user_input1 = Integer.parseInt(input2);
	    		System.out.println();
	    		
	    		//user input is not between 1 - 10
	    		if(user_input1 != 1 && user_input1 != 2 && user_input1 != 3 && user_input1 != 4 && user_input1 != 5 && user_input1 != 6
	    				&& user_input1 != 7 && user_input1 != 8 && user_input1 != 9 && user_input1 != 10) {
	    			throw new InputMismatchException();
	    		}
	    		return user_input1;
			}
			catch(Exception e){
				System.out.println("Exception: java.util.InputMismatchException");
				System.out.println();
				System.out.println("Movie choice must be an integer, between 1 - 10. Please try again.");
				System.out.println();
			}
		}
		return 0; //not supposed to hit this
	}
}

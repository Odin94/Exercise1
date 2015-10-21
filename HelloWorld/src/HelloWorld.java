import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Hello ASE2015 - how are you now? :)");
=======
		System.out.println("Hello ASE2015 - how are you? :)");
		
		System.out.print("Gimme yo name, boii (or girl):");
		Scanner in = new Scanner(System.in);	
	    String name = in.nextLine();
	    
	    HelloUser hello = new HelloUser(name);
	    
		hello.greetUser();
>>>>>>> new_branch_of_old_repo_long_name
	}

}

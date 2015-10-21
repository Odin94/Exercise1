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
		System.out.println("Hello ASE2015 - how are you? :)");
		
		System.out.print("Gimme yo name, boii (or girl):");
		Scanner in = new Scanner(System.in);	
	    String name = in.nextLine();
	    
	    HelloUser hello = new HelloUser(name);
	    
		hello.greetUser();
	}

}

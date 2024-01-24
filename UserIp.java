import java.util.*;

public class UserIp {
	public static String[] takeUserIpArray() {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter elements of the array (separated by spaces): ");
       String input = scanner.nextLine();
  // Split the user input into an array
       String[] array = input.split("\\s+");
       scanner.close();
       return array;
	}
}
	

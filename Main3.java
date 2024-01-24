/*
Suhani Thakur
22070126115
AIML B2
*/

import java.util.*;

public class Main3 {
	public static void main(String[] args) {
		String[] inputArray = UserIp.takeUserIpArray();
		
		ArrayList<String> arrayList = ArrayConverter.convertArrayToArrayList(inputArray);
		
		displayArrayList(arrayList);
		
		String[] outputArray = ArrayConverter.convertArrayListToArray(arrayList, new Sting[0]);
		
		displayArray(outputArray);
	}
	
//method to display array list elements 
     public static void displayArrayList(ArrayList<String> arrayList) {
		 System.out.println("ArrayList elements: ");
		 for (String element : arrayList) {
            System.out.println(element);
	 }}
	 
	 //diplaying array elements
	  public static void displayArray(String[] array) {
          System.out.println("Array elements:");
          for (String element : array) {
             System.out.println(element);
 }
 }
 
}
		 
		 
		 
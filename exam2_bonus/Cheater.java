import java.io.*;

public class Cheater {

/*	Write a program that uses a for statement to find the smallest of several
	integers.  Assume that the first value read specifies the number of values to be read; therefore,
	the first number is not one of the integers to compare.*/
	
	public static void main(String args[]) throws IOException {
		
		//set up a variable to hold the lowest integer
		int lowest_integer = 0;
		
		//Ask for the first value from the user - how many integers do you want to compare
		System.out.print("Enter the number of integers to compare: ");
		
		//Open up standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//Get the value
		String input = br.readLine();
		
		//Convert it to an integer
		int number_of_integers_to_compare = Integer.valueOf(input);
		
		//Run the loop that many times
		for (int i = 0; i < number_of_integers_to_compare; i++) {
			
			//Ask for an integer
			System.out.print("Enter an integer: ");
			
			//Read it in to a string
			String str = br.readLine();
			
			//Convert it to an integer
			int integer = Integer.valueOf(str);
			
			//if we are on the first integer it will always be the lowest
			//else compare it to the current lowest integer
			if (i == 0) {
				lowest_integer = integer;
			} else {
				if (integer < lowest_integer) {
					lowest_integer = integer;
				}
			}
			
		}
		
		//Close the BufferedReader
		br.close();
		
		//When the loop is done tell the use which is the lowest
		System.out.println("The lowest integer is: " + lowest_integer);
		
	}
	
}
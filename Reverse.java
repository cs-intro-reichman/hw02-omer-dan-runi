/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String input = args[0];
		int length = input.length();
		char middle = input.charAt(length / 2);
		int flag = length -1;

		while (flag >= 0)
		{
			System.out.print(input.charAt(flag));

			flag--;
		}

		System.out.print("\nThe middle character is " + middle);
	}
}

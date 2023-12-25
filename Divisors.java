/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);
		int flag = 1;

		while(flag <= num)
		{
			if (num % flag == 0)
			{
				System.out.println(flag);
			}

			flag++;
		}
	}
}

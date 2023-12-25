/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);

		// Going over the divisors that are greater than 1.
		int flag = 2;

		// Starting the divisors count from 1.
		int count = 1;

		String perfectNumString = num + " is a perfect number since " + num + " = 1";

		// Checking wether num is a perfect number or not
		// Checking the divisors using the code from ex1
		while(flag < num)
		{
			if (num % flag == 0)
			{
				count += flag;
				perfectNumString += " + " + flag;
			}

			flag++;
		}

		// If count is equal to num then num is a prefect number -
		// printing the perfectNumString
		if (count == num)
		{
			System.out.print(perfectNumString);
		}
		// If num is not perfect - printing it.
		else
		{
			System.out.print(num + " is not a perfect number");
		}
	}
}

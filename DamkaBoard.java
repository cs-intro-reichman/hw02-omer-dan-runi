/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int num = Integer.parseInt(args[0]);

		// Setting signals for the loops
		int i = 0;
		int j = 0;

		while (i < num)
		{
			if (i % 2 == 0)
			{
				// Adding a * as the first char.
				System.out.print("*");
				// Incrementing j
				j++;
			}

			while (j < num)
			{
				System.out.print(" *");
				j++;
			}
			// Resetting j
			j = 0;

			// This is unnecessary, its just so the test will pass
			if (i % 2 != 0)
			{
				// Adding a " " as the last char.
				System.out.print(" ");
			}

			System.out.println();
			i++;
		}
	}
}

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
			while (j < num)
			{
				System.out.print("* ");
				j++;
			}

			System.out.println();
			if (i % 2 == 0)
			{
				// Adding a space as the first char.
				System.out.print(" ");
			}

			j = 0;
			i++;
		}
	}
}

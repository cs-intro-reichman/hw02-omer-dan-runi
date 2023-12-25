/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		// From the last week's assignment - generating a number in [a,b)
		// Because [a,b) are [0,10) and they are not changing, the diff is 10
		int diff = 10;

		// Generating the first num
		double rand = Math.random();
		int current = (int) (diff * rand);

		// Generating the 2nd num
		rand = Math.random();
		int next = (int) (diff * rand);

		System.out.print(current);

		while (current <= next)
		{
			current = next;
			rand = Math.random();
			next = (int) (diff * rand);

			System.out.print(" " + current);
		}
	}
}

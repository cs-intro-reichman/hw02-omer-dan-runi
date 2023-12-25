
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean boy = false;
		boolean girl = false;
		int children = 0;

		double ran = Math.random();
		// Receiving 0 or 1, 0 for boys and 1 for girls, cause boys are losers and girls are number 1!
		// (Im a boy pls dont cancel me)
		int child = (int) (2 * ran);
		boy = (child == 0);
		girl = (child == 1);
		children++;

		if (boy)
		{
			System.out.print("b ");
		}
		else
		{
			System.out.print("g ");
		}

		while (!(boy && girl))
		{
			ran = Math.random();
			child = (int) (2 * ran);

			boy = boy || (child == 0);
			girl = girl || (child == 1);
			children++;

			if (child == 0)
			{
				System.out.print("b ");
			}
			else
			{
				System.out.print("g ");
			}
		}

		System.out.println("\nYou made it... and you now have "+ children +" children.");
	}
}

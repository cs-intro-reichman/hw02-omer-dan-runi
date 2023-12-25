/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int families = Integer.parseInt(args[0]);
		boolean boy = false;
		boolean girl = false;
		int boys = 0;
		int girls = 0;
		int twoChildrens = 0;
		int threeChildrens = 0;
		int fourOrMoreChildren = 0;
		int childCount = 0;

		double ran = Math.random();
		
		for (int i = 0; i < families; i++)
		{
			// Receiving 0 or 1, 0 for boys and 1 for girls, cause boys are losers and girls are number 1!
			// (Im a boy pls dont cancel me)
			int child = (int) (2 * ran);
			boy = (child == 0);
			girl = (child == 1);
			childCount++;

			if (boy)
			{
				boys++;
			}
			else
			{
				girls++;
			}

		
			while (!(boy && girl))
			{

				ran = Math.random();
				child = (int) (2 * ran);

				boy = boy || (child == 0);
				girl = girl || (child == 1);
				childCount++;

				if (child == 0)
				{
					boys++;
				}
				else
				{
					girls++;
				}
			}

			if (childCount == 2)
			{
				twoChildrens++;
			}
			else if (childCount == 3)
			{
				threeChildrens++;
			}
			else
			{
				fourOrMoreChildren++;
			}

			childCount = 0;
		}

		int mostCommon = 0;
		if (twoChildrens > threeChildrens && twoChildrens > fourOrMoreChildren)
		{
			mostCommon = 2;
		}
		else if (threeChildrens > twoChildrens && threeChildrens > fourOrMoreChildren)
		{
			mostCommon = 3;
		}
		else
		{
			mostCommon = 4;
		}
		
		System.out.println("Average: "
						   + ((double) (boys + girls) / families)
						   + " children to get at least one of each gender.");

		System.out.println("Number of families with 2 children: " + twoChildrens);
		System.out.println("Number of families with 3 children: " + threeChildrens);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		System.out.println("The most common number of children is " + mostCommon +".");
	}
}

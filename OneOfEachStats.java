import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int families = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		boolean boy = false;
		boolean girl = false;
		int boys = 0;
		int girls = 0;
		int totalChildren = 0;
		int twoChildrens = 0;
		int threeChildrens = 0;
		int fourOrMoreChildren = 0;
		int childCount = 0;

		for (int i = 0; i < families; i++)
		{
			// Receiving 0 or 1, 0 for boys and 1 for girls, cause boys are losers and girls are number 1!
			// (Im a boy pls dont cancel me)		
			while (!(boy && girl))
			{
				double rnd = generator.nextDouble();
				totalChildren++;

				if (rnd > 0.5)
				{
					girl = true;
					girls++;
				}
				else
				{
					boy = true;
					boys++;
				}
				
				childCount++;
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

			boy = false;
			girl = false;
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
						   + ((double) (totalChildren) / families)
						   + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildrens);
		System.out.println("Number of families with 3 children: " + threeChildrens);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		System.out.println("The most common number of children is " + mostCommon +".");
	}
}

package DeqLL;

import java.util.Random;

public class DeqEx {
	public static void main(String[] args) {// call with one command-line
											// argument: a +veinteger
		int n = Integer.parseInt(args[0]);
		Deq D = new Deq();
		Random rGen = new Random();
		for (int i = 0; i < n; i++) {// One DEQ operation per iteration
			int choice = rGen.nextInt(6);
			switch (choice) {
			case 0:
			case 1:// Add to back (enqueue)
				int d = rGen.nextInt(25);
				System.out.printf("\nADD TO BACK\t\t %2d", d);
				D.addToBack(d);
				break;
			case 2:
			case 3:// Add to front (push)
				d = rGen.nextInt(25);
				System.out.printf("\nADD TO FRONT\t\t %2d", d);
				D.addToFront(d);
				break;
			case 4:// Remove from back
				System.out.printf("\nREMOVE FROM BACK\t ");
				if (D.isEmpty())
					System.out.printf(" of an empty Dequeue");
				else
					System.out.printf("%2d", D.removeFromBack());
				break;
			case 5:// Remove from front (pop/ dequeue)
				System.out.printf("\nREMOVE FROM FRONT\t ");
				if (D.isEmpty())
					System.out.printf(" on an empty Dequeue");
				else
					System.out.printf("%2d", D.removeFromFront());
			}
		}
	}
}

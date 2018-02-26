package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester2 {

	public static void main(String[] args) {
		Progression p = new Arithmetic(3, 2);
		// outputs the sum of first 5 terms in p
		printSumOfTerms(p, 5);

		p = new Geometric(3, 2);
		printSumOfTerms(p, 5);
	}

	/**
	 * Prints the sum of the first terms in a progression.
	 * 
	 * @param p
	 *            the progression
	 * @param n
	 *            the number of terms to consider
	 **/
	private static void printSumOfTerms(Progression p, int n) {
		double sum = 0;
		
		for(int i=0; i < n ; i++){
			sum += p.getTerm(i+1);
		}
		
		System.out.println("Sum of first " + n + " terms in " + p.toString() + " is: " + sum);
	}

}

package orderedStructures;

import java.security.InvalidParameterException;

import interfaces.Combinable;
import interfaces.OrderedNumberStructure; 

public abstract class Progression implements OrderedNumberStructure, Combinable {
	private double first;       // the first value
	protected double current; 
	protected int size; 

    // current is the current value of the object – it changes
	// to “the value of the next term” whenever method 
	// “nextValue” is applied to the object.

	public Progression(double first) { 
		this.first = first; 
		current = first;
	}
	
	public void setSize(int n ) {
		size = n; 
	}
	
	public double firstValue() { 
		current = first; 
		return current; 
	}
	
	public void printAllTerms(int n) throws InvalidParameterException {
		if (n <= 0) 
			throw new InvalidParameterException("printAllTerms: Invalid argument value = " + n);  

		System.out.println("Index --- Term Value"); 
		for (int i=1; i<=n; i++) { 
			System.out.println((i) +  "---" + this.getTerm(i));  
		}
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}
	
	public void add(Progression p) {
	//	Progression p3 = null;
		
		System.out.println("\n\n\nSum \nProgression1 --- Progression2 --- Sum"); 
		for(int i = 1 ; i <= p.size ; i++) {
			double value1 = this.getTerm(i);
			double value2 = p.getTerm(i);
			
			System.out.println(value1 + " --- "+ value2+ " --- "+ (value1 + value2)); 
		}
	}
	
	public void subtract(Progression p) {
		System.out.println("\n\n\nSubtract \nProgression1 --- Progression2 --- Subtraction"); 
		for(int i = 1 ; i <= p.size ; i++) {
			double value1 = this.getTerm(i);
			double value2 = p.getTerm(i);
			
			System.out.println(value1 + " --- "+ value2+ " --- "+ (value1 - value2)); 
		}
	}
	
	public abstract double nextValue(); 
}

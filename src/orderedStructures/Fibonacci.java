package orderedStructures;

public class Fibonacci extends Progression {

	private double prev;
//	private double next;
	
	public Fibonacci() {
		this(1);
		prev = 0;
	//	next = 0;
	}

	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
		double n = current + prev;
		prev = current;	
		current = n; 
		
		return n;
	}

	@Override
	public double firstValue() {
		double value = super.firstValue();
		prev = 0;
		return value;
	}

}

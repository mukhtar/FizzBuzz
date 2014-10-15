/**
 *	This class is an implementation of the FizzBuzz interview question.
 *
 *	The "Fizz-Buzz test" is an interview question designed to help filter out the 99.5% of programming job candidates who can't seem to program their way out of a wet paper bag.
 *	The text of the programming assignment is as follows:
 *
 *  "Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."
 *	Source: "Using FizzBuzz to Find Developers who Grok Coding" http://tickletux.wordpress.com/2007/01/24/using-fizzbuzz-to-find-developers-who-grok-coding/
 */
public class FizzBuzz{

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String FIZZBUZZ = "FizzBuzz";

	private int min = 1;
	private int max = 100;
	
	public FizzBuzz(int min, int max){
		validate(min,max);
		this.min = min;
		this.max = max;
	}

	public FizzBuzz(){}
	
	public void go(){
		for (int i = min; i <= max ; i++){
			if(i % 15 == 0)	//multiple of 3 and 5 as 15 is LCM of 3 and 5
				System.out.println(FIZZBUZZ);
			else if(i % 3 == 0)
				System.out.println(FIZZ);
			else if(i % 5 == 0)
				System.out.println(BUZZ);
			else
				System.out.println(i);
		}
	}
	
	private void validate(int min,int max){
		if(min < 1)
			throw new IllegalArgumentException("min must be a positive integer greater than 0");
		if(max < 1)
			throw new IllegalArgumentException("max must be a positive integer greater than 0");
		if( min > max )
			throw new IllegalArgumentException("min cannot be greater than max");
	}
}
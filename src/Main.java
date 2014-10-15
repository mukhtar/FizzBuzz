public class Main{
	public static void main (String[] args){
		if(args.length != 2){
			new FizzBuzz().go();
		}
		else{
			try{
				int min = Integer.parseInt(args[0]);
				int max = Integer.parseInt(args[1]);
				new FizzBuzz(min,max).go();
			}catch(IllegalArgumentException iae){
				System.err.println("Error: "+ iae.getMessage());
			}
		}
	}
}
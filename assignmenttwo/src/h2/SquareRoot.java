package h2;

public class SquareRoot {

	double x;
	double error;
	double guess;
	double y = x - error;
	public static double SquareRoot(double x, double error, double guess){
	
	if((guess*guess)-x < error){
		return guess;
	}
		guess = ((guess + (x / guess))*0.5);
		return SquareRoot(x, error, guess);
	
	}
	public static void main (String[] args){
		System.out.println(SquareRoot (16, 0.00000000000001, 5));
		
	}

}

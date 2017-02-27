package h2;

public class SquareRoot {

	double x;
	double error;
	double guess;
	public static double squareRoot(double x, double error, double guess){
	
	if((guess*guess)-x < error){
		return guess;
	}
		guess = ((guess + (x / guess))*0.5);
		return squareRoot(x, error, guess);
	
	}
	public static void main (String[] args){
		System.out.println(squareRoot (16, 0.000000001, 5));
		
	}

}

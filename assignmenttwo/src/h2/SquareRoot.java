package h2;

public class SquareRoot {

	double x;
	double error;
	double guess;
	double y = x - error;
	public static double SquareRoot(double x, double error, double guess){
	
	if((guess*guess)-x < error){
		return guess;
	}else{
		guess = ((guess + (x / guess))*0.5);
		SquareRoot(x, error, guess);
		return guess;
	}
	}
	public static void main (String[] args){
		System.out.println(SquareRoot (16.0, 0.0000000000000001, 4.1));
		
	}

}

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		Integer num = Integer.parseInt(args[0]);
		Integer hundreds = num / 100;
		Integer tens = (num % 100) / 10;
		Integer ones = num % 10;
		System.out.println(String.format("%s hundreds, %s tens, and %s ones.", hundreds, tens, ones));
	}
}

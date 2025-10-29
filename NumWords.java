// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		java.io.Console console = System.console();

		Integer num = Integer.parseInt(console.readLine("Enter a number: "));
		Integer hundreds = num / 100;
		Integer tens = (num % 100) / 10;
		Integer ones = num % 10;
		System.out.println(String.format("%s hundreds, %s tens, and %s ones.", hundreds, tens, ones));
	}
}

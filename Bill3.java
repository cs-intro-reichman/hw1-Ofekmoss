// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		java.io.Console console = System.console();

	    String name1 = console.readLine("Enter the first diner's name: ");
	    String name2 = console.readLine("Enter the second diner's name: ");
	    String name3 = console.readLine("Enter the third diner's name: ");
		Integer billAmount = Integer.parseInt(console.readLine("Enter the total bill amount: "));
		Double billAmountPerDiner = Math.ceil(billAmount / 3.0);
		
		System.out.println(String.format("Dear %s, %s, and %s: pay %s shekels each.", name3, name2, name1, billAmountPerDiner));
	}
}

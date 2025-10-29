// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args[1];
	    String name3 = args[2];
		Integer billAmount = Integer.parseInt(args[3]);
		Double billAmountPerDiner = Math.ceil(billAmount / 3.0);
		
		System.out.println(String.format("Dear %s, %s, and %s: pay %s Shekels each.", name3, name2, name1, billAmountPerDiner));
	}
}

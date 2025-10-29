// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		Integer range = Integer.parseInt(args[0]);
		Integer a = (int) (Math.random() * range);
		Integer b = (int) (Math.random() * range);
		Integer c = (int) (Math.random() * range);
		
		System.out.println(String.format("%s %s %s", a, b, c));

		Integer min = Math.min(Math.min(a,b), c);
		Integer max = Math.max(Math.max(a,b), c);
		Integer middle = a + b + c - min - max;
		System.out.println(String.format("%s %s %s", min, middle, max));
	}
}

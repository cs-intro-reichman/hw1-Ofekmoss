// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		java.io.Console console = System.console();
		Integer currentValue = Integer.parseInt(console.readLine("Enter the current value: "));
		Double rate = Double.parseDouble(console.readLine("Enter the rate (as a percent): "));
		Integer n = Integer.parseInt(console.readLine("Enter the number of years: "));
		Integer calcFutureValue = (int) (currentValue * Math.pow((1 + rate/100), n));
		
		System.out.println(String.format("After %s years, $%s saved at %s%% will yield $%s", n.toString(), currentValue.toString(), rate.toString(), calcFutureValue.toString()));
	}
}
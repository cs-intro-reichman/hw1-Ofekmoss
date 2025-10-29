// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		Integer currentValue = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		Integer n = Integer.parseInt(args[2]);
		Integer calcFutureValue = (int) (currentValue * Math.pow((1 + rate/100), n));
		
		System.out.println(String.format("After %s years, $%s saved at %s%% will yield $%s", n.toString(), currentValue.toString(), rate.toString(), calcFutureValue.toString()));
	}
}
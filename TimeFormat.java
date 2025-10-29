// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		
		Boolean isPM = hours >= 12;
		Boolean isMinutesLessThen10 = minutes < 10;
		System.out.println(String.format("%s:%s %s", isPM && hours != 12 ? hours - 12  : hours, isMinutesLessThen10 ? "0" + minutes : minutes, isPM ? "PM" : "AM"));

	}
}
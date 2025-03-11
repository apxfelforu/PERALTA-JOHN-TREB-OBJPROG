import java.util.Scanner;

public class EvenOddChecker {
	public static void main(String[] args) {
		int number = getIntegerInput();
		String result = checkEvenorOdd(number);
		System.out.println(number + " is an " + result);
	}
	public static int getIntegerInput() {
		Scanner input = new Scanner (System.in);
		System.out.print ("Enter an integer: ");
		int integer = input.nextInt();
		return integer;
	}
	public static String checkEvenorOdd (int integer) {
		if (integer % 2 == 0) return "Even number";
		else return "Odd number";
	}
}
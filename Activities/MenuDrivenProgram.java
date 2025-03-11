import java.util.Scanner;

public class MenuDrivenProgram{
	public static void main(String[] args) {
		int choice;
		do{	
		displayMenu();
		choice = handleMenuChoice();
		} while (choice != 3);
	}
	public static void displayMenu(){
		System.out.println("Menu");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
	}
    public static int handleMenuChoice() {
		Scanner input = new Scanner (System.in);
			System.out.print("Enter a number (1 - 3): ");
			int choice = input.nextInt();
			
			if (choice == 1) {
				greetUser();
			}
			else if (choice == 2) {
				EvenOddChecker();
			}
			else if (choice == 3) {
				System.out.println("Exiting Program. Good bye!");
			}
			else {
				System.out.println("Invalid Choice");
			}
			return choice;
    }
	public static void greetUser() {
		System.out.println("Hello, User!");
	}
	public static void EvenOddChecker() {
		Scanner input = new Scanner (System.in);
			System.out.print("Enter an integer: ");
			int num = input.nextInt();
			
			if (num % 2 == 0) {
				System.out.println(num + " is an Even Number");
			}
			else {
				System.out.println(num + " is an Odd Number");
			}
	}
}


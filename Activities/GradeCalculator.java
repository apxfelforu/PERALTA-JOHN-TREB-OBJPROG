import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		System.out.println("Your grade is: " + calculateGrade(getStudentScore()));
	}
	public static int getStudentScore(){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a score: ");
		int score = input.nextInt();
		return score;
	}
	public static String calculateGrade(int score){
		if (score >= 90) return "A";
		if (score >= 80) return "B";
		if (score >= 70) return "C";
		if (score >= 60) return "D";
		else return "F";
	}
}
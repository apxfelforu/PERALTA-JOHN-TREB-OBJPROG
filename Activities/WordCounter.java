import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		String sentence = getSentenceInput();
		int wordCount = countWords(sentence);
		System.out.println("The sentence has "+ wordCount + " words.");
	}
	public static String getSentenceInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		return input.nextLine();
	}
	public static int countWords(String sentence){
		String[] words = sentence.trim().split("\\s+");
		return words.length;
	}
}
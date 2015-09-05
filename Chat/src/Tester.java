import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		
		while (true){
			line = scanner.nextLine();
			String[] words = line.split(" ");
			String[] wordstemplated = getTemplatedWords(words);
			
			for(int i = 0; i<wordstemplated.length; i++) {
				System.out.println(wordstemplated[i]);
			}
		}
		
	}
	
	private static String[] getTemplatedWords(String[] originalWords) {
		String[] templatedWords = new String[originalWords.length];
		for(int i = 0; i<originalWords.length; i++) {
			templatedWords[i] = getMarkForLeftLenght(i) + originalWords[i] + getMarkForRightLenght(originalWords.length - 1 - i);
		}
		return templatedWords;
	}
	
	private static String getMarkForLeftLenght(int size) {
		if(size == 1) {
			return "? ";
		} else if (size > 1) {
			return "* ";
		} else {
			return "";
		}
	}
	
	private static String getMarkForRightLenght(int size) {
		if(size == 1) {
			return " ?";
		} else if (size > 1) {
			return " *";
		} else {
			return "";
		}
	}
	
	
	
	
	
}

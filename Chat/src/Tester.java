import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		
		while (true){
			line = scanner.nextLine();
			String[] words = line.toLowerCase().split("[^А-Яа-яІі]+");
			String[] wordstemplated = getTemplatedWords(words);
			String answer = answer(wordstemplated);
			
			System.out.println(answer);
			
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
	
	private static String answer(String [] wordtemplated){
		Data d= Data.getInstance();
		//ключ id відповіді, значення кільлість повторень цієї відповіді
		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer> ();
		for(int i = 0;i<wordtemplated.length;++i){
			ArrayList<Integer> results =(ArrayList<Integer>) Data.getInstance().getTepmaptes().get(wordtemplated[i]);
			for(Integer g: results){
				//якщо в counts вже є дана відповідь то збільшуємо кількість її повторень +1
				if(counts.containsKey(g)){
					counts.put(g, counts.get(g)+1);
				}
				//якщо ні то створюємо нову відповідь з лічильником 1
				else{
					counts.put(g, 1);
				}
			}
		}
		int f=0, ad=0;
		for(int i = 0;i<counts.size();++i){
			if(f<counts.get(i))
				ad = i;
		}
		return (String) Data.getInstance().getAnswers().get(ad);
		
	}
	
	
	
	
}

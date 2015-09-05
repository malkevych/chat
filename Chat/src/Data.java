import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Data {

	private static HashMap<String, ArrayList<Integer>> templates = new HashMap<String, ArrayList<Integer>>();
	private static HashMap<Integer, String> answers = new HashMap<Integer, String>();
	
	public static class SingletonHolder {
        public static final Data HOLDER_INSTANCE = new Data();
    }
        
    public static Data getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    
    public static HashMap getTepmaptes() {
    	if(templates.isEmpty()) {
    		templates.put("* справи", new ArrayList<Integer>(Arrays.asList(0, 1, 3)));
    		templates.put("привіт *", new ArrayList<Integer>(Arrays.asList(2, 3)));
    		templates.put("хай *", new ArrayList<Integer>(Arrays.asList(2)));
    		templates.put("пака", new ArrayList<Integer>(Arrays.asList(4, 5)));
    		templates.put("до побачення", new ArrayList<Integer>(Arrays.asList(4, 5)));
    		templates.put("* думаєш *", new ArrayList<Integer>(Arrays.asList(6)));
    		templates.put("* вважаєш *", new ArrayList<Integer>(Arrays.asList(6)));
    		templates.put("? звати ?", new ArrayList<Integer>(Arrays.asList(7)));
    		templates.put("мене *", new ArrayList<Integer>(Arrays.asList(7)));
    		templates.put("ага", new ArrayList<Integer>(Arrays.asList(8,9)));
    		templates.put("добре", new ArrayList<Integer>(Arrays.asList(10)));
    		templates.put("* піти *", new ArrayList<Integer>(Arrays.asList(11)));
    		templates.put("* кіно *", new ArrayList<Integer>(Arrays.asList(11, 12, 13)));
    		templates.put("* театр *", new ArrayList<Integer>(Arrays.asList(11, 12, 13)));
    		templates.put("* подивитись *", new ArrayList<Integer>(Arrays.asList(11, 12, 13)));
    		templates.put("* фільм *", new ArrayList<Integer>(Arrays.asList(11, 12, 13)));
    		templates.put("* хочеш *", new ArrayList<Integer>(Arrays.asList(13)));
    		templates.put("* бажаєш *", new ArrayList<Integer>(Arrays.asList(13)));
    		templates.put("* хотіла *", new ArrayList<Integer>(Arrays.asList(13)));
    		templates.put("* любов *", new ArrayList<Integer>(Arrays.asList(14, 15, 16)));
    		templates.put("* кохання *", new ArrayList<Integer>(Arrays.asList(14, 15, 16)));
    		templates.put("* секс *", new ArrayList<Integer>(Arrays.asList(14, 15, 16)));
    		templates.put("* думаєш *", new ArrayList<Integer>(Arrays.asList(17)));
    	}
    	return templates;
    }
    
    
    public static HashMap getAnswers() {
    	if(answers.isEmpty()) {
    		answers.put(0, "Добре, чому питаєш?");
    		answers.put(1, "Супер");
    		answers.put(2, "І тобі привіт");
    		answers.put(3, "Привіт, нормально, а в тебе?");
    		answers.put(4, "Ага");
    		answers.put(5, "І тобі");
    		answers.put(6, "Ти думаєш хтось вміє думати?");
    		answers.put(7, "Прикольно, а мене Варя, ти дійсно хочеш зімною познайомитись?");
    		answers.put(8, "Беге");
    		answers.put(9, "Не будь таким малослівним");
    		answers.put(10, "Шо тобі добре?");
    		answers.put(11, "А сам ти туді не хочеш піти?");
    		answers.put(12, "Ти такий романтичний?");
    		answers.put(13, "А ти всіх запрошуєш?");
    		answers.put(14, "Ти багато знаєш про любов?");
    		answers.put(15, "Ти багато знаєш про кохання?");
    		answers.put(16, "Ти думаєш, що знаєш багато про кохання?");
    		answers.put(17, "Хто багато думає той швидко помирає?");
    		
    		
    		answers.put(999997, "Ти думаєш мені це цікаво?");
    		answers.put(999998, "Мені це не цікаво?");
    		answers.put(999999, "Слухай, давай змінемо тему?");
    		
    	}
    	return answers;
    }
    
    
	
}

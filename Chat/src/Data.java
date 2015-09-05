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
    		templates.put("* спарви *", (ArrayList<Integer>) Arrays.asList(0));
//    		templates.put("*  *", (ArrayList<Integer>) Arrays.asList(0));
    	}
    	return templates;
    }
    
    
    public static HashMap getAnswers() {
    	if(answers.isEmpty()) {
    		answers.put(0, "Добре, чому питаєш?");
    	}
    	return answers;
    }
    
    
    
	
}

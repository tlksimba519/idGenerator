package utility;

import java.util.HashMap;
import java.util.Map;

public class Converter {
	
	static Map<String, Integer>cityMap = new HashMap<String, Integer>();
	
	static {
		
		cityMap.put("A", 10); cityMap.put("B", 11); cityMap.put("C", 12);
		cityMap.put("D", 13); cityMap.put("E", 14); cityMap.put("F", 15);
		cityMap.put("G", 16); cityMap.put("H", 17); cityMap.put("I", 34);
		cityMap.put("J", 18); cityMap.put("K", 19); //cityMap.put("L", 21);
		cityMap.put("M", 21); cityMap.put("N", 22); cityMap.put("O", 35);
		cityMap.put("P", 23); cityMap.put("Q", 24); //cityMap.put("R", 27);
		/*cityMap.put("S", 28);*/ cityMap.put("T", 27); cityMap.put("U", 28);
		cityMap.put("V", 29); cityMap.put("W", 32); cityMap.put("X", 30);
		/*cityMap.put("Y", 34);*/ cityMap.put("Z", 33);
		
	}
	
	public static int convertCity(String city) {
		
		String regex = "[A-Z]";
		
		if(city.matches(regex)) {
			
			try {
				
				return cityMap.get(city);
				
			} catch(NullPointerException e) {
				
				Conversation.output("This city is no longer provide to use.");
				System.exit(0);
				return 0;
				
			}
			
		} else {
			
			Conversation.output("Not valid city.");
			System.exit(0);
			return 0;
			
		}
		
	}
	
	public static int convertGender(String gender) {
		
		switch(gender.toUpperCase()) {
		
			case "M" :
				return 1;
				
			case "F" :
				return 2;
				
			default :
				System.out.println("Not valid gender");
				System.exit(0);
				return 0;
				
		}
		
	}
	
}

package utility;

import java.util.HashMap;
import java.util.Map;

public class Converter {
	
	static Map<String, Integer>cityMap = new HashMap<String, Integer>();
	
	static {
		
		cityMap.put("A", 10); cityMap.put("B", 11); cityMap.put("C", 12); //台北  台中  基隆
		cityMap.put("D", 13); cityMap.put("E", 14); cityMap.put("F", 15); //台南  高雄  新北
		cityMap.put("G", 16); cityMap.put("H", 17); cityMap.put("I", 34); //宜蘭  桃園  嘉義
		cityMap.put("J", 18); cityMap.put("K", 19); cityMap.put("M", 21); //竹縣  苗栗  南投
		cityMap.put("N", 22); cityMap.put("O", 35); cityMap.put("P", 23); //彰化  竹市  雲林
		cityMap.put("Q", 24); cityMap.put("T", 27); cityMap.put("U", 28); //嘉義  屏東  花蓮
		cityMap.put("V", 29); cityMap.put("W", 32); cityMap.put("X", 30); //台東  金門  澎湖
		cityMap.put("Z", 33); //連江
		//"L", "R", "S", "Y" 沒在用
	}
	
	public static int convertCity(String city) {
		
		if(city.matches("[A-Z]")) {
			
			try {
				
				return cityMap.get(city);
				
			} catch(NullPointerException e) { //抓LRSY
				
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
		
		switch(gender.toUpperCase()) { //統一轉大寫方便驗證
		
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

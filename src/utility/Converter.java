package utility;

import java.util.HashMap;
import java.util.Map;

public class Converter {
	
	static Map<String, Integer>cityMap = new HashMap<String, Integer>();
	
	static {
		
		cityMap.put("A", 10); cityMap.put("B", 11); cityMap.put("C", 12); //�x�_  �x��  ��
		cityMap.put("D", 13); cityMap.put("E", 14); cityMap.put("F", 15); //�x�n  ����  �s�_
		cityMap.put("G", 16); cityMap.put("H", 17); cityMap.put("I", 34); //�y��  ���  �Ÿq
		cityMap.put("J", 18); cityMap.put("K", 19); cityMap.put("M", 21); //�˿�  �]��  �n��
		cityMap.put("N", 22); cityMap.put("O", 35); cityMap.put("P", 23); //����  �˥�  ���L
		cityMap.put("Q", 24); cityMap.put("T", 27); cityMap.put("U", 28); //�Ÿq  �̪F  �Ὤ
		cityMap.put("V", 29); cityMap.put("W", 32); cityMap.put("X", 30); //�x�F  ����  ���
		cityMap.put("Z", 33); //�s��
		//"L", "R", "S", "Y" �S�b��
	}
	
	public static int convertCity(String city) {
		
		if(city.matches("[A-Z]")) {
			
			try {
				
				return cityMap.get(city);
				
			} catch(NullPointerException e) { //��LRSY
				
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
		
		switch(gender.toUpperCase()) { //�Τ@��j�g��K����
		
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

package idGenerator;

import utility.Conversation;
import utility.Converter;

public class Generator {
	
	private String city;
	private int cityNum;
	private int genderNum;
	
	public Generator(String city,String gender) {
		
		this.city = city;
		this.cityNum = Converter.convertCity(city);
		this.genderNum = Converter.convertGender(gender);
		
	}
	
	public String generate() {
		
		int num1 = (int) (Math.random() * 10); int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10); int num4 = (int) (Math.random() * 10);
		int num5 = (int) (Math.random() * 10); int num6 = (int) (Math.random() * 10);
		int num7 = (int) (Math.random() * 10);
		
		int numLast = (10 - ((((cityNum / 10) * 1) + ((cityNum % 10) * 9) + genderNum * 8 +
				num1 * 7 + num2 * 6 + num3 * 5 + num4 * 4 + num5 * 3 + num6 * 2 + num7)% 10)) % 10;
		
		String newId = city + genderNum + num1 + num2 + num3 + num4 + num5 + num6 + num7+ numLast;
		
		if(newId.matches("[A-Z]\\d{9}")) return newId; 
		
		Conversation.output("An error has occured");
		return null;
		
	}
	
}

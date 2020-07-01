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
		int num7 = (int) (Math.random() * 10); //7碼流水碼 隨機產生
		
		/*
		 * 身分證驗證演算法說明
		 * 驗證 :將城市碼換算成數字後，總共11位數依序乘上指定的倍數加總後除以10，餘數為0即為合法身分證
		 * 過程反推製造 :隨機產生流水碼，反求出最後一碼(即檢查碼)
		 * 倍數表 :(1 9)城市碼 (8)性別碼    (7 6 5 4 3 2 1)流水碼   (1)檢查碼
		 */
		int numLast = (10 - ((((cityNum / 10) * 1) + ((cityNum % 10) * 9) + genderNum * 8 +
				num1 * 7 + num2 * 6 + num3 * 5 + num4 * 4 + num5 * 3 + num6 * 2 + num7)% 10)) % 10;
		
		String newId = city + genderNum + num1 + num2 + num3 + num4 + num5 + num6 + num7+ numLast;
		
		//回傳前多驗證一次完整性
		if(newId.matches("[A-Z]\\d{9}")) return newId; 
		
		Conversation.output("An error has occured.");
		return null;
		
	}
	
}

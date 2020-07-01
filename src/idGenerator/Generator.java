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
		int num7 = (int) (Math.random() * 10); //7�X�y���X �H������
		
		/*
		 * ���������Һt��k����
		 * ���� :�N�����X���⦨�Ʀr��A�`�@11��ƨ̧ǭ��W���w�����ƥ[�`�ᰣ�H10�A�l�Ƭ�0�Y���X�k������
		 * �L�{�ϱ��s�y :�H�����ͬy���X�A�ϨD�X�̫�@�X(�Y�ˬd�X)
		 * ���ƪ� :(1 9)�����X (8)�ʧO�X    (7 6 5 4 3 2 1)�y���X   (1)�ˬd�X
		 */
		int numLast = (10 - ((((cityNum / 10) * 1) + ((cityNum % 10) * 9) + genderNum * 8 +
				num1 * 7 + num2 * 6 + num3 * 5 + num4 * 4 + num5 * 3 + num6 * 2 + num7)% 10)) % 10;
		
		String newId = city + genderNum + num1 + num2 + num3 + num4 + num5 + num6 + num7+ numLast;
		
		//�^�ǫe�h���Ҥ@�������
		if(newId.matches("[A-Z]\\d{9}")) return newId; 
		
		Conversation.output("An error has occured.");
		return null;
		
	}
	
}

package idGenerator;

import java.io.IOException;

import utility.Conversation;

public class Main {

	public static void main(String[] args) throws IOException {
	
		Conversation.output("Please enter city number(A - Z) : ");
		String cityInput = Conversation.input();
		Conversation.output("Please enter gender(M / F) : ");
		String genderInput = Conversation.input();
		Generator gene = new Generator(cityInput,genderInput);
		Conversation.output(gene.generate());
		
	}

}

package app;

import model.ParserHTML;

public class App {
	public static void main(String [] args) {
		ParserHTML classUnderTest = new ParserHTML();

		System.out.println("Headlines atuais:");
        System.out.println(classUnderTest.parseFromWikiTitle());

        System.out.println("Links principais:");
        System.out.println(classUnderTest.parseFromWikiLink());    
	}
}
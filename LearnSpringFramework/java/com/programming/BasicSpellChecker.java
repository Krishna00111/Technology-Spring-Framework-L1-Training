package com.programming;

public class BasicSpellChecker implements SpellChecker{
	
	public void checkSpelling(String emailMessage) {
		if (emailMessage != null) {
			System.out.println("Checking spelling using BasicSpellChecker");
			System.out.println("Spell Checking Completed!");
			
		} else {
			throw new RunTimeException("An exception occurred"+ "while checking spelling");
		}
	}

}

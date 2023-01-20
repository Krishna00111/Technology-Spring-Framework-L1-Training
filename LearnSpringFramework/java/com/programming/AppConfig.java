package com.programming;

public class AppConfig {
	
	@Bean(name = "basicSpellChecker")
	public BasicSpellChecker createBasicSpellChecker() {
		return new BasicSpellChecker();
	}
	
	@Bean(name = "advancedSpellChecker")
	public AdvacnedSpellChecker createAdvancedSpellChecker() {
		return new AdvancedSpellChecker();
	}
	
	@Bean(name = "advancedSpellChecker")
	public AdvacnedSpellChecker createAdvancedSpellChecker() {
		return new EmailClient(createBasicSpellChecker());
	}

}

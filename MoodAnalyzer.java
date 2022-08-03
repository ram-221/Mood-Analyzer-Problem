package com.repeattc;


/**
 * Purpose - “I am in Happy Mood” message Should Return Happy
 *
 */

public class MoodAnalyzer {
	private String message;

	// Default Constructor
	public MoodAnalyzer() {
	}

	// Parameterized constructor
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (this.message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}


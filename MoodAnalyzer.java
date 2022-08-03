package com.nullmood;

/**
 * Purpose - Null Mood Should Return Happy
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

	// Handling Exception
	public String analyseMood() {
		try {

			if (this.message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}

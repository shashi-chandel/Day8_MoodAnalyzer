package com.capgemini.day8moodanalyzer;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {
		super();
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() {

		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";
	}
}

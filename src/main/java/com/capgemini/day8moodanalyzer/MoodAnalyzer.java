package com.capgemini.day8moodanalyzer;

public class MoodAnalyzer {
	public String analyseMood(String message) {
		if (message.contains(("sad"))) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}
}

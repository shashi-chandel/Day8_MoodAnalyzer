package com.capgemini.day8moodanalyzer;

import com.capgemini.day8moodanalyzer.MoodAnalysisException.ExceptionType;

public class MoodAnalyzer {
	private String message;

	public MoodAnalyzer() {
		super();
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(ExceptionType.ENTERED_EMPTY, "Empty message");
			if (message.contains(("Sad")))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {

			throw new MoodAnalysisException(ExceptionType.ENTERED_NULL, "Null message");

		}
	}
}

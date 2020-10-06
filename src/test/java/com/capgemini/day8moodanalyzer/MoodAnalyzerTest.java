package com.capgemini.day8moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {

		}
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy mood");
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {

		}
	}

	@Test
	public void givenMessage_WhenNull_ShouldThrowCustomException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);

		try {
			moodAnalyzer.analyseMood();

		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ShouldThrowCustomException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyseMood();
		} catch (MoodAnalysisException e) {
			e.printStackTrace();
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}

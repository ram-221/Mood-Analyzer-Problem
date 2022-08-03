package com.repeattc;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelab.junit.MoodAnalyzer;

public class MoodAnalyzerTest {

	@Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzerMood("I am In a Sad Mood");
        Assert.assertEquals("SAD", mood);
}
}
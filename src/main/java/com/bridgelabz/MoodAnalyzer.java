package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String analyseability() {
        try {
            if (message.contains("Sad"))
                return "SAD";
            return "Happy";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
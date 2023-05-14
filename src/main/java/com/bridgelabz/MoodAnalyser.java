package com.bridgelabz;

/*
* Created Class MoodAnalyser
 */
public class MoodAnalyser {
    // define variable message
    private String message;
// created constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}

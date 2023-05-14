import com.bridgelabz.MoodAnalyser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/*
* Create MoodAnalyser Test class to do test
 */
public class MoodAnalyserTest {
    // test for sad mood
    @Test
    public void testAnalyseMoodSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("SAD", mood);
    }

    // test for happy mood
    @Test
    public void testAnalyseMoodAny() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("HAPPY", mood);

    }
}


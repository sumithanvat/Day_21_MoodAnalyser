        import com.bridgelabz.MoodAnalyser;
        import com.bridgelabz.MoodAnalysisException;
        import com.bridgelabz.MoodAnalyser;
        import org.junit.Test;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.BeforeAll;

        import static org.junit.Assert.assertEquals;



            public class MoodAnalyserTest {

                static MoodAnalyser moodAnalyser;

                @BeforeAll
                public static void init() throws MoodAnalysisException {
                    moodAnalyser = new MoodAnalyser();
                    System.out.println("Implement to all");
                }

                @Test
                void givenMessageWhenCheckedReturnSad() {
                    try {
                        String mood = moodAnalyser.analyseMood();
                        Assertions.assertEquals("SAD", mood);
                    } catch (MoodAnalysisException e) {
                        System.out.println("Happy");
                    }
                }

                @Test
                void givenMessageWhenCheckedReturnHappy() {
                    try {
                        String mood = moodAnalyser.analyseMood();
                        Assertions.assertEquals("Happy", mood);
                    } catch (MoodAnalysisException e) {
                        System.out.println("Happy");
                    }
                }
            }
import java.util.ArrayList;

public class GlobalVars {

    private static int rightAnswers = 0;
    private static int questionsAsked = 0;
    private static String surcePath = "";
    private static ArrayList<String> words = null;

    public static void setRightAnswers(int rightAnswers) {
        GlobalVars.rightAnswers = rightAnswers;
    }

    public static int getRightAnswers() {
        return rightAnswers;
    }

    public static void setQuestionsAsked(int questionsAsked) {
        GlobalVars.questionsAsked = questionsAsked;
    }

    public static int getQuestionsAsked() {
        return questionsAsked;
    }

    public static void setSurcePath(String surcePath) {
        GlobalVars.surcePath = surcePath;
    }

    public static String getSurcePath() {
        return surcePath;
    }

    public static void setWords(ArrayList<String> words) {
        GlobalVars.words = words;
    }

    public static ArrayList<String> getWords() {
        return words;
    }
}

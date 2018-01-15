import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StringsManager {
    private ArrayList<String> words;

    StringsManager(ArrayList<String> words)
    {
        this.words = words;
    }

    public AnswerListContainer getAnswerOptions()
    {
        String word = words.get(new Random().nextInt(words.size()));
        AnswerListContainer answerListContainer = new AnswerListContainer();
        ArrayList<String> vars = new ArrayList<>();
        String temp;
        int indOfRight=9;


        StringBuilder stringBuilder = new StringBuilder(word.toLowerCase());

        vars.add(word);
        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i)=='а'||word.charAt(i)=='о'||word.charAt(i)=='я'||
                    word.charAt(i)=='и'||word.charAt(i)=='у'||word.charAt(i)=='е'||
                    word.charAt(i)=='ё'||word.charAt(i)=='ю'||word.charAt(i)=='ы' || word.charAt(i)=='э')
            {
                stringBuilder.setCharAt(i, Character.toUpperCase(word.charAt(i)));
                temp = stringBuilder.toString();
                stringBuilder.setCharAt(i, word.charAt(i));

                vars.add(temp);
            }
        }

        Collections.shuffle(vars);

        for (int i = 0; i < vars.size(); i++) {
            if(word.equals(vars.get(i))) {
                indOfRight = i;
                break;
            }
        }

        answerListContainer.fill(vars,indOfRight);

        return answerListContainer;
    }
}

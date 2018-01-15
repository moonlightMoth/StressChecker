import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException
    {
        GlobalVars.setSurcePath("C://surce.txt");
        FileManager fileManager = new FileManager(GlobalVars.getSurcePath());
        GlobalVars.setWords(fileManager.readWordsFromFile());

        new GraphicsCreator().createGraphics();
    }

    private static String[] divideStringIntoMass(String string)
    {
        return string.split("\n");
    }
}

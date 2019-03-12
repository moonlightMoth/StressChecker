import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.AccessController;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) throws IOException
    {
        GlobalVars.setSurcePath("surce.txt");
        FileManager fileManager = new FileManager(GlobalVars.getSurcePath());
        GlobalVars.setWords(fileManager.readWordsFromFile());

        new GraphicsCreator().createGraphics();
    }

    private static String chooseLiter()
    {
        String liter;
        char literChar = 66;

        for (int i = 67; i < 91; i++) {

            literChar++;
            liter = String.valueOf(literChar);
            Path directory = Paths.get(liter + "://");

            if(Files.isWritable(directory)) {
                System.out.println("got perm :>");
                return liter;
            }
        }
        return "C";
    }
}

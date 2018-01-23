import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileManager {

    private File source;

    FileManager(String path)
    {
        source = new File(path);

        if(!source.exists())
        {
            writeSourceFile(GlobalConsts.getNastyStartingData());
        }

    }

    public ArrayList<String> readWordsFromFile() throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        String string;

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(source), StandardCharsets.UTF_8));

        while ((string = bufferedReader.readLine()) != null) {
            strings.add(string);
            System.out.println(string);
        }

        return strings;
    }

    private void writeSourceFile(String[] data)
    {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(source);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            PrintWriter printWriter = new PrintWriter(outputStreamWriter);

            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
                printWriter.println(data[i]);
            }
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOEx");
        }
    }

    private boolean checkEmptiness()
    {
        try {
            FileReader fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            if(bufferedReader.readLine()==null)
                return true;
            else
                return false;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e1)
        {
            System.out.println("IOEx checkEmptiness");
        }
        return true;
    }
}

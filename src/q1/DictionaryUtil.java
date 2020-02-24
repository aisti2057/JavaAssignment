package q1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryUtil {

    private static FileReader fileReader = null;
    private static BufferedReader bufferedReader = null;

    public static Map<String, List<String>> convertFileToMap(String filePath) throws IOException {
        Map<String, List<String>> dictionary = new HashMap<>();
        String word;
        List<String> definitions;
        if (doesFileExist(filePath)) {
            String line = "";
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                String[] text = line.split("-");
                String[] def = text[1].split(",");
                word = text[0];
                definitions = Arrays.asList(def);
                dictionary.put(word, definitions);
            }
        }
        return dictionary;
    }

    private static boolean doesFileExist(String filePath) {
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException ex) {
            System.err.println("File does not exist");
            ex.printStackTrace();
            return false;
        }
        return true;
    }
}

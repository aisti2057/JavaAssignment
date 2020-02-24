package q1;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class TestDictionary {

    public static void main(String[] args) throws IOException {
        String filePath = "src/q1/words.txt";
        Map<String, List<String>> dictionary = DictionaryUtil.convertFileToMap(filePath);

        for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            for (String definition : entry.getValue()) {
                System.out.println(definition);
            }
        }
    }

}

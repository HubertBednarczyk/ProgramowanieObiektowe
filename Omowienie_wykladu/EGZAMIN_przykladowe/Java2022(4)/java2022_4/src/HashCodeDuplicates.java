import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HashCodeDuplicates {
    public static void main(String[] args) {
        Map<Integer, HashSet<String>> map = new TreeMap<>();
        try {
            Scanner sc = new Scanner(new File("large_file.txt"));
            while (sc.hasNext()) {
                String word = sc.next();
                int hashCode = word.hashCode();
                if (!map.containsKey(hashCode)) {
                    map.put(hashCode, new HashSet<>());
                }
                map.get(hashCode).add(word);
            }
            sc.close();
            for (Map.Entry<Integer, HashSet<String>> entry : map.entrySet()) {
                if (entry.getValue().size() > 1) {
                    System.out.println("Hash code: " + entry.getKey());
                    System.out.println("Words: " + entry.getValue());
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

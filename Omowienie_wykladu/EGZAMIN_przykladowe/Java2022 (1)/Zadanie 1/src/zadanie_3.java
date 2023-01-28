import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class FileLineReader {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: FileLineReader <file>");
            return;
        }

        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        String[] linie = lines.toArray(new String[lines.size()]);

        // (a)
        lines.sort(null);
        System.out.println("Sorted lines (natural order):");
        for (String l : lines) {
            System.out.println(l);
        }

        // (b)
        lines.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted lines (by length):");
        for (String l : lines) {
            System.out.println(l);
        }

        // (c)
        Arrays.sort(linie);
        System.out.println("Sorted linie (natural order):");
        for (String l : linie) {
            System.out.println(l);
        }

        // (d)
        Arrays.sort(linie, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted linie (by length):");
        for (String l : linie) {
            System.out.println(l);
        }
    }
}

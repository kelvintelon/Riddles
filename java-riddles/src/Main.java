import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // consider making this an array where each index is an object that holds two keys.
        // One key value pair for the question and another for the answer

        File csvRiddles = new File("TSVriddles.tsv");
        String buildMapString = "[" + "\n";
        int initialLength = buildMapString.length();
        try (Scanner scanner = new Scanner(csvRiddles)) {

            while (scanner.hasNextLine()) {
                String[] thisLine = scanner.nextLine().split("\\t");
                if (buildMapString.length() == initialLength) {
                    buildMapString += "{" + "Question: \"" + thisLine[0] + "\", \n Answer: \"" + thisLine[1] + "\"},";
                } else {
                    buildMapString += "\n" + "{Question: \"" + thisLine[0] + "\", \n Answer: \"" + thisLine[1] + "\"},";
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        buildMapString = buildMapString.substring(0,buildMapString.length()-1) + "\n" + "]";
        System.out.println(buildMapString);
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File csvRiddles = new File("TSVriddles.tsv");
        String buildMapString = "const map = new Map([" + "\n";
        int initialLength = buildMapString.length();
        try (Scanner scanner = new Scanner(csvRiddles)) {

            while (scanner.hasNextLine()) {
                String[] thisLine = scanner.nextLine().split("\\t");
                if (buildMapString.length() == initialLength) {
                    buildMapString += "[\"" + thisLine[0] + "\", \"" + thisLine[1] + "\"],";
                } else {
                    buildMapString += "\n" + "[\"" + thisLine[0] + "\", \"" + thisLine[1] + "\"],";
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        buildMapString = buildMapString.substring(0,buildMapString.length()-1) + "\n" + "]);";
        System.out.println(buildMapString);
    }
}
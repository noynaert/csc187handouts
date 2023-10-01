import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String target = "Mi";
        boolean beginsWithTarget;
        boolean containsTarget;
        Scanner input = null;

        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.printf("Error.  Did not find file %s\n",fileName);
            System.exit(1);
        }

        while(input.hasNext()) {
            String word = input.next();
            beginsWithTarget = word.startsWith(target);
            containsTarget   = word.toLowerCase().contains(target.toLowerCase());
            System.out.printf("\nI read \"%s\"\n", word);
            System.out.printf("\t %s begins with %s: %b\n", word, target, beginsWithTarget);
            System.out.printf("\t %s contains %s:    %b\n",word, target,containsTarget);
        }
        input.close();
        System.out.println("Done!");
    }
}

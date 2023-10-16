// https://raw.githubusercontent.com/noynaert/csc187handouts/main/zzz_data/birthdays.csv

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class readFromURL {
    public static void main(String[] args) {
        try {
            readFromURL("https://raw.githubusercontent.com/noynaert/csc187handouts/main/zzz_data/birthdays.csv");
            readFromSomeplaceElse("dummy.txt");
        } catch (Exception e) {
            System.err.println("THERE WAS A PROBLEM: " + e.getMessage());
            System.exit(2);
        }
        System.out.println("Done");
    }

    private static void readFromSomeplaceElse(String file) {
    }

    public static void readFromURL(String address) throws IOException {
        System.out.println("Reading from " + address);


        URL url = new URL(address);
        Scanner input = new Scanner(url.openStream());

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            System.out.println(line);
        }
        input.close();

    }
}


# 11.030 Creating a Log File for errors

The following file illustrates appending to a file as a way to create a log.  

Note that in the parse() routine, the method makeLogFile() is called in the catch{}

The makeLogFile() method creates a timestamp and then appends the timestamp and e.getMessage() to the log file.

```java
import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

/** This class illustrates the use of a log file to handle exceptions.
 * 
 * @since November, 2023
 * @author J. Evan Noynaert
 */

public class Unit11 {
    public static String LOGFILE = "errors.log";
    public static void main(String[] args) {

       System.out.println("Starting");
       readReals("data.txt");
       System.out.println("Done!");

    }
    public static void readReals(String fileName){
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println( e.getMessage());
            System.exit(1);
        }
        String line = input.nextLine();
        input.close();

        String[] fields = line.split("\s+");
        for(int i = 0;i<fields.length;i++){
            double number = parse(fields[i]);
            System.out.printf("I read %f\n", number);
        }
    }

    /**
     * Parses a double.  If there is an error, makeLogFile(e) is called to handle the exception.
     * @param s  A String that holds a double.
     * @return   The value corresponding to the string.  Returns Double.NaN if the string is not a valid double.
     */
    public static double parse(String s){
        double number = Double.NaN;
        try{
            number = Double.parseDouble(s);
        }catch(Exception e){
            makeLogFile(e);
        }

        return number;
    }

    /**
     * makeLogFile generates a timestamp and then appends the exception message to a file called error.log
     * @param e  The exception that was triggered.
     */
    private static void makeLogFile(Exception e) {
        LocalDateTime timeStamp = LocalDateTime.now();
        PrintWriter log = null;

        try {
            log = new PrintWriter(new FileWriter(new File("error.log"),true));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
        }
        log.printf("%s Error: %s\n", timeStamp, e.getMessage());
        log.close();
    }


    public static void addToFile(String s){
        String fileName = "output.txt";
        PrintWriter output = null;

        try {
            output = new PrintWriter( new FileWriter(new File(fileName), true));
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(187);
        }

        output.printf("The message is %s\n", s);
        output.flush();

        output.close();

    }


    public static void makeFile(String s) {
        String fileName = "output.txt";
        PrintWriter output = null;

        try {
            output = new PrintWriter(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(187);
        }

        output.println("Starting...");
        output.printf("The message is: %s\n",s);
        output.println("Done!");
        output.flush();

        output.close();
    }
}

```

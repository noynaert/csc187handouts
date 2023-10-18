# 09.010 readLine()

The .readLine() method reads an entire line.  It returns a string.  It strips off the ending \n, but it leaves any other white space.

## `trim()`

Trim removes any leading and trailing blank spaces.  If there are non-whitespace characters, the internal spaces are not removed.  

Often we trim on reading.

```java
    String line = input.nextLine().trim();
```

## The "Last Line" problem

The nextLine() might not correspond to what your editor shows.  Most editors will show a blank line at the end of a file if the last physical line ends with \n.

## Splitting and a little regex

Splitting a string always returns at least one string, even if it is empty.

```java
String[] words = line.split(":");
```

The split() method requires a ***regex*** or *Regular Expression*.

A regular expression may include a single character.  For example  `line.split(":")`

However, there are times where this does not work well.  We often want to split on blanks.  However, blanks have some problems as separators.

* There is more than one type of blank.  For example, tabs can be used as blanks
* Blanks often happen together.  

In regex, the symbol `\s` is used to indicate any type of whitespace (ASCII code less than 32, or Unicode less than \u0020).  

Putting + after something means "one or more."

Therefore we can use the following to split any time there is one or more blanks between non-blank characters.

Note that split always returns at least 1 entry, even if the line is empty.

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            String fileName = "capitals.txt";
            int count = countLines(fileName);
            int wordCount = countToken(fileName, " +");


            System.out.println("Count: " + count);
            System.out.println("Words: " + wordCount);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(23);
        }

        System.out.println("\uD83C\uDF10 \uD83C\uDF0D We are the world! \uD83C\uDF0E \uD83C\uDF10");
    }

    public static int countToken(String fileName, String regex) throws FileNotFoundException {
        int lineCount = 0;
        int tokenCount = 0;
        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();

            String[] tokens = line.split(regex);
            int n = tokens.length;
            System.out.printf("%2d tokens were found in >%s<\n", n, line);

            //Print out the individual tokens
            for (int i = 0; i < n; i++) {
                System.out.printf("\t [%2d] >%s<\n", i, tokens[i]);
            }

//            if(n == 1  && tokens[0].isEmpty()){
//                tokenCount += n;
//            }

            if (n == 1) {
                if (tokens[0].isEmpty()) {
                    n--;
                }
            }
            tokenCount += n;
            lineCount++;
        }

        input.close();
        return tokenCount;
    }

    public static int countLines(String fileName) throws FileNotFoundException {
        int count = 0;

        Scanner input = new Scanner(new File(fileName));
        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            count++;
        }

        input.close();
        return count;
    }
}
```

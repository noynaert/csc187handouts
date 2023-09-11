# 03.080 Scanner for Keyboard Input

```java
import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);

    System.out.print("What is your favorite integer? ");   //prompt
    int number = keyboard.nextInt();
    System.out.println("Your favorite number is " + number); //echo print
    keyboard.close();

    System.out.println("Done");
    }
}

```

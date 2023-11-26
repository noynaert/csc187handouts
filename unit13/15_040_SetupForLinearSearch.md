# Setup for linear search

```java
import edu.missouriwestern.noynaert.government.*;

import java.util.Scanner;

public class LinearSearch {
    static final int MAX = 100;
    public static void main(String[] args){
        President[] presidents = new President[MAX];
        int n = Homework12.readPresidents("presidents.tsv",presidents);
        //Homework12.printPresidents (presidents,n);
        printPresidents(presidents,n);

    }
    public static void printPresidents(President[] presidents,int n) {
        printHeader();
        for(int i=0;i<n;i++)
            System.out.println(presidents[i]);
    }
    public static void printHeader(){
        System.out.printf("%-25s %-11s %-25s %-11s %-25s","Name","Birth Date","Birth Place","Death Place","Death Date");

    }

    /**
     * Gets the name from the keyboard and returns a Name.
     * @return An instance of class Name
     */
    protected Name makeName(){
        Name name = null;
        String wholeName;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the name? ");
        wholeName = keyboard.nextLine();
        name = Homework12.makeName(wholeName);
        return name;
    }
}

```
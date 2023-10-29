# 10.100 Array of Objects

Note that the array of states was created with the following code:

```java
State[] states = new State[MAX_STATES];
```
All of the array and file manipulation goes on outside of State.  The State class only knows about one state at a time.  It does not know how to read itself from a file.  In our program, all of that happens in main.

Note that we got rid of parallel arrays.

```Java  
import edu.missouriwestern.noynaert.unit10.State;  
  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;  
  
public class Unit10 {  
    public static final int MAX_STATES = 60;  
  
    public static void main(String[] args) {  
        int n = MAX_STATES;  
        State[] states = new State[MAX_STATES];  
        String fileName = "states.tsv";  
  
        n = readStates(fileName, states, MAX_STATES);  
  
        print(states, n);  
        System.out.println("Done!");  
  
    }  
  
    private static int readStates(String fileName, State[] states, int maximumSize) {  
        int n = 0;  
        Scanner input = null;  
  
        try {  
            input = new Scanner(new File(fileName));  
        } catch (FileNotFoundException e) {  
           System.err.println(e.getMessage());  
           System.exit(187);  
        }  
  
        //Throw away the header line  
        String line = input.nextLine();  
  
        //read the actual data  
        n = 0;  
        while(n < maximumSize && input.hasNextLine()){  
            line = input.nextLine().trim();  
            String[] fields = line.split("\t");  
            if(fields.length == 3){  
                String name = fields[1];  
                int population = parse(fields[2]);  
                State state = new State(name, population);  
                states[n] = state;  
                n++;  
            }  
        }  
        input.close();  
        return n;  
    }  
  
    public static void print(State[] states, int n){  
        System.out.println("\nList of the states");  
        for(int i = 0; i<n; i++)  
            System.out.println(states[i]);  
    }  
  
  
  
  
    public static int parse(String numberAsString) {  
        int number = Integer.MIN_VALUE;  
        String s = numberAsString.replaceAll(",", "");  
        s = s.replaceAll("\"", "");  //brute force removal of any double quotes  
        try {  
            number = Integer.parseInt(s);  
        }catch(Exception e){  
            //do nothing because number is already set.  
        }  
        return number;  
    }  
}
```
import java.io.File;  
import java.io.FileNotFoundException;  
import java.time.LocalDate;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Scanner;  
  
public class Unit15 {  
    public static void main(String[] args) {  
        ArrayList<String> list = new ArrayList<>();  
        readCounties(list, "missouriCounties.txt");  
        System.out.printf("There are %d elements on the list\n", list.size());  
        Collections.sort(list);  
        print(list);  
  
        System.out.println("Done");  
    }  
  
    public static void readCounties(ArrayList<String> list, String fileName) {  
        Scanner input = null;  
        try {  
            input = new Scanner(new File(fileName));  
        } catch (FileNotFoundException e) {  
            throw new RuntimeException(e);  
        }  
  
        while (input.hasNextLine()) {  
            String line = input.nextLine().trim();  
            if (line.length() > 0) {  
                list.add(line);  
            }  
        }  
        input.close();  
    }  
  
    public static <E> void print(ArrayList<E> list) {  
        for (E e : list) {  
            System.out.println(e);  
        }  
    }  
  
    public static void print(String[] list, int n) {  
        for (int i = 0; i < n; i++) {  
            String word = list[i];  
            System.out.println(word);  
        }  
    }  
  
    public static void print(President[] list, int n) {  
        for (int i = 0; i < n; ) {  
            President president = list[i];  
            System.out.println(president);  
        }  
    }  
  
    public static void print(LocalDate[] list, int n) {  
        for (int i = 0; i < n; i++) {  
            LocalDate event = list[i];  
            System.out.println(event);  
        }  
    }  
  
    public static <E> void print(E[] list, int n) {  
        for (int i = 0; i < n; i++) {  
            E e = list[i];  
            System.out.println(e);  
        }  
    }  
}  
  
class President {  
}
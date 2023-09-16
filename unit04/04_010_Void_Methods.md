# 04.020 Void Methods

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nStarting...");
        printToday();

        System.out.println("Done!");
    }
    public static void printToday(){
        LocalDate today = LocalDate.now();
        System.out.printf("Today is %s.\n", today.getDayOfWeek());
    }
}
```

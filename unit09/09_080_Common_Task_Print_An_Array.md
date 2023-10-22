# 09.080 Common Task: Print an Array

```java
public class Main {
    private static final int MAXIMUM_PHYSICAL_SIZE = 5;
    public static void main(String[] args) {

        double[] list = new double[MAXIMUM_PHYSICAL_SIZE];
        double[] temperatures = {-50.0, -40.0, 0, 32.0, 33.0, 98.6};
        int n = 0;

        list[0] = Math.PI;
        list[1] = 1.234;
        list[2] = Math.random();
        n = 3;

        print(temperatures, temperatures.length);
        print(list,n);

        System.out.println("\uD83C\uDF10 \uD83C\uDF0D We are the world! \uD83C\uDF0E \uD83C\uDF10");
    }

    public static void print(double[] list, int n){
        //print a header
        System.out.printf("----- Printing %d items -----\n", n);

        //print the array
        for(int i=0; i<n; i++){
            System.out.printf("[%2d] %7.1f\n", i, list[i]);
        }
        //print a footer
        System.out.println("--------------------\n");
    }


    public static void print(String[] tokens, int n){
        System.out.println("\nPrinting strings " + n);
        for(int i=0; i<n;i++){
            System.out.printf("[%2d] >%s<\n", i, tokens[i]);
        }
        System.out.println("Finished Printing");
    }
} 
```


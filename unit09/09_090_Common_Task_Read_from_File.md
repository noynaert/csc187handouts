# 09.090 Common Task: Read an Array

```java
public class Main {
    private static final int MAXIMUM_PHYSICAL_SIZE = 15;

    public static void main(String[] args) {

        double[] list = new double[MAXIMUM_PHYSICAL_SIZE];
        double[] temperatures = {-50.0, -40.0, 0, 32.0, 33.0, 98.6};
        int n = 0;

        n = readFromFile("data.txt", list, MAXIMUM_PHYSICAL_SIZE);
        print(list, n);

        System.out.println("\uD83C\uDF10 \uD83C\uDF0D We are the world! \uD83C\uDF0E \uD83C\uDF10");
    }

    /**
     * @param list The array to be filled.  It is assumed to be instantiated, but empty.
     * @param max  The physical capacity of the array
     * @return n
     */
    public static int readFromFile(String fileName, double[] list, int max) {
        int n = 0;
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(187);
        }

        while (input.hasNextDouble() && n < max) {
            double number = input.nextDouble();
            list[n] = number;
            n++;
        }

        input.close();
        return n;
    }

    public static void print(double[] list, int n) {
        //print a header
        System.out.printf("----- Printing %d items -----\n", n);

        //print the array
        for (int i = 0; i < n; i++) {
            System.out.printf("[%2d] %7.1f\n", i, list[i]);
        }
        //print a footer
        System.out.println("--------------------\n");
    }
}
```

# 09.100  Common Task: Sum an Array and Find the Average

```Java
public class Main {
    private static final int MAXIMUM_PHYSICAL_SIZE = 15;

    public static void main(String[] args) {

        double[] list = new double[MAXIMUM_PHYSICAL_SIZE];
        double[] temperatures = {-50.0, -40.0, 0, 32.0, 33.0, 98.6};
        int n = 0;
        double sum = Double.NaN;
        double average = Double.NaN;

        n = readFromFile("data.txt", list, MAXIMUM_PHYSICAL_SIZE);
        print(list, n);
        sum = calculateSum(list,n);
        average = calculateAverage(list,n);

        System.out.printf("The sum is %f\n", sum);
        System.out.printf("The average is %f\n", average);

        System.out.println("\uD83C\uDF10 \uD83C\uDF0D We are the world! \uD83C\uDF0E \uD83C\uDF10");
    }

    public static double calculateSum(double[] list, int n){
        double sum = 0;
        for(int i=0;i<n;i++){
            sum += list[i];
        }
        return sum;
    }
    public static double calculateAverage(double[] list, int n){
        double average = Double.NaN;

        if (n == 0){
            average = 0.0;
        }else{
            double sum = calculateSum(list,n);
            average = sum/n;
        }
        return average;
    }
}
```
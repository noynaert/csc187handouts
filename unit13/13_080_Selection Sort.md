# 13.080 Selection Sort

Link to [Learn SelectionSort in 8 minutes](https://youtu.be/EwjnF7rFLns?si=acVYXnpyt3-s1a2d) by Bro Code

## Selection sort for strings

```java
public class Main {
    public static void main(String[] args) {

        selectionSort(args,args.length);
        print(args,args.length);
        System.out.println("Goodbye world!");
    }
    public static void print(String[] words, int n){
        System.out.printf("There are %d words\n", n);
        for(int i=0;i<n;i++)
            System.out.println(words[i]);

    }

    private static void selectionSort(String[] words, int n){
        for(int i=0; i<n - 1; i++){
            int smallestSoFar = i;
            for(int j = i+1; j<n; j++){
                if(words[smallestSoFar].compareToIgnoreCase(words[j]) > 0){
                    smallestSoFar = j;
                }
            }
            //swap
            String temp = words[i];
            words[i] = words[smallestSoFar];
            words[smallestSoFar] = temp;
        }
    }
}

```
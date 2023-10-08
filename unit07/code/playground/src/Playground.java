import java.util.Scanner;

public class Playground {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.print("Please type a number: ");
        number = keyboard.nextInt();
        System.out.printf("You typed %d\n\n", number);
        ////////////

        boolean isPositive = (number > 0);

        ///////////
        System.out.println("\uD83C\uDF89 Party Time! \uD83E\uDD73");
    }
}

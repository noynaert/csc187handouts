# 03.010 `printf`

## Printf is from C, and it will not die

Printf was used to format printing in C. Over time it became very sophisticated and able to handle many formatting situations. It also became very complicated and intricate. Some of the things it was created to handle in the 1970s are no longer really needed, but they are still there and make the system far less intuitive than it would be if it was being created now.

But C influenced everything. Most coding systems have incorporated printf and all of its intricacies. So knowing printf will serve you well in most fields of technology.

## `%d`, `%f`, and `%s`

The three key things to learn are %d, %f, and %s. There are a lot of other format specifiers. There is a lot of stuff you can add to %d and %f. But if you just know `%d`, `%f`, and `%s` you will be covered in the majority of situations.

- `%d` -- Used for all **_decimal_** integers (int, byte, short, long). The d stands for "decimal."
- `%f` -- Used for all floating point numbers. In Java this would be double and float
- `%s` -- Used for all string variables

### Fill-in-the-blanks

Think of printf as a fill-in-the-blank problems. We use %d, %f, and %s as placeholders where values will be plugged in later.

```java
      int radius = 1;
      System.out.printf("A circle with a radius of %d has a diameter of %d and a circumferance of %f\n", radius, 2*radius, radius*3.14159);
      System.out.println("Done!");
```

Produces the following:

```text
     A circle with a radius of 1 has a diameter of 2 and a circumferance of 3.141590
     Done!
```

## `\n`

The printf does not include a newline at the end of the line.  If you want a newline, you have to put \n in the string.

## `%s` is useful for Strings and most other classes of objects.

```java
import java.time.LocalDate;

public class Skeleton {
    public static void main(String[] args){
      String name = "Pat";

      System.out.printf("I saw my friend %s on %s\n", name, LocalDate.now() );
      System.out.println("Done");
    }
}
```
Produces the following:

```text
    I saw my friend Pat on 2023-09-05
    Done
```

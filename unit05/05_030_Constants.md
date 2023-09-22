# 05.030 Constants

## Final

Java uses the reserved word `final` to create constants.  Java has `const` as a reserved word, but it is not used for anything.

The reserved word `final` is used as a "modifier" for the data type in the declaration.

```java
public static void main(String[] args) {
        final char DEGREES = '°';
        int comfortable = 22;
        System.out.printf("A temperature of %d%c C to be a comfortable temperature.\n", comfortable, DEGREES);
    }
```

[List of Java Reserved Words](https://www.w3schools.com/java/java_ref_keywords.asp)

## ALL CAPS

By tradition inherited from C, constants are stated in ALL CAPITAL LETTERS.

## SCOPE

Constants may be declared inside methods.  But it is common to declare constants in the class but outside methods.

Declaring constants in the class means they have a ***scope*** of the entire class, including inside of the methods.

If you do this, the constant has to be made `static`.  It should also get the public access modifier.

```java
public class Unit04 {
    public static final char DEGREES = '°';

    public static void main(String[] args) {
        final char DEGREES = '°';
        int comfortable = 22;
        System.out.printf("A temperature of %d%c C to be a comfortable temperature.\n", comfortable, DEGREES);
    }
```
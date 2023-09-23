# 04.020 Numeric Literals

Numeric literals are numbers we type.  Examples of common literals would be 0, 1000, -17, 3.14, 0.0, and -99.0.

## No commas are allowed in numeric literals

You cannot put a comma in a numeric literal in your program code.  

There are ways to do this if you input the data as strings, but that gets messy.

You may put commas into output by using printf.

## Integer Literals

### Decimal integers are assumed

We normally type in decimal or base 10.  But we don't always do so.

### Hexadecimal (Hex) is available

The prefix `0x` means the literal is in hex.

```java
    int red = 0xFF0000;
    int bob = 0xABCDEF;
    int purple = 0xff00ff;     //case does not matter
```
### Watch out for "Accidental Octal"

If an integer starts with 0, it is in Octal.  Octal is Base 8.

Octal is rarely used.

Octal will mess you up if you start a number with a leading 0.  It can be a subtle error that may go unnoticed.  And once the error is noticed it can be hard to detect and get rid of.

```java
    int section = 010;
    System.out.println(section); //Prints 8 
```

##  literals

Integer literals are assumed to be doubles.

No commas are allowed in literals.

### Long literals

If you want to specify a long literal, append an L onto the end of the literal.  Technically you may use either upper or lower case L, but the lower case l could be confused with the 1 digit.

```java
long bigNumber = 300000000000L;

        System.out.printf("A big number: %,d\n",bigNumber);
        System.out.printf("A big number:   %x\n",bigNumber);  //raw hex output
        System.out.printf("A big number: 0x%x\n",bigNumber);  //I like this hex output better.

        int littleNumber = 0x23;
        System.out.printf("Little Number in decimal: %d\n", littleNumber);
        System.out.printf("Little Number in hex: %x\n", littleNumber);  //Potentially confusing output
        System.out.printf("Little number as clearly hex: 0x%x\n",littleNumber);
```
Output:

```text
A big number: 300,000,000,000
A big number:   45d964b800
A big number: 0x45d964b800
Little Number in decimal: 35
Little Number in hex: 23
```

## No literals for bytes and shorts

There are no literal forms for the byte or short types.

What you need to do if you have a byte or a short, then you need to use an integer literal and cast it to a byte or a short.

```java
 byte  tiny = (byte)100;
        short little= (short)100;
        System.out.printf("tiny is %d and little is %d\n", tiny, little);
```

## Real number literals

### Float

F or f is used for floats in the same way L or l is used for long.

```java
  float f = 12.345F;
```

### Scientific Notation

One mole of a substance is equal to 6.022 × 10²³ units of that substance (such as atoms, molecules, or ions). The number 6.022 × 10²³ is known as Avogadro's number or Avogadro's constant.

```java
double avogadro = 6.022e23;

        System.out.printf("Avagadro's Number: %f\n", avogadro);
        System.out.printf("Avagadro's Number: %e\n", avogadro);
```

Output

```text
Avagadro's Number: 602200000000000000000000.000000
Avagadro's Number: 6.022000e+23
```


# 02.060 Arithmetic operators

The following is a partial list of arithmetic operators in Java.  There are more that we will cover lately

Operator|Meaning
:---:|:---
+|addition
-|subtraction
*|multiplication (Be careful mixing integer and floating point numbers)
/|division (Be careful mixing integer and floating point numbers)
%|Modulo.  (Only applies to integer types, real numbers)

Division gives the quotient.  Modulo gives the remainder.

```java
System.out.println( 20/3 );   //Prints 6
System.out.println( 20%3 );   //Prints 2
```

### Integer division can be tricky

```java
System.out.println (2.0 / 4.0);
System.out.println ( 2 / 4 );
```

## Algebraic Precedence

Arithmetic follows the rules of algebra.  It does not follow the rules of most calculators.

```java
System.out.println( 1 + 2 * 3) //What does this print?
```


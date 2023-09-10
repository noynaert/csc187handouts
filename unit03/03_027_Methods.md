# 03.027 Methods

## Functions

Programming languages have always had things called "functions."  Functions do some operation that is more complicated than a simple operator like + or - can handle.  For example, in many languages, things like Square Root are created as functions. For example, in C, the square root would be calculated and printed with the following statements:

```c
    //calling functions in  the C language
    double root = sqrt(16.0);
    printf("%f\n", root);
```

```FORTRAN
*  calling functions and subroutines in FORTRAN
   X = SQRT(16.0)
   WRITE(STDOUT, X)
```

A function usually includes the name of the function followed by parenthesis.  Sometimes the parenthesis is empty, but it often includes an "argument" or some piece of data needed for the function to work properly.  Sometimes there is more than one argument.  In that case, the individual arguments are separated by commas.

Note that in the examples, both the sqrt and the printf() and write() would be considered functions in modern terminology.  

## Methods

Methods are functions that are declared inside a class.  

In Java, functions may only be declared in a class.  Therefore, in Java, all functions are methods.

## Calling methods

Methods must be called with reference to the class (although there is a shorthand used in Java for some methods).

```java
// Calling functions/methods in Java
   double root = Math.sqrt(16.0);
   System.out.println(root);
```

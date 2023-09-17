# 04.027 Method Signature

## Signature

The **Signature** of a method is the name of the function, and a list of the data types of the methods.

Notice that the following are not part of the signature:

*  The return type is not part of the signature
*  The names of the parameters is not part of the signature.

### Methods with the same name

Two or more methods may have the same name.  However, they must have different signatures.  So if two methods have the same name, then they must have a different list of data types as parameters.

Consider the following

```java
 //calculate the diagonal of a rectangle
    public static double calculateDiagonal(double length, double width) {
        double result;
        result = Math.sqrt(length * length + width + width);
        return result;
    }
    //calculate the diagonal of a square
    public static double calculateDiagonal(double length){
        double result = calculateDiagonal(length, length);
        return result;
    }
```

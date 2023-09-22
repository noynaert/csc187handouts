# 05.010 Casting

Casting only works between primitive types.  So you cannot use casting to convert between numeric data and strings.

## Widening and Narrowing

### Widening

No special syntax is needed when going from a "narrower" data type to a "wider" data type.

So it is automatic to convert a byte to an int or an int to a double

```java
int number;
byte tiny = 50;
double realNumber;

number = tiny;
realNumber = number;
```

### Narrowing

Narrowing poses a high risk of losing significant digits.  Therefore Java requires the programmer to specify that the narrowing operation is justified.

Casting is done by putting the destination data type in parenthesis in front of the value.

```java
        int number = 50;
        byte tiny = (byte)number;
        byte b = (byte)number;
```

The most common narrowing cast is used to break the integer part of a real number from the fractional part.

Note that this truncates; it does not round.

```java
        double x = 2.999;
        int n = (int)x;
        System.out.printf("n is %d\n",n); //prints "n is 2"
```

###  Casting to round

```java
public static void main(String[] args) {
        double x = 3.999999;
        System.out.printf("%f rounds to %d\n",x,round(x));
        x = 3.000;
        System.out.printf("%f rounds to %d\n",x,round(x));
        x = 3.499;
        System.out.printf("%f rounds to %d\n",x,round(x));
        x = 3.5000000;
        System.out.printf("%f rounds to %d\n",x,round(x));
    }

    public static int round(double realNumber) {
        int wholePart = (int) (realNumber + 0.5000000);
        return wholePart;
    }
}
```

Output is

```text
3.999999 rounds to 4
3.000000 rounds to 3
3.499000 rounds to 3
3.500000 rounds to 4
```
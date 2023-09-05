# 03.060 Mixing Integers and Doubles

Java allows mixing of integers and doubles in the same expression.  But it can be tricky.  There are some subtle points, especially when doing division.

## Promotion

When a "smaller" data type is combined with a "larger" data type, the smaller type is promoted to the larger.

In practice, an `int` is promoted to a `double`.

```java
int radius;
double area = radius * radius * 3.14159;

System.out.println(area);
```

Division is the place most likely to cause problems.

Consider taking $\frac{2}{3}$ of 90.

```java
int part = (2/3) * 90;
System.out.println(part);
```

What will the above print?

What can we do to fix the problem?


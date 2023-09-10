# 03.050 Mixing Strings and Non-String Types

## Promotion

Promotion is when a data type is converted "on the fly" to another data type.

Promotion can only go in one direction by default.  It can go from "smaller" to "larger."

All of the primitive classes may be "promoted" to Strings.  This makes concatenation easy.

```java
int radius = 5;
double area = radius * radius * Math.PI;
System.out.println("Radius: " + radius);
System.out.println("Area: "+ area);
```

Note that blanks were inserted after the :.
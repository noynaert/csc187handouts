# 02.030 Java Integer Types

Type|Bits|Bytes|Range
:---|:---:|:---:|:---
byte | 8 | -128 through 127
short|16|2|-32,768 through 32,767
**int**|32|4|-2,147,483,648 through 2,147,483,647 (roughly, -2 billion through 2 billion)
long|64|8|-9,223,372,036,854,775,808 through 9,223,372,036,854,775,807 (roughly, a ridiculously large number)

***Notice that all of the data types are lower case.*** There are capitalized versions of these data types, but they are different.

## Type `int`

The `int` data type is the one that is almost always used in Java. Variables of type `int` may safely use values up through the 2 billion range.  The other data types do have their uses, but they are relatively rare.  The `long` data type is probably the second most used type because sometimes it is used for crytpographic keys. The `byte` and `short` data types are mostly used when interfacing with databases that use those data types.

Remember that Java `int` data has a range of -2 billion to a positive 2 billion.  It is not necessary to remember the exact ranges.  Java will tell you if you need to know.

```java
    System.out.println("Maximum byte is " + Byte.MAX_VALUE);
    System.out.println("Maximum short is " + Short.MAX_VALUE);
    System.out.println("Maximum int is " + Integer.MAX_VALUE);
    System.out.println("Maximum long is " + Long.MAX_VALUE);
    System.out.println("-----");
    System.out.printf("Maximum int with commas is %,1d\n", Integer.MAX_VALUE);
    System.out.printf("Maximum long with commas is %,1d\n", Long.MAX_VALUE);

```

produces the following output:

```text
    Maximum byte is 127
    Maximum short is 32767
    Maximum int is 2147483647
    Maximum long is 9223372036854775807
    -----
    Maximum int with commas is 2,147,483,647
    Maximum long with commas is 9,223,372,036,854,775,807
```

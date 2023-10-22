# 09.030 Integer Wrapper

[https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html)

## Fields to Know

* `Integer.MAX_VALUE`
* `Integer.MIN_VALUE`

Note that the above are ***fields*** and not methods; they do not have () at the end.

Return type|methodName|Argument|Description
:---:|:---:|:---:|:---
static int|max()|int,int|Returns the greater of two int values as if by calling Math.max.
static int|parseInt()|String|Parses the string argument as a signed decimal integer.

## Parsing an integer

```java
 public static int parseInt(String s){
            int number = 0;

            try {
                number = Integer.parseInt(s);
            }catch(Exception e){
                number = Integer.MIN_VALUE;
            }
            return number;
    }
```

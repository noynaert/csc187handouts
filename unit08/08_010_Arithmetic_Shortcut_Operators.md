# 01.010 Arithmetic Shortcut Operators

Technically, these are called "Assignment Operators."

Operator|Sample|Same As
:---:|:---|:---
+=|x = x + 5|x += 5
-=|x = x - 5|x -= 5
*=|x = x * 5|x *= 5
/=|x = x / 5|x /= 5
%=|x = x % 5|x %= 5

There are several other assignment operators that work with bitwise operations.

## += is the most common

The += is by far the most common operator.

It works with numeric data

The += operator also works for concatenating strings.

```java
    String word = "kitten";
    ...
    if(count > 1)
       word += "s";
```

## The shortcuts are a necessity

We can't ignore these shortcuts.  They are necessary in some syntax situations.

They are also handy.

## Keep It Simple

Don't put complicated operations on the right side of the shortcut assignment operator.  It is easy to overlook the assignment operator if the right side is non-trivial.
# 09.010 readLine()

The .readLine() method reads an entire line.  It returns a string.  It strips off the ending \n, but it leaves any other white space.

## `trim()`

Trim removes any leading and trailing blank spaces.  If there are non-whitespace characters, the internal spaces are not removed.  

Often we trim on reading.

```java
    String line = input.nextLine().trim();
```

## Splitting

Splitting a string always returns at least one string, even if it is empty.

To detect whether a line is truly empty, you need to .trim() the string and then check to see if the length is 0.  Or you could use the built-in .isEmpty() method.

### Returning an array

A method may only return one item, but that item may be an array or an object with multiple fields.
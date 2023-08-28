# 01.040 Print Statements

There are three different print statements in Java


## Strings

Strings in Java are always surrounded by "double quotes" which normal humans would just call "quotes."

We also have "single quotes" which normal humans would call apostrophes.

In Java, single and double quotes have different meanings; they are not interchangeable.

## The "new line" character

"\n" is the "carriage return" or "new line" character.  It moves the cursor to the first position on a new line.

## Three forms of the print statement

* `System.out.print()`
* `System.out.println()`
* `System.out.printf()`

### `System.out.print`

.print prints the string in () and leaves the cursor sitting immediately after the last character.  If you want a blank space, you have to print it.

### `System.out.println`

.println prints the string and then moves the cursor to the first character on a new line.

The following two statements would give the same result.

```java
System.out.print("Hello\n");
System.out.println("Hello");
```

You may omit the String in the println() statement.  The following lines of code would be equivalent.


```java
System.out.print("\n");
System.out.println();
System.out.println("");
```

### `System.out.printf`

This allows fancy, C-style formatting of strings.  We will cover it in more detail later.

It can work exactly like `System.out.print`.  But it can be tricky.  For now, do not use it.

## Escaped Characters

`\n` is the most used of the "escaped characters."

The escaped characters all start with a backslash ( \ ) symbol

### The "Big Four"  (Most commonly used)

character | Meaning
:---: | :---
&#92;n | New Line
&#92;t | Tab
&#92;" | Double Quotes
&#92;&#92; | Backslash

### The Remaining Escaped Characters

The following are not used as often.  The first three are mostly useful when output is going to old-fashioned character printers and teletype-type of documents.  The 'single quote' is mainly useful in a specific syntax situation.

character | Meaning
:---: | :---
\b | backspace (a step backward in the text or deletion of a single character)
\r | carriage return (moves to the next line with the cursor in the same column)
\f | form feed
\’ | single quote

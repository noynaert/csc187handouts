# 07.040 Comparing Strings

## Relational operators only work for primitives

The relational operators <, >, <=, >=, ==, and != only work with primitives.

To compare Strings, we need the [compareTo()] method.  There is also a compareToIgnoreCase() method.

## Return types

Returns a negative, a zero, or a positive integer. 

Do not think of it as -1, 0, +1.  That kind of thinking results in coding errors.

I keep track of what is happening is just like subtracting integers

Comparing Integers|
:---:|
$3 - 5$ would give a negative|
$3 - 3$ would give a zero|
$5 - 3$ would give a positive|

When we do Strings, we are subtracting ASCII codes.

Java Code|Think of it as|Results
:---|:---:|:---:
"Abe".compareTo("Ed")| (A - E) or (65 - 70)| Negative
"Ed".compareTo("Ed)| (E - E) or (70 - 70)| Zero
"Ed".compareTo("Abe")| (E - A) or (70 - 65)| Positive

* Comparisons are done on the first character.
* If the first character matches, then the tie is broken by the second character
* If all the letters match, but one is shorter, then the shorter is less than the longer (Think of the shorter having an ASCII code of 0 as the next character.)  

The "compareTo" template is used by other methods.
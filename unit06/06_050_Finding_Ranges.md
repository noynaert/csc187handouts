# 06.050 Finding Ranges

## Simple Ranges

To join the military, you must be at least 18 years old, but less than 36.

This calls for a range.  It would be written as follows:

```
   (age >= 18)  && (age < 36)
```

Ranges are determined with && operation.

Both sides of the && must be boolean expressions.  
## Pitfalls

### Both sides of && and || operators must be complete  

Some scripting language allow you to write something like the following:

```text
   age >= 18  AND < 36
```

This will not work in Java.  You must specify the entire boolean expressions.


## Don't use & and |

It is unfortunate that & and | are also operators.  This is another case where Java did things just so it would be like C and C++.  These do "bitwise" operations.  It will not give you the right result

IntelliJ will give you a warning, but not an error.

## Avoid negative logic

Humans are generally not good at negating logic.

Try to keep variables so the condition you are testing for is true.  This helps make code more readable and less prone to logic errors.  

## deMorgan's theorem

Reversing logic is tricky.  Just remember that.

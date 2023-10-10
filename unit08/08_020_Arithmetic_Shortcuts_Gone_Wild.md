# 08.020 Arithmetic Shortcuts Gone Wild

The += shortcut is useful.  In practice, the most common form involves adding or subtracting 1.

```java
x += 1;
y -= 1;
```

So we have a shortcut for the shortcut.  The above can be reduced to the following:

```java
x++;
y++;
```

## The four increment/decrement operators

* Postfix (using i as a variable)
  * i++
  * i--
* Prefix (using i as a variable)
  * ++i
  * --i

## Programming by side effect (generally a bad thing to do)

A side effect is when a statement does one main task, but it also changes something else at the same time.

The problem is that these 4 operators can have side effects.

A lot of C and C++ code was based on the use of side effects.  Sometimes this made code that had extra bugs.  It also tended to make code that was hard to understand.  In fact, there is an annual "Obfuscated C" contest where the winner tries to create code that does clever things while being totally unreadable.  [One example](https://udel.edu/~mm/xmas/)

Java usually avoids programming by side effect, but it is still possible.  There are some very limited cases where it is absolutely necessary.  

There are some style things we do in Java to minimize the hazards of side effects.  But it is still important to understand exactly how these shortcut operators work.

## Postfix ++ and -- operators

All four of the operators happen outside the normal rules of precedence.

For the postfix versions of the operator, the rest of the statement is executed, then the increment or decrement happens.

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        thing = thing + i++;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

The output shows that the increment was done ***after*** the addition was done.

```text
Before, thing is 50 and i is 3
After, thing is 53 and i is 4
```

Here is the before and after for decrement.

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        thing = thing + i--;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

The output shows that the decrement was done ***after the main addition.

```text
Before, thing is 50 and i is 3
After, thing is 53 and i is 2
```

## Prefix version of the operators

For the postfix versions of the operator, The increment or decrement happens ***before*** the rest of the statement.

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        thing = thing + ++i;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

The output shows that the increment was done ***before*** the addition was done.

```text
Before, thing is 50 and i is 3
After, thing is 54 and i is 4
```

## A semi-practical application

```java
        i=0;
        String word = "Vote";
        while (i < word.length())
            System.out.println(word.charAt(i++));
```

## Style:  Avoiding problems

In Java we use style to avoid problems.  Therefore we are going to avoid doing anything that has been done on this page so far!

There will be two style rules to follow:

* Use the increment and decrement operators on a line by themselves.  
  * It avoids confusion when reading
  * If they are on a line by themselves, there is no difference between the prefix and postfix versions
* Only use the increment and decrement operators in certain situations where they are required.

The original examples on this page may be recoded to put the increment and decrement operators on their own lines.  This removes any confusion about what happens.

There is no side effect in the following.  The coding makes it clear that the increment happens ***before*** the addition.

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        i++;
        thing = thing + i;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

Produces exactly the same output as the following.:

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        ++i;
        thing = thing + i;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

The following makes it clear that the increment or decrement happens ***after*** the addition.

```java
        int i = 3;
        int thing = 50 ;
        System.out.printf("Before, thing is %d and i is %d\n",thing,i);
        thing = thing + i;
        i++;
        System.out.printf("After, thing is %d and i is %d\n",thing,i);
```

## These operators only work on variables.

Usually, the increment and decrement are used with integers.  But they may be used with real numbers.

But they can't be used with literals or constants.

```java
        //why don't these make sense?
        3++;
        (i + j)++
```
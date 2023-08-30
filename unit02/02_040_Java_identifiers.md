# 02.040 Java Identifiers

Identifiers are symbols that we create to store variables.  The following sets an identifier called `quantity` as an integer.

```java
int quantity;
```

Now, quantity may be used to hold and recall an integer value.

```java
quantity = 6;
System.out.println(quantity);
```

## Replacement symbol

Do not think of the = sign as an "equals" sign.  Think of it as a replacement symbol.  Read the statement `quantity = 6` as "quantity takes on the value of 6."  

* A variable appears on the left side of the = sign.  
* The statement works from right to left.  In other words, the value of the expression on the right of the = sign is calculated, then the value is placed in the variable.

## About identifiers

Identifiers are used all over the place in Java and most programming languages.  Java style has several requirements.  Some are syntax and others are style

* identifiers must start with a letter, underscore, or dollar sign.  But in practice, do not use underscores or dollar signs as the first character.
* If the identifier is the name of a class, then it should be capitalized as if it was a name.  If it is not a class name, then the identifier should start with a lower case letter.
* After the first character, the following characters may be letters, digits, or underscores.
* Identifiers may ***not*** contain blank spaces.
  * If the identifier is more than one word, then it should use "camelCase."  There first letter is lower case, and the following words are capitalized.
* Identifiers should be meaningful names.  Avoid "cute" names, such as names of cartoon characters.
* Avoid single-character names unless it is very local in its use.
  * There are some single letter identifiers that have specific meaning to programers, Examples are n, i, j, and k.


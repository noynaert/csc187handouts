# 07.030 Style

The boolean expression in an if statement (or in a conditional) may either be a boolean variable, a boolean method, or an expression involving relational operators and logical operators.

```java
if (ageOK)...
if (age > 18)...
if (age >= 18 && age <= 35)...
```

## Don't do this with boolean variables

```java
if (ageOK == true)
```

The expression `(ageOK == false)` should be coded as `( !ageOK )`

## Don't set boolean expressions like this

```java
if(age >= 18 && age <=35)
   ageOK = true;
else
   ageOK = false;
```

Instead, code like this:

```java
ageOK = (age >= 18) && (age <= 35)
```
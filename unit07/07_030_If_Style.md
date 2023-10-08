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

## Complex logic

Sometimes boolean logic can get complex.

If the logic for a statement is trivial, then it may be coded directly into the statement.  For example:

```java
if (temperature >= 70)
```

However, if the logic gets more complex, then it is usually best to write a function that returns a boolean.  

```java
   if(applicationIsSuccessful(age, license, stateOfResidence, creditScore))
```

Using a method allows us to do something called "unit testing."  

* Unit testing can test methods
* All "edge conditions" and special cases may be tested
* Once written, the unit tests may be run in the future to test changes.

# 07.025 The Conditional Operator

The coin toss code we did in the last section is a fairly common situation.

```java
String coin;
double r = Math.random();
if(r < 0.5)
   coin = "Heads";
else
    coin = "Tails";
```

Notice that the if statement is just returning one of two possible values.

There is a shorthand for this situation.  It is called the ***conditional operator***.

The Conditional Operator should only be used in a situation that returns a value.  One clue to use it is when you see that both the then and the else classes just assign different values to the same constant.  The above could be coded as follows

```java
String coin;
double r = Math.random();

coin = (r < 0.5) ? "Heads" : "Tails";
```
This is sometimes called the "ternary operator because there are three parts.

* there is a boolean expression before the ? (Note that the parenthesis are optional)
* The value if true is between the ? and the :
* The value if false is after the :

Also note that the above statements could be done as a single statement.

```java
String coin = (Math.random < 0.5) ? "Heads" : "Tails";
```

At this point I will not expect you to be able to write conditional statements.  But you should be able to read them.

Some programmers despise conditional statements and they are forbidden in some professional shops.

However, if you read documentation you may very well encounter them.  So I expect you to know how to read them.  

I may use conditional expressions in class.  You may write them on homework assignment if they are appropriate.

## How to think of conditionals

* Do not think of them as alternatives to if...else statements.  
* Think of them as expressions that can represent one of two possible values.
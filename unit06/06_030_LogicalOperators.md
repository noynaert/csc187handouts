# 06.030 Logical Operators

## Terms

* & is called an "ampersand."
* | is called a "pipe."  It is above the Enter key on most keyboards.
* ! is an exclamation point.  It is sometimes called a "bang" by programmers.

## And, Or, Not

There are three logical operators.  They require a boolean values.

Meaning|Symbol
:---:|:---:
And|&&
Or|\|\|
Not|!

&& and || require a boolean expression on each side.

! is followed by one logical expression.

## In Boolean Algebra

In terms of Boolean Algebra:

* ! is sort of like negation.  (A minus sign in front of a negative number)
* && is sort of like Multiplication
* || is sort of like Addition

For example, ! has the highest precedence.  && is has precedence over ||

Consider $2 + 3 * 4$.  The 3*4 is done first because multiplication has precedence over addition.  If you want the 2+3 to happen first, then you need to write $(2 + 3) * 4$

Consider the following logical operation

```text
(hours > 60) || (testScore > 80.) && (climbTime < 60.0) 
```

In the above example && has precedence over ||.  Therefore we would need parenthesis:

```text
((hours > 60) || (testScore > 80.)) && (climbTime < 60.0) 
```
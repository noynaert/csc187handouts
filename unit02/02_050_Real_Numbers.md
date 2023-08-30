# 02.050 Real Numbers

Representing real numbers on computers is tricky.

It is often tricky in base 10.  For example, in decimal numbers, $\frac{1}{3}$ is a rational number.  But it cannot be represented in decimal notation because it is a "repeating decimal" at 0.3333333....  So $\frac{1}{3}+\frac{1}{3}$ is different than $0.3333 + 0.3333 + 0.3333$

Things get even more complicated in binary representations.  Some things become repeating fractions in binary that are different than repeating fractions in decimal.  One example is the following.

In binary, $10 x 0.1$ is different than $0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1$

A second problem comes from mixing integer arithmetic with floating point.  But we will consider that later.

## Two types of variables for real numbers

Java has two types of real numbers These are called `float` and `double`

In practice, the rule is simple.  Always use `double`.  There are very few situations in Java where float is a good choice.  There are a lot of situations that actually require doubles.

Type|Bits|Digits of Precision|Range of the exponents|$\pi$
:---:|:---:|:---:|:---:|:---
double|64|15ish|$10^{-308}$ through $10^{308}$|3.141592653589793
float|32|6ish|$10^{38}$ through $10^{38}$|3.14159


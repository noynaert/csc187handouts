# 03.010 Types (Again)

## (and Again, and Again, and Again)

In chapter 2 we saw that integers are represented in computers in the binary number system.  It is a fairly direct and clean method of representing numbers, but it only works for integers.

We saw that floating point numbers are represented entirely differently.  To a normal human, there is no difference between 3 as an integer and 3.0 as a real number.  But computers represent them differently, and it isn't really easy to mix integer and real arithmetic.  Different language have different rules.  Some languages don't allow casual conversion between numeric data types.  Other languages such as JavaScript are very casual about changing data types.

Java is somewhere in between the two extremes.  There are some conversions that happen automatically.  There are some transitions that must be done explicitly.  Java protects the programmer from some of the worst types of errors, but it allow some actions that can get you into trouble.  

## Strings in Java

Java has a fairly unique way of handling Strings.

Java is patterned largely off of C and C++.  C and C++ have an extremely powerful way of handling strings.  It is very simple and elegant and exploits the way strings are handled in most computer system.

The problem with C and C++ is that strings became a major problem if programers were not extremely careful.  Many C and C++ programs were unstable because of small errors in programming logic.  Even worse, 





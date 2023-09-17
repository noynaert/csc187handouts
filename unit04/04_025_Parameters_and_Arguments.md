04.025 Parameters and Arguments.


## Arguments

Arguments are what go into the (parenthesis) when a method is ***CALLED***

## Parameters

Parameters are what go into the (parenthesis) when a method is ***DECLARED***

### Parameters are local variables in the method.  

It does not matter if other variables use the same id. The parameters are entirely in the scope of the method where they are declared.

Parameters have a data type specified.

## Order Matters
The order of the arguments must match the order of the parameters.  The types must be compatible.

## Primitive variables are passed by value

When the function is called, the value of the argument is passed.  

If the parameter is given a new value in the method, the new value is ***not*** passed back to the calling method.

It is considered bad form to reassign a parameter to a new value.

```java
int a = 99;
doSomething(a);


```
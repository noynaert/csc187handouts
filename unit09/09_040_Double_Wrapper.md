# 09.040 Double Wrapper

## Fields to Know

* `Double.MAX_Value`
* `Double.MIN_VALUE`
* `Double.MAX_Exponent`
* `Double.MIN_Exponent`
* `Double.NEGATIVE_INFINITY`  for ***∞***
* `Double POSITIVE_INFINITY`  for ***-∞***
* `Double.NAN`   //Not a Number

Note that the above are ***fields*** and not methods; they do not have () at the end.

The constants for POSITIVE_INFINITY, NEGATIVE_INFINITY, and NaN may be stored in ordinary primitive `double`` variables.

NaN can be useful for initializing double variables in situations where you expect the initialization to always be overwritten.

Return type|methodName|Argument
:---:|:---:|:---:
static boolean|isFinite(double)|double
static boolean|isInfinite(double)|double
static boolean|isNaN(double)|double
static double|parseDouble(String)|String

## Parsing a Double

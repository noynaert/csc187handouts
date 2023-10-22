# 09.045 Pseudo Wrapper Classes

Java has some classes like `BigNumber` `BigDecimal`.

They generally allow "Infinite Precision" operations and operations on values too large to represent as Longs and Doubles.  

They are extremely slow.

They use do operations such as .add(), .subtract(), .multiply(), and .divide() to do arithmetic. 
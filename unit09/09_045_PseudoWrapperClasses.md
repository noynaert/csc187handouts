# 09.045 Pseudo Wrapper Classes

NOTE:  There will not be a video on this unit.  We will explore it a bit in class on a Monday as bonus content that will not be on the exam.

Java has some classes like `BigNumber` `BigDecimal`.

They generally allow "Infinite Precision" operations and operations on values too large to represent as Longs and Doubles.  

They are extremely slow.

They use do operations such as .add(), .subtract(), .multiply(), and .divide() to do arithmetic. 
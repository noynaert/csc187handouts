# 09.045 Pseudo Wrapper Classes

NOTE:  There will not be a video on this unit.  We will explore it a bit in class on a Monday as bonus content that will not be on the exam.

Java has some classes like `BigInteger` `BigDecimal`.

They generally allow "Infinite Precision" operations and operations on values too large to represent as Longs and Doubles.  

They are extremely slow.

They use do operations such as .add(), .subtract(), .multiply(), and .divide() to do arithmetic. 

## Beyond the 64-bit limit

Long integers are limited to 64 bits.  Because they support signed integers, the largest possible value is $2^{63}-1$.

BigInt allows us to handle those numbers.

## But there are other reasons for using very large numbers.  

Keys for cybersecurity may involve 128, 256, or even longer keys.

BigInteger has special methods for providing "probable prime" numbers.

```java
//first, we need a good random number generator

Random generator = new Random();

//Now generate a 128-bit random integer that is probably prime.

BigInteger primeish = BigInteger.probablePrime(128, generator);


System.out.println("Probably prime: " + primish);
```


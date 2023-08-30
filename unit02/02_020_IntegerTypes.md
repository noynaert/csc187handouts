# 02.020 Representing Integer Data Types

## Bits and Bytes

* **Bit**:  A place to store a 0 or a 1
* **Byte**: A group of 8 bits (on modern computers)

## Number Systems

Base|Name|Digits used
:---:|:---|:---
2|Binary|0 1
8|Octal|0 1 2 3 4 5 6 7
10|Decimal|0 1 2 3 4 5 6 7 8 9
16|Hex or Hexadecimal|0 1 2 3 4 5 6 7 8 9 A B C D E F

Any integer may be converted between number systems.

For the moment, we are mostly concerned with Binary and Decimal.  

Assume we have 7 bits.  $2^7$ is 128.  So we have 128 distinct patterns.  We need to represent 0, so with 7 bits we could have any number from 0 to 127.

Decimal|Binary (using 7 bits)
:---|:---
0|000 0000
1|000 0001
2|000 0010
3|000 0011
4|000 0100
5|000 0101
6|000 0110
7|000 0111
8|000 1000
9|000 1001
10|000 1010
&nbsp;|&nbsp;
16|001 0000
17|001 0001
24|001 1000
65|100 0001
100|110 0100
127|111 1111

### But what about 8 bits?

Teletype machines used 7 bits.

Modern computers (and later teletypes) used 8 bits per byte.  In theory, 8 bit bytes would allow $2^8 = 256$ values.  However, we want negative integers and zero.  So the 8th bit is used to represent negative numbers.  So with 8 bits it is possible to have values from -128 through 127.

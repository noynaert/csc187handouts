# 03.021 Unicode

## The Problem with ASCII

It works well for English.  But it lacks characters for other languages

Extended ASCII

We have an 8th bit.  We can get another 127 characters!  This allows room for accent marks used in Western European languages (French, German, Spanish, Italian, etc).  It also allows for a lot of useful symbols for currency, math, and other common symbols.

The 255 characters is interesting.  It is the "non-breaking space"  It looks like a blank space, but word processors and other software will not use it to word wrap.

![Extended ASCII](images/extended-ascii_5f85365bb4f84-2.gif)

Source [https://www.webopedia.com/definitions/extended-ascii/](https://www.webopedia.com/definitions/extended-ascii/)


## Supports International Languages

Originally unicode was created as 16-bit representations.  This allowed 256 alphabets, and each alphabet could have up to 256 characters.

16 bit Unicode covered the alphabetic languages.

Unicode has been expanded to include more than 16 bits.  These handle a lot of non-alphabetic languages as well as things like emoji.

## Unicode and ASCII

ASCII is "chart 0" in Unicode.  So ASCII is basically at the heart of Unicode.

* ASCII for 'A' is 0100 0001
* Unicode for 'A' is 0000 0000 0100 0001

## Java and Unicode

Java was set up to support 16-bit Unicode.  After Unicode expanded to 24 and 32 bits, Java adapted.  

[16-bit Unicode Code Charts](https://unicode.org/charts/)

For example, The Greek letter Delta Δ has Unicode 0394.  This is a hexadecimal number with the binary value 0000 0011 1001 0011.  In Java, it would be '\u0394' or you could copy/paste delta from elsewhere.

NOTE:  You must have a font loaded on your system that will support the alphabet and symbol you are using.

### Long Unicode in Java

Unicode of over 16 bits is represented as strings.

`String cook = "👨‍🍳";` or `String cook = "\uD83D\uDC68\u200D\uD83C\uDF73";`
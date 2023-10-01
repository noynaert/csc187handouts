# 06.010 Boolean variables

&nbsp;|&nbsp;
:---|:---:
George Boole developed a form of algebra based on true / false.  It turned out to be perfect for use on computers based on bits.|![Picture of George Boole](images/engraving-George-Boole.webp)|
&nbsp;|&nbsp;

## Boolean Variables

* boolean is a primitive data type.  It is not capitalized because it is not a class
* There are only two possible values.
  * `true`
  * `false`
* `false` is the "zeroish" value
    * in the original C, there was no boolean class.  Instead, integers were used.  0 was false and anything non-zero is true.  This does *not* work in Java, but sometimes knowing this helps understand weird things in java.

## Boolean Methods

Boolean methods often start with "is" or something that suggests true/false.

In the [String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) class there are isEmpty() and isBlank() methods.

```java
String empty = "";  //length is zero
        String fullOfNothing = "      ";
        
        System.out.printf("String: \"%s\"  is empty: %b\n", empty, empty.isEmpty());
        System.out.printf("String: \"%s\"  is blank: %b\n", empty, empty.isBlank());
        System.out.printf("String: \"%s\"  is empty: %b\n", fullOfNothing, fullOfNothing.isEmpty());
        System.out.printf("String: \"%s\"  is blank: %b\n", fullOfNothing, fullOfNothing.isBlank());
```

Prints

```text
String: ""  is empty: true
String: ""  is blank: true
String: "      "  is empty: false
String: "      "  is blank: true
```

### Other String booleans

Note the readability of the following.  The names suggest a "boolean quality."

* contains()
* endsWith()
* equals()
* equalsIgnoreCase()
* startsWith()




## Using boolean variables

Boolean variables are very useful, especially when dealing with complicated logic situations.  

Keep boolean variables meaningful.  Construct them so they can be used as if they are parts of sentences.

* The "is" format is useful.  For example `isBlank()`
* Sometimes word like "success" and "failure" make good boolean variable names.
* Avoid reverse logic when possible.  
* Make variable names say what they mean when true.

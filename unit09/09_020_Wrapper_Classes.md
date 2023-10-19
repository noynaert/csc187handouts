
## Two purposes

* Wrapper classes hold useful fields and methods for that data type
* Some operations require objects and not primitives.  Wrapper classes can hold values, so they let us store primitives

## Each Primitive Type has a Wrapper Class

Primitive Data Type|Wrapper Class
:---|:---
byte|	Byte
short|	Short
int|	Integer **⚠️**
long|	Long
float|	Float
double|	Double
boolean|	Boolean
char|	Character **⚠️**

⚠️ Note that the Wrapper class is spelled out for `int` and `char` wrapper classes ⚠️

## Creating Objects in Wrapper Classes

```java
     double numberPrimitive = 7;
     Double numberObject = 7.0;
     Double numberObject2 = 7; //This will not work because the literal must match the type
```

### Wrapper Constructors

If you look at the [Double API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Double.html) there are Constructors, but the constructors are ***deprecated***.

Language features that are deprecated should not be used.  They used to be part of the Java language, but they are being phased out.  They have been kept for "backward compatability" with old code but they should not be used in any new code.

### Example of use in practice

```java
        Map<String,Integer> people = new HashMap<>();
        people.put("Fred",new Integer(32));  //The old, deprecated way
        people.put("Barney",31);
        people.put("Wilma",33);
        people.put("Betty",30);

        String key = "Wilma";
        System.out.printf("%s's age is %d\n", key, people.get(key));
```
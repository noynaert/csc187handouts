# 07.060 Java Dates and Times

Dates and times are hard.  

* Earlier versions of Java had different attempts at date and time classes.
* Java 1.8 introduced the following classes:
  * LocalDate
  * LocalTime
  * LocalDateTime

## Ways to *instantiate* an object

### Constructors

See Scanner and File constructors

Involve instantiations such as the following:

```Java
   File inputFile = new File(fileName);
   Scanner input = new Scanner(inputFile);
```

### Factory methods

The factory pattern has a specific meaning, but we will use it more loosely here.

For our purposes, a Factory Method is a method that returns an object of the class, and the class lacks constructors.

## Factory methods in LocalDate/LocalTime/LocalDateTime

* now()
* of() (several forms)
* parse()  See [https://howtodoinjava.com/java/date-time/localdate-parse-string/](https://howtodoinjava.com/java/date-time/localdate-parse-string/)

## Some of the methods

Times are effectively data type `long` because we are dealing with 64-bit integers

* equals()  //The argument must be the same type
* isEqual(), isBefore(), isAfter() compare agains same or different date types.
# 09.050 Creating Arrays

Arrays are roughly analogous to the concept of lists in Java.

## Declaring Arrays

### Recommended method for declaring arrays

```Java
         private static final int MAXIMUM_PHYSICAL_SIZE = 10;
         ...
         double[] list = new double[MAXIMUM_PHYSICAL_SIZE];
         String[] words = new String[MAXIMUM_PHYSICAL_SIZE];
         LocalDate[] dates = new LocalDate[MAXIMUM_PHYSICAL_SIZE];

```

### Alternative for short lists of literals

        double[] temperatures = {-40.0, 0, 32, 98.6, 100, 212};
        String[] animals = {"dog", "cat", "horse", "cow"}; 

### Non-favored method

```java
        double list[] = new double[MAXIMUM_PHYSICAL_SIZE];
```

## Considerations

* Indexing starts at 0.
* All elements must be of the same type
* When an array is created, the space is allocated whether the array is full or not.
* Array contents are set to a "zeroish" value.
* Arrays have a property called `.length`.  It does not have () because it is not a method.
* The array variable stores the address where the array is stored.  This is different than with primitives because the actual value is stored for primitives.

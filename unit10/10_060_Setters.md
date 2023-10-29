# 10.060 Setters

## `this`

The reserved word `this` has several variations, but it generally refers to the class itself or to elements of the class.  It can refer to

* Data field of the class
* Methods in the class
* The class itself

`this` cannot refer to local variables or parameters in methods.

Here is our `toString()` method:

```java
public String toString(){  
    String s = String.format("The state of %s has a population of %,d", name,population);  
  
    return s;  
}
```
We could modify the `name` to `this.name` and the `population` to `this.population`

```java
public String toString(){  
    String s = String.format("The state of %s has a population of %,d", this.name, this.population);  
  
    return s;  
}
```

## Writing setters

Setters are methods that allow the user to change the value stored in a field.

They may provide error checking to make sure that only valid data is set.

* Setters are public (usually)
* Setters are ***not*** static
* Setters have a void return type
* The name always starts with "set" followed by the camelCase name of the field.
* Setters take one parameter.  Usually it is the same data type as the field
* The parameter name is the same as the field name
* `this` is used to indicate the field

## Sample Setters
```java
  
public void setName(String name) {  
    this.name = name;  
}  
  
public void setPopulation(int population) {  
    if (population > 0 && population < 100000000) {  
        this.population = population;  
    } else {  
        this.population = 0;  
    }  
}
```
# 04.005 Methods

* Methods are functions declared in classes
* Ideally, functions should do one thing

## We have been calling methods. 

Methods in Java are always in a class.

## The main() method

We have already been using one method.  It is the main() method.

```java
public static void main(String [] args){
    System.out.println("Hello");
}
```

## Naming methods

* When we define methods, we get to pick the names. 
  * In some cases there are syntax rules that pick the names for us.
    * `main()` is one example
  * In some cases there are style rules that pick the names for us.
* The names of methods are the same rules as for picking variables
  * Both function names and variable names are "ids"
  * As a very loose general rule of thumb:
    * Variable names are nouns.  They represent things.
    * Method names are verbs or contain a verb.  Functions "do stuff."

## Advantages of methods

* Big problem can be divided into smaller tasks
* Methods may be used multiple times.
* The method can be tested thoroughly
* The task may be assigned to one person or team
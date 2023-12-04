# 14.010 Inheritance

[https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html)

All classes in Java extend the Object class.  Another way to say this is that Object is the "super" class for all other classes.  The other classes would be "sub" classes or child classes of the Object class.

## `final`  Classes

Classes may be declared `final.`  Final classes may not be extended.  The String class may not be extended.  

In most cases, declaring a class final is done to make it safe to work with in threads.

## Super and Sub Classes
### Also known as parent and child classes



## Example of extending the Object class

```java
public class Main14 {
    public static void main(String[] args) {

        System.out.println("\nDone!");
    }
}

class Thing extends Object{   //"extends Object" is not required for Objects.

}

```
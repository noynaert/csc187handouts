# 14.010 Inheritance

[https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html)

All classes in Java extend the Object class.  Another way to say this is that Object is the "super" class for all other classes.  The other classes would be "sub" classes or child classes of the Object class.

When a class extends a parent class, the sub class *inherits* all methods and fields that are not blocked by access modifiers.  Any `public` or `protected` members of the class are inherited.  Members that are default or `private` are not inherited.

## `final`  Classes

Classes may be declared `final.`  Final classes may not be extended.  The String class may not be extended.  

In most cases, declaring a class final is done to make it safe to work with in threads.

## Example of extending the Object class

```java
public class Main14 {
    public static void main(String[] args) {

        Object o = new Object();
        Thing a = new Thing();
        Thing b = a;
        Thing c = new Thing();

        // .clone() is protected
        //Object oo = o.clone();
        //Thing d = a.clone();

        System.out.println("\nEquals:");
        System.out.println(a.equals(o));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        System.out.println("\ngetClass");
        System.out.println("o -- "+o.getClass());
        System.out.println("a -- "+a.getClass());
        System.out.println("b -- "+b.getClass());
        System.out.println("c -- "+c.getClass());


        System.out.println("\nHashCode");
        System.out.println("o -- "+o.hashCode());
        System.out.println("a -- "+a.hashCode());
        System.out.println("b -- "+b.hashCode());
        System.out.println("c -- "+c.hashCode());

        System.out.println("\ntoString");
        System.out.println("o -- "+o.toString());
        System.out.println("a -- "+a.toString());
        System.out.println("b -- "+b.toString());
        System.out.println("c -- "+c.toString());

        //Wait and Notify involve threads.
        //Don't do them until you are using threads
        if(false) {
            a.notify();
            a.notifyAll();
            try {
                a.wait();
            } catch (Exception e) {
            }
        }


        System.out.println("\nDone!");
    }
}

class Thing extends Object{   //"extends Object" is not required for Objects.

}

```
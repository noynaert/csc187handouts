# 14.030 Polymorphism

Polymorphism means "Many Forms" or "Many Shapes."

There are two types of Polymorphism:

* Within a class, there may be methods with the same name, but different signatures
* Between classes, there may be the version in the super class and another version in the sub class.

## Late Binding

"Binding" is when the compiler and the computer system decide which function should be called when there is polymorphism.

Many OOP languages before Java had early binding.  For example, look a the following code:

```java
Object[] list = new Object[3];
list[0] = new Object();
list[1] = new Thing();
list[2] = new Object();

for(int i=0;i<3;i++)
    System.out.println(list[i].toString());
```

Which version of toString() should be called in each pass through the loop?

Early OOP languages used "early binding."  They would have used the Object version of .toString()

A lot of Java's power come from very late binding.  The JVM decides which version of toString() should be called instead of the compiler.  It decides immediately before variable is referenced.  Therefore the `list[0]` and `list[2]` calls would use the Object version of toString(), but the `list[1]` call would use the Thing version of toString()

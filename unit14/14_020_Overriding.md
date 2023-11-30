# 14.020 Overriding Methods

It is possible to "Override" or replace the method in the parent class.  We have been overriding the .toString() method for most of the semester.  We have also overridden the .equals() and the .hasCode() methods.

## The @Override decoration

The @ designates something is a "decoration."  Decorations are not part of the program logic.  They are messages to the compiler, JavaDoc, or other software that something special is going on.  We have seen several decorations so far.  There are quite a few additional decorations not covered in this course.  It is also possible to create your own decorations.

In some ways, @decorations do something similar to what IntelliJ does when we use the "generate" menu item.

### Decorations we have seen:

#### JavaDoc decorations

* @author
* @since
* @param
* @returns

#### Java decoration

* @Override

### Do we need to @Override?

TL;DR As of version 17, the use of @Override is mainly documentation for the programmer.  It is considered good practice.

Some earlier versions of Java could compile and run faster if you put in @Override.  If you are working on a project in an older version of Java, the programming team may consider the use of @Override mandatory.

## `final` Methods

Methods that are declared final may not be extended.

## Other things that may not be Overridden

[https://www.tutorialspoint.com/java/java_overriding.htm](https://www.tutorialspoint.com/java/java_overriding.htm) has a list of restrictions on overriding methods.

### Rules for Method Overriding (from TutorialsPoint)

* The argument list should be exactly the same as that of the overridden method.
* The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.
* The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overridding method in the sub class cannot be either private or protected.
* Instance methods can be overridden only if they are inherited by the subclass.
* A method declared final cannot be overridden.
* A method declared static cannot be overridden but can be re-declared.
* If a method cannot be inherited, then it cannot be overridden.
* A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
* A subclass in a different package can only override the non-final methods declared public or protected.
* An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
* Constructors cannot be overridden.

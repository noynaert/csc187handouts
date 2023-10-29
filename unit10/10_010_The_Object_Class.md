# 10.010 The Object Class

[The Object Class in the Java API](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Object.html)

Quote from the API:

> Class Object is the root of the class hierarchy. Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.

* Constructor
* `toString()`  -- This is a "magic method" in Java
* `equals()`
* `hashCode()`  An object will always generate the same hashcode.  If two objects are equal, then they must generate the same hashcode.
# 12.050 Equals and HashCode

The Object class has two related methods, `equals` and `hashCode`.  

Hashcodes are integer values produced by an object.  Every object created probably has its own id.

The Java standard says that if two objects are equal, then they must have the same hashCode.

Unless you really know what you are doing, it is generally best to allow IntelliJ (or whatever IDE you are using) generate the equals and hashcode methods, and then not modify them.
# 14.025 ISA and HASA Relationships

Classes can have different relationships with each other.

## HASA  (has a)

The Presidents class demonstrated "Has A" relationship.

- President "has a" Place
- President "has a" Name
- President "has a" LocalDate

## ISA (is a)

Inheritance creates an "is a" relationship.

In our earlier example a Thing object "is an" Object.

This is important to understanding inheritance.

### A child class may be assigned to a variable of the parent class.

```java
Object o = new Thing();

Object[] list = new Object[3];

list[0] = new Object();
list[1] = new Thing();
list[2] = new Thing()
```

### A child class can "do" all the things that parent class can do

A child class can call all of the methods of the parent class.

For example, it is possible to call o.toString() because both Object and Thing have defined toString() methods.
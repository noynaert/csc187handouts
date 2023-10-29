# 10.040 Create a Package and a Class

Package names are divided into part separated by periods.

## Our package names

If you own your own domain name you may use it.

Otherwise, we will use edu.missouriwestern.[your login id]

Your login id is unique to you.  After that you may use any system you wish.
 
## Packages and directory structure

Each part of the package name becomes a folder or a directory on the operating system.

## Create the class in the lowest level of your directory structure.

In IntelliJ, right click on src

---

```java
import edu.missouriwestern.noynaert.unit10.Widgit;

import java.util.Scanner;

public class Unit10 {
    public static void main(String[] args) {
        Widgit  foo = new Widgit();
        System.out.println(foo.hashCode());
        System.out.println(foo.equals(new Widgit()));
    }
}
```

---

```java
package edu.missouriwestern.noynaert.unit10;

public class Widgit extends Object{

    public String toString(){
        String s = "My favorite integer is " + hashCode();
        return s;
    }
}
```
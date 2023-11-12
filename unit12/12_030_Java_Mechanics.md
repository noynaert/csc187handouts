# 12.030 Java Mechanics

## Two Programs

Getting a Java program to execute requires two steps.  First, the source code must be compiled to a universal machine language.  After it is compiled it must be interpreted to run.

### javac

The compiler for Java is called `javac`  It compiles programs into the `.class` file containing the generic machine language.

### java,  The Java Virtual Machine (jvm)

The `java` program interprets the generic machine language into the native language of the computer

The java program is called the Java Virtural Machine or jvm.  To run a program, only the jvm is needed.

## Three Types of Java files

*  `.java` file   -- This is the source code
* `.class` file -- This is the compiled code for a class
* `.jar` file -- This is the zipped version of a package

### Jar files

A package can contain many classes.  It can also contain sub-packages.  

Jar files may be any of the following:

* An individual class (uncommon)
* A package
* An entire project or program

When we introduced packages we saw that packages are a directory structure.  

The term "jar" means a "Java Archive."  It is a zip file that contains a package.

Jar files may be imported and used in other programs.  [Maven Central](https://central.sonatype.com/) is a repository of third-party packages.
## Other Languages

There are other languages that use the JVM.  These languages produce .class files which can be run with the jvm.

Generally speaking, most of the time these languages can use classes and packages (jar files) that were written in other languages.  That means languages like Groovy and Kotlin can usually tap into the Java library.

Some modules may be written in other languages and then the class may be executed together

* Groovy
* Kotlin (mostly for programming mobile phones)

#### Kotlin example

```kotlin
 fun main(args: Array<String>) {

    val first: Int = 10
    val second: Int = 20

    val sum = first + second

    println("The sum is: $sum")
}
```
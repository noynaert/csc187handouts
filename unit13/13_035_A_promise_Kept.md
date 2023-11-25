# 13.035 A Promise Kept

At our first class I said it was necessary to treat the Java setup as an incantation you had to follow to get the program running.  Back then you had to memorize it.

However, on the first day I also promised that you would eventually know what every word meant.

What does every word and symbol do in a Java program?

```java
public class Main {
    public static void main(String[] args) {

    }
}
```

## Bonus things we have covered

* Which two words in the "incantation" could you change (We changed one of them constantly.  The second one is more subtle)
* The output statement we learned was `System.out.println("Hello, World");`
  * I don't think we ever looked up "System" in the API.  But what is it?
  * `out` is something we covered, but it is probably the most obscure item.  It represents an output stream.  
  * What is "println()?
  * In the early part of the class I said that println only takes a String.  So how do we get away with arguments like println(3)?

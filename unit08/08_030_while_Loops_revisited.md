# 08.030 while Loops Revisited

## Pretest Loops

We have looked at the while() loop.  The while loop is a "pretest loop" because the test is done before the loop begins.

### Skipping the body

In a pretest loop, it is easy to entirely skip the body of the loop.



## While not end-of-file.

What happens if the file is empty?

```java
while(input.hasNextInt()){
    number = input.nextInt();
    System.out.println(number);
}
```

## Counting loops

What happens if the string is an empty string?

```Java
        String word = "";
        word = word.trim(); //just to make sure all blanks are eliminated.
        int i = 0;
        while (i < word.length()) {
            System.out.println(word.charAt(i));
            i++;
        }
```


***The index is incremented as the last step in this type of loop.***  This seems upside down to many rookie programmers.

Many of these loops start counting at 0.  They end before the reach the number of items in the list of items to be processed.  For example, if the word ahs 4 characters, the booleans will probably be &lt;.

How does the counting loop make progress towards completion?

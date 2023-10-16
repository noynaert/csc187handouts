# 08.040 do...while() loops

```java
        int number = 0;      
        do{
            System.out.print("Type a positive number: ");
            number = keyboard.nextInt();
        }while(number <= 0);
        System.out.println("You typed "+number);
```

## Post test Loop

* The test happens *after* the body of the loop
* The body of the loop is guaranteed to execute at least one time.

## Loop continues while condition is `true`

To get out of the loop the condition must be false.

## The test is OUTSIDE the body of the loop

The test condition must usually be declared before the loop begins.

This is not all bad because it means the data is available outside the loop if you need it.

```java
        double r;
        do {
            r = Math.random();
            System.out.println(r);
        }while(r > 0.01);
```

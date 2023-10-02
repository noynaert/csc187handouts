# 06.040 Truth Tables

## Not
```java
    int age; //set from user input
    Scanner keyboard;
    boolean canVote;
    boolean tooYoung;

    age = keyboard.nextInt();
    canVote = (age >= 18); //() are not required
    tooYoung = !canVote;
```

A|!A
:---:|:---:
false|true
true|false

## Or

Parent tells kid:  I will give you $10 if you clean your room ***OR*** wash the dishes


A|B|A \|\| B
:---:|:---:|:---:
false|false|false
false|true|true
true|false|true
true|true|true

Clean Room|Clean Dishes|Gets $10 (or)
:---:|:---:|:---:
false|false|false
false|true|true
true|false|true
true|true|true

## And

Parent tells kid:  I will give you $10 if you clean your room ***AND*** wash the dishes

```java
boolean canJoin = (age >= 18 && age < 36);
```
A|B|A && B
:---:|:---:|:---:
false|false|false
false|true|false
true|false|false
true|true|true

Clean Room|Clean Dishes|Gets $10 (and)
:---:|:---:|:---:
false|false|false
false|true|false
true|false|false
true|true|true

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
true|false
false|true

## Or

You can order off the kid's menu if you are 10 or under ***OR** at least 65.

```java
boolean kidsMenu;

kidsMenu = age <= 10 || age >= 65;

//You may include parenthesis for readability

kidsMenu = ((age <= 10) || (age >= 65))
``````
A|B|A \|\| B
:---:|:---:|:---:
false|false|false
false|true|true
true|false|true
true|true|true

## And

To join the military you must be at least 18, but less than 36.

```java
boolean canJoin = (age >= 18 && age < 36);
```
A|B|A && B
:---:|:---:|:---:
false|false|false
false|true|false
true|false|false
true|true|true
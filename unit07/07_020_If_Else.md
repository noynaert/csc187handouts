# 07.020  If ... Else

Sometimes we want to do something if a boolean condition is true.  But there are also times when we want to do something else when the boolean expression is true.

```java
String coin;
double r = Math.random();
if(r < 0.5){
   coin = "Heads";
}else{
    coin = "Tails";
}
```

* Note the format used for the else.
* The same "single statement" rule applies to the else clause; the {curly braces} are optional if there is a single line.

The following also works.

```java
String coin;
double r = Math.random();
if(r < 0.5)
   coin = "Heads";
else
    coin = "Tails";
```


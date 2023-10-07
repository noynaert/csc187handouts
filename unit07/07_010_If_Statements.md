# 07.010 If Statements

## One syntax version

```text
     if( boolean expression ){
        statements
     }
```

There are several variations on the if statement.  This is presenting the general form.

The boolean statement is evaluated before anything else happens.

If the expression is true, the block of code in the parenthesis is executed.

If the expression is false, then the statement is skipped.

## Indentation is only for readability

Indentation is only for human readability.  Unlike Python, Java ignores indentation when processing the code.

Therefore the standard advice is to use {curly braces} even if they are not technically required.

### Styles of indentation

The following is the recommended style:

```java
if(x > 0){
    System.out.println("X is positive");
}
```

There is an older style you will sometimes see:

```java
if(x > 0)
   {
       System.out.println("X is positive");
   }
```

## Another version

```text
     if( boolean expression )
         statement
```

Another option is to have a single statement instead of a block.  However, it is very common to want to add another statement.  That can cause an logic error that is hard to spot because the compiler ignores indentation.

## The entire if structure is one statement

The rest of the program sees the if statment {including the block or single statement} as one statement.  So the following would work:

```java
if(x > 0)
     if(y > 0)
       System.out.println("Both X and Y are greater than 0");
```

Note the indentation.
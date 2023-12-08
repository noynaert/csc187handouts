# 15.030 Generics

## Kind of a side issue

This is a video you can skip.  but as you go on you will encounter more generics, and instructors tend to skip over explaining them.

## The Problem

```java
public static void print(String[] list, int n) {
        for (int i = 0; i < n; i++) {
            String word = list[i];
            System.out.println(word);
        }
    }

    public static void print(President[] list, int n) {
        for (int i = 0; i < n; ) {
            President president = list[i];
            System.out.println(president);
        }
    }

    public static void print(LocalDate[] list, int n) {
        for (int i = 0; i < n; i++) {
            LocalDate event = list[i];
            System.out.println(event);
        }
    }
```

## Generics to the rescue

```java
    public static <E> void print(E[] list, int n) {
        for (int i = 0; i < n; i++) {
            E e = list[i];
            System.out.println(e);
        }
    }
```
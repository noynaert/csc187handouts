# 10.020 The Namespace Problem

## The problem of naming things

> There are only two hard things in Computer Science: cache invalidation and naming things. -- Phil Karlton

# Namespace

An area where a name must be unique.

Namespace is related to the idea of *scope*

## The Namespace Problem

Not a major problem when almost all programs were written "in house."

As software became more sophisticated, it started incorporating other software. That created naming conflicts.

The problem was that each software developer needed to have a unique "Namespace."

### The Namespace Problem in our class

Last week I made a point of naming my methods "parseInt" and "parseDouble." I even used the same data types as an argument so that the methods had the same signature. It worked because my method was created in a different namespace of the Main class. The full name of the three potentially conflicting methods was Double.parseDouble(), Integer.parseInt(), Main.parseDouble(), and Main.parseInt(). Java just let me skip typing out the Main. when I was calling methods in the same class.

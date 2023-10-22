# 09.070 Call by Value

In some programming languages, there are two different types of parameters on functions:

* Call by Value.  Also known as Call by Copy.
  * The function ***cannot*** change the contents of the parameters.
* Call by Reference.  Also known as Call by Address.
  * The function ***can*** change the contents of the parameters

## Java always uses Call by Value (aka Call by Copy)

The above statement is absolutely true.  It is also sort of a lie.


## Passing Primitives

For primitive data types, only the value is passed over the interface between the calling method and the method that is passed.  If the method does change the value of a parameter, the calling routine does not know about it.

## Passing Objects and Arrays

When Objects and Arrays are created, the ***address*** of where the item is located in memory is what is stored in the variable.

When arrays and objects are declared, they borrow memory from an area called "the heap."  The variable contains the address where the item is stored.

So, when we pass an array or object to a method, it is getting the address where the item is stored.  Therefore, even though Java always uses "Call by Value" it simulates "Call by Reference" when arrays or objects are passed

So it is possible to fill an array if an empty array is passed to a method.  If there are already items in the array, the items in the array can be changed.

## Subtleties

### Arrays must be initialized before they are sent as parameters.

You cannot do "new" operations in the method and expect it to go back.

### "Immutable" objects

Some objects are immutable.  They are basically stuck with "call by copy."  

The API tells you if a class is immutable

Strings are an immutable class.

There is also a class called a StringBuffer that is mutable.





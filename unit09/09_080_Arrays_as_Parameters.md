# 09.080 Arrays as Parameters

## Passing Objects and Arrays

When Objects and Arrays are created, the ***address*** of where the item is located in memory is what is stored in the variable.

When arrays and objects are declared, they borrow memory from an area called "the heap."  The variable contains the address where the item is stored.

So, when we pass an array or object to a method, it is getting the address where the item is stored.  Therefore, even though Java always uses "Call by Value" it simulates "Call by Reference" when arrays or objects are passed

So it is possible to fill an array if an empty array is passed to a method.  If there are already items in the array, the items in the array can be changed.

## Subtleties

### Arrays must be initialized before they are sent as parameters.

You cannot do "new" operations in the method and expect it to go back.

However, a method may initialize an array and then *return* the array.  This is what happens when we .split() strings.

### "Immutable" objects

Some objects are immutable.  They are basically stuck with "call by copy."  

The API tells you if a class is immutable

Strings are an immutable class.

There is also a class called a StringBuffer that is mutable.

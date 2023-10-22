# 09_060 Using Arrays

## Physical Size and Logical Size

## Conventions

* `n` is the number of items on a list (the logical size)
  * There are n items on the array, indexed from [0] through [n-1]
  * For loops are normally set up as `for(int i=0; i<n; i++)`
* 'i' is used as an index to an array
  * If there is nesting, the, j and k are used as indexes for the inner loops.

If an array is not full, we usually assume it is filled from the 0 index upward.  This is called a "compact" or "nearly complete" array.

There are "sparse arrays" where values are scattered in the array, but in most cases we avoid that kind of situation.
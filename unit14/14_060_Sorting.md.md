# 14.060 Sorting

Last week we did a hand-coded Selection Sort.  It is an O(N²) sort.  It probably took several seconds to sort the 45,000 postal codes.

## QSort 

QSort is a much faster sorting method. The QSort has a growth rate of O(N log(N)) However, it is a complex sort to write and get correct.

The Arrays class has a sort(Object) method.  It actually has it in two forms  The first form only works for full arrays.  The second form sorts based on the index.  Normally we will sort from 0 through n.
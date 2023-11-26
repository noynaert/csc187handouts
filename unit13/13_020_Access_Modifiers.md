# 13.020 Access Modifiers

## Encapsulation

## The four access modifiers

Access modifiers may be applied to things declared at the class level.  

* **public**
  * Least restrictive
  * All other classes may access the item
* **protected**
  * Access by two groups
    * Members of the same package 
    * Sub classes
* (**default** -- **no modifier**)
  * Access by only one group
    * Only members of the same package may access the item
	  * I remember this as "Package Private"
* **private**
  * Most restrictive
  * Only members of the class can access the item

Access modifiers may also apply to the entire class, although some restrictions do apply.  

- public classes must be in a file named for the class.  
- classes may not be declared private or protected
- default may be used with classes if they are declared in the file that creates another class.

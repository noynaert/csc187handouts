# 10.080 Constructors


* Constructors should be public
* Constructors do not have a return type
* Constructors have the name of their class
* A "default constructor" or "noArg constructor" does not have any parameters
	* If there are no constructors defined, then Java creates a noArg constructor
	* If there are any constructors defined, then Java does not provide a noArg constructor
	* The programmer may create a noArg constructor.
* I prefer to call setters from constructors rather than coding them directly
* `this` constructor
	* I like to write the most complete constructor (with all the fields) before writing the others.
	* If other constructors are needed, call the "master constructor."




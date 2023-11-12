# 12.020 Language Translators

### Two types of files

* **Source Code** -- Written by a programmer
* **Object Code** -- Code that will run on the computer.

## Types of Translators

### Compiled languages

Compilers translate the entire program to machine language before the program is executed.  There is a file that contains the machine language.

```c
#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main(int argc, char** argv){
    srand(time(NULL));
 
    for(int i=0; i<10; i++){
        printf("%f\n", (double)rand()/RAND_MAX);
    }
}
```

### Interpreted languages

Interpreters translate each line of code before it is executed

```python
import random as rnd

for i in range(0,9):
    print(rnd.random())
```

## (Possibly invalid) traditional comparisons

* Compilers produce faster code because they avoid translation
* Compilers make an object code file, and the source code files do not need to be distributed
* Compilers tend to require more overhead, Interpreters are generally better for quick projects
* Easier for a team to work on a project in a compiled language.  Better for very large projects.

Portability between computer systems for both Interpreters and Compilers has always been elusive.

### Hybrid Languages

Java is a hybrid language.  It is a compiled language that translates the code into a "generic machine language."  The generic machine language is stored in a .class file.

The .class file is interpreted into native machine language of the computer it is running on.  The interpreter can be extremely fast and efficient

```java
public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
```

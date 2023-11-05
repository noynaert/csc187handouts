# 11.010 The PrintWriter Class

The PrintWriter class allows writing to files.

It is in the same family of classes as System.out, so most of the methods we are familiar with for System.out also work with PrintWriter.  This includes 

* `.print()`
* `.println()`
* `.printf()`

## Opening the PrintWriter

Opening the PrintWriter is similar to opening a file for input.  Opening PrintWriter on a file can throw a FileNotFoundException.  Therefore our usual try...catch methods similar to those for Scanner also apply to PrintWriter.

## Opening a PrintWriter is usually Destructive

If the file does not exist, then the file is created.

If the file already exists, the old file contents are discarded and a new file is put in its place.

## Flushing

Printing is difficult for computers because printing or writing to files is slow compared to the operation of the CPU and primary memory.  

Therefore most computer systems try to use "buffering."  Buffering is when the output intended for the printer or a file is first sent to something like an array.  The operating system decides on good times to copy the buffer to the output device (printer, terminal, file, etc.)

"Flushing" is the term for dumping the buffer to the output device or file.

Sometimes the delay can cause a problem, especially if the program or system crashes before the buffer gets flushed.

PrintWriters may be opened with and without flushing.

If the PrintWriter is opened without buffering, it can result in a lot of unnecessary delays and load on the computer system.  This is especially true when there are several individual printing operations involved in a single logical operation.  

### The `.flush()` method

One common solution is to do all of the output, and then explicitly issue the `.flush()` command.  

```java
public static void makeFile(String s) {
        PrintWriter output = null;
        try {
            output = new PrintWriter(new File("output.txt"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        output.println(s);
        output.flush();
        output.close();

    }
    ```

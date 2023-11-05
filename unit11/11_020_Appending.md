# 11.020 Appending to a File

Sometimes we want to append to the end of a file.  

We can do this by adding a layer between the File and the PrintWriter. The extra layer is the FileWriter.

```java
public static void fileAppender(String s){
        PrintWriter appender = null;
        try{
            LocalDateTime timestamp=LocalDateTime.now();
            FileWriter fileWriter = new FileWriter("logFile.log", true);
            appender = new PrintWriter(fileWriter);
            appender.printf("%s %s\n",timestamp,s);
            appender.flush();
            appender.close();

        }catch(Exception e){
            System.err.println(e.getMessage());
            System.exit(187);
        }
    }
```
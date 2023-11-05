# 11.030 Log File

```java
    public static void readReals(String fileName){
        Scanner input = null;
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println( e.getMessage());
            System.exit(1);
        }
        String line = input.nextLine();
        input.close();

        String[] fields = line.split("\s+");
        for(int i = 0;i<fields.length;i++){
            double number = parse(fields[i]);
            System.out.printf("I read %f\n", number);
        }
    }
    public static double parse(String s){
        double number = Double.NaN;
        try{
            number = Double.parseDouble(s);
        }catch(Exception e){
            LocalDateTime timeStamp = LocalDateTime.now();
            //System.err.printf("%s Error: %s\n ",timeStamp, e.getMessage());
            makeLogEntry(timeStamp, e);
        }

        return number;
    }

    private static void makeLogEntry(LocalDateTime timeStamp, Exception e) {
        PrintWriter log = null;
        try {
            log = new PrintWriter(new FileWriter(new File(LOGFILE),true));
        } catch (IOException ex) {
            System.err.println(e.getMessage());
            System.exit(187);
        }
        log.printf("%s Error: %s\n", timeStamp, e.getMessage());
        log.close();

    }```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        String fileName = "astro.txt";
        Scanner input = null;

        //values read from the file
        String name;
        int height;
        double weight;
        String employer;

        //boolean flags.
        boolean heightOK;
        boolean weightOK;
        boolean nameOK;
        boolean employerOK;

        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.printf("ERROR.  Could not open %s", fileName);
            System.exit(1);
        }

        //discard first line
        String line = input.nextLine();

        while(input.hasNext()){
            //read the data from file
            name = input.next();
            height = input.nextInt();
            weight = input.nextDouble();
            employer = input.next();

            //echo print
            //System.out.printf("%15s %5d cm, %5.1f kg, works for %s\n",name, height, weight, employer);
            nameOK = checkName(name);
            heightOK = checkHeight(height);
            weightOK = checkWeight(weight);
            employerOK=checkEmployer(employer);

            //System.out.printf("%15b %5b     %5b     %5b Results: ",  nameOK,heightOK, weightOK, employerOK);
            boolean qualified = (nameOK && heightOK && weightOK && employerOK);
            //System.out.println(qualified);

            System.out.printf("%15s Qualifies: %b\n", name,qualified);

        }

        input.close();

        System.out.println("Done!");
    }

    /**  Checks to see if there is an X or x in the name
     *
     * @param name  The name as read from the file
     * @return      Return true if the name does not have an x or X anywhere in the name
     */
    public static boolean checkName(String name){
        boolean ok = false;

        ok = !(name.toLowerCase().contains("x"));

        return ok;
    }
//stubs

    /**   Check to see if the height is in the range of 175 through 190cm.
     *
     * @param height  Height to the nearest CM
     * @return        Returns true if the height is 175 through 190cm.  Otherwise returns false
     */
    public static boolean checkHeight(int height){
        boolean ok = false;
        ok = (height >= 175) && (height <= 190);
        return ok;
    }

    /**
     * Checks to see if the weight is under 100kg.
     * @param weight  Weight to the nearest 1/10th of a KG
     * @return        Returns true if the weight is under 100 KG.
     */
    public static boolean checkWeight(double weight){
        boolean ok = false;
        ok = (weight < 100.0);

        return ok;
    }

    /**
     * Checks to see if the employer is not SpaceX, Blue Origin, or Amazon
     * @param employer The name of the employer.  Use nbsp for blanks in the file name
     * @return  Returns true if the employer is not SpaceX, Amazon, or Blue Origin.  Otherwise returns false.
     */
    public static boolean checkEmployer(String employer){
        boolean ok = false;
        ok = !(employer.equalsIgnoreCase("spacex")  || employer.equalsIgnoreCase("Blue Origin") || employer.equals("Amazon"));
        return ok;
    }
}

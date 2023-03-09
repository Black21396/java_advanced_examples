package maps_method_string;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    /*
        * chars: this is as Stream in String
        * we can use all method in Stream (ex: filter, limit, map, etc)
        * here I solve this matter: calculate all numbers inside string (execpt the last one)
          and divide the result with the last number in the class
     */
    public static void main(String[] args) {
        // define a string with numbers
        String s = "3344873";

        // define a var to hold the sum of the numbers
        // AtomicInteger, because I used asynchronised operation (using stream)
        AtomicInteger sum = new AtomicInteger();

        /*
           * chars: convert the string to character but not letters (but the character in ASCI code table)
         */
        s.chars()
                .limit(s.length() - 1)
                .forEach(c -> {
                    // minus 48, to convert from ASCI code to normal number
                    sum.addAndGet(c - 48);
                });
        // get the last number from the string
        int lastC = Integer.parseInt(s.charAt(s.length() - 1) + "");

        /*
         prepare the result, we have to add casting to make the result as double
         because the "/" operation return always integer result
         */

        double res = (double) sum.get() / lastC;

        //print the result
        System.out.println(res);

    }
}

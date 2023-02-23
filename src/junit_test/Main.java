package junit_test;

import java.util.Arrays;

/*
    *main class contain some simple methods test it in another class
    * here we use the "JUnit testing" to test our methods
    * if we want add test class for this class, type ctrl+alt+t
      show GUI, then put class test name
 */

public class Main{
    public int[] sortArray(int[] a){
        Arrays.sort(a);
        return a;
    }

    public int multiplication(int n1, int n2){
        return n1*n2;
    }

    public static void main(String[] args) {

    }
}

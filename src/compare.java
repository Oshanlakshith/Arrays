// Java Program to Sort Array of Integers
// by Default Sorts in an Ascending Order
// using Arrays.sort() Method

// Importing Arrays class from the utility class
import java.util.Arrays;

import static java.util.Arrays.sort;

// Main class
 class compare {
     public static boolean compare(int[]a, int[]b){
         if(a.length == b.length){
            return true;
         }
         return false;
     }

    // Main driver method
    public static void main(String[] args) {
        int []one={10,20,30,40,50,60,70,80,90,100};
        int []two={10,20,40,50,60,70,80,90,100};
        int []three={10,20,30,40,50,60,80,90,100};
        int []four={10,20,30,40,50,60,70,80,90,100};
        int []fivw={10,20,40,50,60,70,80,100};

        System.out.println("one, two : "+compare(one,two)); //false
        System.out.println("one, three : "+compare(one,three)); //false
        System.out.println("one, four : "+compare(one,four)); //false
        System.out.println("one, five : "+compare(one,fivw)); //true


    }
}

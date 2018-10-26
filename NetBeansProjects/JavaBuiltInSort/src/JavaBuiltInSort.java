import static java.util.Arrays.sort;
import java.util.Collections;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 92019494
 */
public class JavaBuiltInSort {

 

    /* Prints the array */

    void printArray(Integer arr[])

    {

        int n = arr.length;

        for (int i=0; i<n; ++i)

            System.out.print(arr[i] + " ");

        System.out.println();

        System.out.println();

    }

 

    // Driver method to test above

    public static void main(String args[])

    {

        JavaBuiltInSort ob = new JavaBuiltInSort();

        Integer arr[] = {64, 34, 25, 12, 22, 90, 11};
        


        System.out.println("The Unsorted array is");

        ob.printArray(arr);

        

        sort(arr, 3, 7);

        System.out.println("The Java Built In Sort of the last 4 elements is");

        ob.printArray(arr);        

        

        sort(arr);

        System.out.println("The Java Built In Sorted array is");

        ob.printArray(arr);

        

        sort(arr, Collections.reverseOrder());

        System.out.println("The Java Built in Reverse Sorted array is");

        ob.printArray(arr);
        
        //new array
        String array[] = {"Theo", "Tyrone", "Ellie", "Ellis", "Callum", "Jamie", "Matt", "Andrew"};
        
        sort(array);

        System.out.println("The Java Built In Sorted string array is");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]); 
            
        }
        
        sort(array, Collections.reverseOrder());

        System.out.println("The Java Built in Reverse Sorted array is");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }
    }

}
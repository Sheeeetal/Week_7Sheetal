package week_7;

import java.util.Arrays;

public class Task17
{
    public static void main(String[] args)
    {
        int[] array1={1,2,3,4,5,6,7,8,9,10};
        String[] array2={"Peter","John","David","Palak","George"};
//Arrays ia a class which consist static method
        System.out.println("Array1: " + Arrays.toString(array1)); //Will display the entered array list items
        Arrays.sort(array1); //Will sort the array
        System.out.println("Sorted numeric array: " +Arrays.toString(array1));

        System.out.println("Array1: " + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array: " +Arrays.toString(array2));

    }
}


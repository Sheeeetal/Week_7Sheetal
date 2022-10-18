package week_7;


import java.util.Arrays;

public class Task18
{
    public static void main(String[] args)
    {
        int []array={1,2,3,4,5,6,7,8};
        int total=0;
//loop to calculate the sum of array's elements
        for(int i=0;i<array.length;i++){
            total=total+array[i];
    }
        System.out.println("Elements of an array as given below:");
        System.out.println(Arrays.toString(array));//Display the elements of an array.
        System.out.println("Sum of all the elements of an array: " +total);
    }
}

package week_7;

import java.util.Arrays;

public class Task20
    {
        private static void find(int[] array, int toCheckValue)
        {
            boolean test=false;
            for(int item:array)
            {
                if(item==toCheckValue)
                {
                    test=true;
                    break;
                }
            }
            System.out.println("Is "+ toCheckValue + " present in the array: " + test);
        }

        public static void main(String[] args)
        {
            int[] array={1,2,3,4,5,6};
            System.out.println("Elements of an array are as below: ");
            int toCheckValue=4;
            System.out.println("Array: "+ Arrays.toString(array));
            find(array, toCheckValue);

        }
    }



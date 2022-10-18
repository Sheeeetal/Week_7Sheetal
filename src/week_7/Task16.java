package week_7;


import java.util.Scanner;

public class Task16
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Input any number");
        int num = s.nextInt();
        if (num>0)
        {
            System.out.println("Number is positive");
        } else if (num<0)
        {
            System.out.println("Number is negative");
        }else
        {
            System.out.println("Number is zero");
        }
        s.close();

    }
}

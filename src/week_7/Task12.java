package week_7;


import java.util.Scanner;

public class Task12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input any character:");
        char a = s.next().charAt(0);
        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'z')) {
            System.out.println(a + " is an alphabet.");
        } else if (a >= '0' && a <= '9') {
            System.out.println(a + " is a digit.");
        } else
        {
            System.out.println(a+ " is a special character.");
        }
        s.close();
    }
}
package week_7;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the number");
        int num = s.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
        s.close();
    }
}

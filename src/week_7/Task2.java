package week_7;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a;
        System.out.println("Enter any year");
        a=s.nextInt();
        if(a%100==0 && a%400==0 || a%100!=0 && a%4==0)
        {
            System.out.println("Leap year");
        }
     else {
            System.out.println("Not Leap Year");
        }
    }
}

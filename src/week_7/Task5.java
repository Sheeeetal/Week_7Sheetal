package week_7;

import java.util.Scanner;

public class Task5

{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter employee id:");
        int empID = s.nextInt();
        System.out.println("Enter employee name:");
        String name=s.next();
        System.out.println("Enter the basic salary");
        int salary=s.nextInt();
        double HRA=salary *10/100;
        double DA=salary*8/100;
        double TA=salary*9/100;
        double PF=salary*20/100;
        double GS=salary+HRA+DA+TA-PF;
        System.out.println("|----------------------------|");
        System.out.println("| Salary Slip |");
        System.out.println("|----------------------------|");
        System.out.println("|Employee Id :"+empID+" |");
        System.out.println("|Employee Name :"+name+" |");
        System.out.println("|----------------------------|");
        System.out.println("|Basic Salary:"+salary+" |");
        System.out.println("|HRA 10% :"+HRA+" |");
        System.out.println("|DA 8% :"+DA+" |");
        System.out.println("|TA 9% :"+TA+" |");
        System.out.println("|PF -20& :"+PF+" |");
        System.out.println("|----------------------------|");
        System.out.println("|Gross Salary:"+GS+" |");
        System.out.println("|----------------------------|");
        System.out.println("|----------------------------|");
    }
}


package week_7;

public class Task11{
    public static void main(String[] args) {
        System.out.println("Number divisible by 3 as below:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.println("Number divisible by 5 as below:");
        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) {
                System.out.print(j + ",");

            }

        }
    }
}



import java.util.Scanner;

//Task 1 is Print the table for any number.
class Task1 {
    public void table() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for the table:");
        int a = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", a, i, a * i);
        }
    }
}

//Task 2 is print the sum for n numbers.
class Task2 {
    public void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " numbers: " + sum);
    }
}

//Task 3 is print the factorial of integer number.
class Task3 {
    public void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int x = scan.nextInt();
        int fac = 1;
        while (x > 0) {
            fac *= x;
            x--;
        }
        System.out.println("Factorial of the number: " + fac);
    }
}
//Static class should have public otherwise java program file have the name of class who is public.
public class LoopPractice {
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.table();

        Task2 tr = new Task2();
        tr.sum();

        Task3 trr = new Task3();
        trr.factorial();
    }
}
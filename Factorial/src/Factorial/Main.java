package Factorial;

import java.util.Scanner;

public class Main {

    public static long factorial(int n){
        if(n == 0)
            return 1;

        return factorial(n-1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("This program calculates the factorial of an entered number (recursively).");

        System.out.print("Enter a positive integer: ");
        n = sc.nextInt();

        long factorial;
        factorial = factorial(n);
        System.out.println("The factorial of " + n + " is " + factorial + ".");

        sc.close();
    }
}

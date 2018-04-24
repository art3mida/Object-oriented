package FibonacciNumbers;

import java.util.Scanner;

public class Main {

    public static int fibonacciRecursive(int n){
        if(n == 1 || n == 2)
            return 1;

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static int fibonacciIterative(int n){
        int num1 = 1, num2 = 1, res = 0;
        if(n <= 2) return 1;
        n-=3;

        while(n>0){
            num2 = num1 + num2;
            num1 = num2 - num1;
            n--;
        }

        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("This program computes the n-th number in the Fibonacci sequence.");

        System.out.print("Enter n: ");
        n = sc.nextInt();

        int fib;
        // fib = fibonacciRecursive(n);
        fib = fibonacciIterative(n);

        System.out.println("The n-th number is " + fib + ".");
        sc.close();
    }
}

package ArithmeticMean;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("This program calculates the sum and the arithmetic mean for the input (real) numbers.");
	    System.out.print("How many input elements are there: ");
	    n = sc.nextInt();

	    double temp;
	    double sum = 0;
	    for(int i = 0; i<n; i++){
	        temp = sc.nextDouble();
	        sum += temp;
        }

        System.out.println("The sum of the elements is: " + sum);
	    System.out.println("The arithmetic mean is: " + sum/n);
    }
}

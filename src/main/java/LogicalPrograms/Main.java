package LogicalPrograms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // fibonacci series
        System.out.print("Enter number of Fibonacci terms to display: ");
        int count = scanner.nextInt();
        Fibonacci.printFibonacciSeries(count);

        // perfect number
        System.out.print("\nEnter a number to check if it's a perfect number: ");
        int number = scanner.nextInt();
        System.out.println(number + " is a perfect number? " + PerfectNumber.isPerfectNumber(number));

        // prime number
        System.out.print("\nEnter a number to check if it's a prime number: ");
        number = scanner.nextInt();
        System.out.println(number + " is a prime number? " + PrimeNumber.isPrime(number));

        // reverse number
        System.out.print("\nEnter a number to reverse: ");
        number = scanner.nextInt();
        System.out.println("Reverse of " + number + " is " + ReverseNumber.reverse(number));

        // coupon numbers
        System.out.print("\nEnter number of distinct coupons: ");
        int n = scanner.nextInt();
        System.out.println("Number of random numbers needed: " + CouponNumbers.collectCoupons(n));

        // stopwatch
        Stopwatch stopwatch = new Stopwatch();

        System.out.println("\nPress '1' to start the stopwatch:");
        int start = scanner.nextInt();
        if (start == 1) {
            stopwatch.start();
        }
        System.out.println("\nPress 2 to stop stopwatch: ");
        int stop = scanner.nextInt();
        if (stop == 2) {
            stopwatch.stop();
        }

        System.out.println("\nElapsed Time in milliseconds: " + stopwatch.getElapsedTime());
    }
}
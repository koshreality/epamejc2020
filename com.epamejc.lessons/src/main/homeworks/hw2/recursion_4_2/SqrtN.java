package main.homeworks.hw2.recursion_4_2;

import java.util.Scanner;

public class SqrtN {
    public static void main(String[] args) {
        int n = 0;
        int pow = 0;

        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Please enter number: ");
            n = scan.nextInt();
            System.out.print("Please enter pow: ");
            pow = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Error! " + e);
        } finally {
            scan.close();
        }

        if(pow < 0) {
            System.out.println("Enter positive pow!"); // Check pow for positive
        }

        if (pow == 1) {                                // Check pow for 0 and 1 value
            System.out.println(n);
        } else if (pow == 0) {
            System.out.println(1);
        } else {
            System.out.println("Result: "+ sqN(n, n, pow));
        }
    }

    private static int sqN(int n, int tmp, int exp) {
        tmp = tmp * n;
        if (exp == 2) {
            return tmp;
        }
        exp--;
        return sqN(n, tmp, exp);
    }
}
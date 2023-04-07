/*During the discussion on Lambda Expressions, Dr. Wangdu told the students that Lambda Expressions can be passed as an argument to represent 
the Object of any Functional Interface.

He defined a functional interface Test with an abstract method int count(int [] arr) and 
asked his students to implement 2 Lambda expressions one to count all the prime numbers in an array and 
second to count all the even numbers of the array which are divisible by 5.

A class Demo is given with a method void count(Test ob) Help the students to complete the given code.

Input Format:
First line reads the number of elements N in the array
Second line reads the N integers separated by SPACE

Constraints:
N > 0 and N < 10

Output Format:
Prints the number of PRIME NUMBERS in the array and COUNT of all the even numbers separated by SPACE

Sample Input 0:
5
11 3 15 8 10 

Sample Output 0:
2 1

*/

import java.util.Scanner;

interface Test {
    int count(int[] arr);
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Lambda expression to count prime numbers in the array
        Test primeCount = (int[] a) -> {
            int count = 0;
            for (int num : a) {
                if (isPrime(num)) {
                    count++;
                }
            }
            return count;
        };

        // Lambda expression to count even numbers divisible by 5 in the array
        Test evenDivBy5Count = (int[] a) -> {
            int count = 0;
            for (int num : a) {
                if (num % 2 == 0 && num % 5 == 0) {
                    count++;
                }
            }
            return count;
        };

        System.out.println(primeCount.count(arr) + " " + evenDivBy5Count.count(arr));
    }

    // Utility method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

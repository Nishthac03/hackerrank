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

interface Test 
{
    int count(int[] arr);
}

public class Demo 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Lambda expression to count prime numbers in the array
        Test primeCount = (int[] a) -> 
        {
            int count = 0;
            for (int num : a) 
            {
                if (isPrime(num)) 
                {
                    count++;
                }
            }
            return count;
        };

        // Lambda expression to count even numbers divisible by 5 in the array
        Test evenDivBy5Count = (int[] a) -> 
        {
            int count = 0;
            for (int num : a) 
            {
                if (num % 2 == 0 && num % 5 == 0) 
                {
                    count++;
                }
            }
            return count;
        };

        System.out.println(primeCount.count(arr) + " " + evenDivBy5Count.count(arr));
    }

    // Utility method to check if a number is prime
    private static boolean isPrime(int num) 
    {
        if (num < 2) 
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}

/*
LPU is going to host the Day 1 placement drive for the 4th year students of B.Tech. program on 25th August 2023 in which 
3 MNCs are going to counduct the recrutiment for all the students who are eligible for the placement based on the minimum CGPA criteria.

All the 3 companies are having their own minimum CGPA requirement and they wanted to implement a JAVA PROGRAM 
which can give the count of all the eligible students for each company.

The Program must read the number of students N and their CGPA and store all the N student objects in an array. 
Invoke the filterStudents(Student [] cgpa, CompanyNorms ob) method by passing the Lambda expressions corresponding to 
the minimum cgpa norms of the company and print the count of the students.

Input Format:
First Line reads the number of students N

Second Line reads the cgpa of N students separated by SPACE

Third Line reads the minimum cgpa requirement of 3 companies separated by SPACE

Constraints:
g

Output Format:
Prints 3 numbers separated by SPACE i.e. number of eligible students for the 3 companies respectively

Sample Input 0:
2
7.19 2.5
5.5 7.0 6.5

Sample Output 0:
1 1 1 

Sample Input 1:
3
4.25 6.08 5.19
7.5 6.0 5.5

Sample Output 1:
0 1 1 
*/


import java.util.Scanner;

interface CompanyNorms 
{
    boolean isEligible(Student s);
}

class Student 
{
    private double cgpa;

    public Student(double cgpa) 
    {
        this.cgpa = cgpa;
    }

    public double getCgpa() 
    {
        return cgpa;
    }
}

public class PlacementDrive 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        // Reading the CGPA of N students
        for (int i = 0; i < n; i++) 
        {
            double cgpa = sc.nextDouble();
            students[i] = new Student(cgpa);
        }

        // Reading the minimum CGPA requirement of the 3 companies
        double[] companyNorms = new double[3];
        for (int i = 0; i < 3; i++) 
        {
            companyNorms[i] = sc.nextDouble();
        }

        // Lambda expressions to check if a student is eligible for the company
        CompanyNorms[] companyFilters = new CompanyNorms[3];
        companyFilters[0] = (Student s) -> s.getCgpa() >= companyNorms[0];
        companyFilters[1] = (Student s) -> s.getCgpa() >= companyNorms[1];
        companyFilters[2] = (Student s) -> s.getCgpa() >= companyNorms[2];

        // Counting the number of eligible students for each company
        int[] eligibleCounts = new int[3];
        for (int i = 0; i < 3; i++) 
        {
            eligibleCounts[i] = filterStudents(students, companyFilters[i]);
        }

        // Printing the eligible counts
        for (int count : eligibleCounts) 
        {
            System.out.print(count + " ");
        }
    }

    // Method to filter the students who are eligible for a given company
    private static int filterStudents(Student[] students, CompanyNorms filter) 
    {
        int count = 0;
        for (Student s : students) 
        {
            if (filter.isEligible(s)) 
            {
                count++;
            }
        }
        return count;
    }
}

/*Question1:   Raju and ramu are playing a game of odd and even number first raju tells one odd number and ramu tells one even number, 
in this order they create a list of 6 numbers. Now raju needs to print even number and ramu needs to print the odd number

Input Format:
1 2 3 4 5 6

Constraints:
Create an array list and use scanner input to add 6 numbers
Implement Lambda expression to print even number and odd numbers separately

Output Format:
2 4 6
1 3 5

Sample Input 0:
1 2 3 4 5 6

Sample Output 0:
2 4 6
1 3 5
*/


import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>a= new ArrayList<Integer>();
        ArrayList<Integer>c= new ArrayList<Integer>();
        ArrayList<Integer>d= new ArrayList<Integer>();
        for(int i=0;i<6;i++)
        {
            int b=sc.nextInt();
            a.add(b);
        }
        for (int i : a) 
        {
              if(i%2==0)
              {
                  c.add(i);
              }
              else
              {
                  d.add(i);
               }
         }
        for(int i:c)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:d)
        {
            System.out.print(i+" ");
        }
    }
}


/*Question2:    Rahul, Ramu and Ramesh where creating 3 different Function interface with multiple parameters, 
further Rahul did addition operation with multiple parameters, Ramu did multiplication operation with multiple parameters and
Ramesh passed string message of the answers what Rahul and Ramu got in terms of words

Input Format:
2 4

Constraints:
Use 3 different types of functional interface for addition, multiplication operation with multiple parameters and one for passing the string message.
Use Only Lambda expression for addition, multiplication operations and passing the string message

Output Format:
6
8
six eight

Sample Input 0:
2 4

Sample Output 0:
6
8
six eight
*/


import java.io.*;
import java.util.function.*;
import java.util.*;

public class Solution 
{
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int product=a*b;
        
        System.out.println(sum);
        System.out.println(product);
        String x=convertNumberToWords(sum);
        String y=convertNumberToWords(product);
         System.out.print(x);
        System.out.print(" ");
         System.out.print(y);
        
    }
        private static String convertNumberToWords(int number)
        {
        
        if (number == 0) 
        {
            return "zero";
        }
        
        if (number < 0 || number > 999999) 
        {
            return "invalid number";
        }
        
        String words = "";
        
        if (number / 1000 > 0) 
        {
            words += convertNumberToWords(number / 1000) + " thousand ";
            number %= 1000;
        }
        
        if (number / 100 > 0) 
        {
            words += ones[number / 100] + " hundred ";
            number %= 100;
        }
        
        if (number > 0) 
        {
            if (number < 20) 
            {
                words += ones[number];
            } 
            else 
            {
                words += tens[number / 10] + " ";
                number %= 10;
                if (number > 0) 
                {
                    words += ones[number];
                }
            }
        }
        
        return words;
        }
}

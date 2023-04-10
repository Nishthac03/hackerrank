/*
Hemant is Store owner. In order to increase his sale he imposed a restriction on buying the trousers but there is a restriction 
that the customer cant buy trouser alone, the customer has to purchase shirt first then only he can buy trousers but 
single shirt can be buyied individually.Develop a program in order to increase his sale.

Input Format:
First line will contain one integer value N representing number of items purchased.
Next N lines will contain one integer value 0 or 1 representing sequence of items purchased(0 means Shirt and 1 means Trouser).

Constraints:
N can't be negative.
Trouser cant be buyed without shirt. After fisrt line in the input the value should either be 0 or 1, otherwise output will be printed Invalid input

Output Format:
Valid Purchase/Invalid Purchase

Sample Input 0:
3
1
1
0

Sample Output 0:
Invalid Purchase

Sample Input 1:
2
2
3

Sample Output 1:
Invalid input
*/


import java.util.Scanner;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) 
        {
            System.out.println("Invalid input");
            return;
        }
        int shirtCount = 0, trouserCount = 0;
        for (int i = 0; i < n; i++) 
        {
            int item = sc.nextInt();
            if (item == 0) 
            {
                shirtCount++;
            } 
            else if (item == 1) 
            {
                if (shirtCount > 0) 
                {
                    trouserCount++;
                    shirtCount--;
                } 
              else 
                {
                    System.out.println("Invalid Purchase");
                    return;
                }
            } 
            else 
              {
                System.out.println("Invalid input");
                return;
              }
        }
        if (trouserCount == 0) 
        {
            System.out.println("Invalid Purchase");
        } 
        else 
        {
            System.out.println("Valid Purchase");
        }
    }
}

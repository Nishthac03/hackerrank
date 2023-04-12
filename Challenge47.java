/*
Shubham is in the Shopping mall and he wants to buy trouser. The sales man asks for the waist size from him. 
The size of trousers available in the mall is between 18 inches to 40 inches. If the customer asks for 
trouser size less than 18 and greater than 40 then an UnexpectedTrouserSizeException is thrown. 
Handle the exception and print the demanded size is out of stock

Input Format:
One integer value representing waist of the trouser.

Constraints:
Size should be in integer only.

Output Format:
try and shop/the demanded size is out of stock/invalid input

Sample Input 0:
20

Sample Output 0:
try and shop

Sample Input 1:
17

Sample Output 1:
the demanded size is out of stock

Sample Input 2:
16.6

Sample Output 2:
invalid input
*/


import java.util.Scanner;

class UnexpectedTrouserSizeException extends Exception 
{
    public UnexpectedTrouserSizeException() 
    {
        super();
    }
}

public class Solution
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            if (size < 18 || size > 40) 
            {
                throw new UnexpectedTrouserSizeException();
            } 
            else 
            {
                System.out.println("try and shop");
            }
        } 
        catch (UnexpectedTrouserSizeException e) 
        {
            System.out.println("the demanded size is out of stock");
        } 
        catch (Exception e) 
        {
            System.out.println("invalid input");
        }
        sc.close();
    }
}

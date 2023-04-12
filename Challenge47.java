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


/*
Hari ask Rama to make an arithmatic calculator which will accpet two integer values. but at a time only one opatation(+,-,*,/) he can do.
Help rama to create this using labda expression.

Input Format:
First line will contain two ineteger values on which we have to perform the operation
Second line will contain one integer value which will describe the operation
1 addition
2 subtraction
3 multiplication
4 division

Constraints:
number should be integer value

Output Format:
one integer value represnting result of the operation if wrong input then print Invalid

Sample Input 0:
7 8
2

Sample Output 0:
-1

Sample Input 1:
4 5
5

Sample Output 1:
Invalid
*/


import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int op = sc.nextInt();
        sc.close();

        IntBinaryOperator operation;
        switch (op) 
        {
            case 1:
                operation = (x, y) -> x + y;
                break;
            case 2:
                operation = (x, y) -> x - y;
                break;
            case 3:
                operation = (x, y) -> x * y;
                break;
            case 4:
                operation = (x, y) -> x / y;
                break;
            default:
                System.out.println("Invalid");
                return;
        }

        int result = operation.applyAsInt(a, b);
        System.out.println(result);
    }
}

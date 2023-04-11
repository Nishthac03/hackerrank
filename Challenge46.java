/*

Cube and cuboid have a difference that in cube all the six faces are square while in cuboid all faces are rectangular.
Write a program in which user will enter length, breath, and height and identify that wheather it is a cuboid or not. 
If user input is same for length, breath, and height then it will be cube and program should through InvalidCuboidException. 
Do the exception handling and print Invalid Cuboid.

Input Format:
Three space seperated integers representing length, breath, and height.

Constraints:
Maximum value can be 10.

Output Format:
Valid Cuboid/ Invalid Cuboid/ Invalid Input

Sample Input 0:
5 10 5

Sample Output 0:
Valid Cuboid

Sample Input 1:
5 7 12

Sample Output 1:
Invalid Input

Sample Input 2:
4 4 4

Sample Output 2:
Invalid Cuboid
*/


import java.util.Scanner;

public class CuboidIdentifier 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            int length = scanner.nextInt();
            int breadth = scanner.nextInt();
            int height = scanner.nextInt();

            if (length <= 0 || breadth <= 0 || height <= 0) 
            {
                throw new InvalidInputException();
            }

            if (length == breadth && breadth == height) 
            {
                throw new InvalidCuboidException();
            }

            if (length == breadth || breadth == height || height == length) 
            {
                System.out.println("Valid Cuboid");
            } 
            else 
            {
                System.out.println("Invalid Input");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Invalid Cuboid");
        }
    }
}

class InvalidCuboidException extends Exception 
{
    public InvalidCuboidException() 
    {
        super("Invalid Cuboid");
    }
}

class InvalidInputException extends Exception 
{
    public InvalidInputException() 
    {
        super("Invalid Input");
    }
}

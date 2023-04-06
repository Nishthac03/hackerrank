/*Raju and ramu are playing a game of odd and even number first raju tells one odd number and ramu tells one even number, 
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

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>a= new ArrayList<Integer>();
        ArrayList<Integer>c= new ArrayList<Integer>();
        ArrayList<Integer>d= new ArrayList<Integer>();
        for(int i=0;i<6;i++){
            int b=sc.nextInt();
            a.add(b);
        }
        for (int i : a) {
      if(i%2==0){
          c.add(i);}
            else{
                d.add(i);
            }
        }
        for(int i:c){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:d){
            System.out.print(i+" ");
        }
    }
}

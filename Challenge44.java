/*
Create a functional interface Predicate with an abstract method test with following signature: boolean test(String t); 
Write a test program to filter all the strings present in group of strings which ended with character ‘g’ by using 
above test method with the help of lambda expression.

Input Format:
Your program should take 2 types of inputs. First will represents the number of Strings and second will be the objects of Strings. 
If the number of strings will be less than equal 1 then display the message “Invalid” without asking for any input.

Constraints:
Number of strings should be greater than 1

Output Format:
Should be list of the strings in separate lines which are ended with character ‘g’

Sample Input 0:
5
Gang
Spring
Java
Live
Swing

Sample Output 0:
Gang
Spring
Swing

Sample Input 1:
1

Sample Output 1:
Invalid
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) 
        {
            System.out.println("Invalid");
            return;
        }

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            strings.add(scanner.next());
        }

        Predicate<String> endsWithG = s -> s.endsWith("g");
        List<String> filteredStrings = filterStrings(strings, endsWithG);

        for (String s : filteredStrings) 
        {
            System.out.println(s);
        }
    }

    private static List<String> filterStrings(List<String> strings, Predicate<String> predicate) 
    {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) 
        {
            if (predicate.test(s)) 
            {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;
    }
}

/*
Create a class Student having attributes name (String), rollNo (int) and department (String). 
Create a functional interface Predicate with an abstract method test with following signature: boolean test(Student t); 
Write a test program to filter all the Students who is from ‘CSE’ department’ by using above test method with the help of lambda expression.

Input Format:
Your program should take 2 types of inputs. First will represents the number of Students and second will be 
the attributes of students in the order (name, rollNo, department). If the number of students will be 
less than equal 1 then display the message “Invalid” without asking for any input

Constraints:
Number of students should be greater than 1

Output Format:
Your program should display rollNo of the students in separate lines which are from ‘CSE’ department.

Sample Input 0:
3
Raghav
5
CSE
Amit
7
ECE
Shavi
10
CSE

Sample Output 0:
5
10

Sample Input 1:
1

Sample Output 1:
Invalid
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) 
        {
            System.out.println("Invalid");
            return;
        }

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            String name = scanner.next();
            int rollNo = scanner.nextInt();
            String department = scanner.next();
            students.add(new Student(name, rollNo, department));
        }

        Predicate<Student> cseDepartment = s -> s.getDepartment().equals("CSE");
        List<Integer> filteredRollNos = filterStudents(students, cseDepartment);

        for (Integer rollNo : filteredRollNos) 
        {
            System.out.println(rollNo);
        }
    }

    private static List<Integer> filterStudents(List<Student> students, Predicate<Student> predicate) 
    {
        List<Integer> filteredRollNos = new ArrayList<>();
        for (Student s : students) 
        {
            if (predicate.test(s)) 
            {
                filteredRollNos.add(s.getRollNo());
            }
        }
        return filteredRollNos;
    }
}

class Student 
{
    private String name;
    private int rollNo;
    private String department;

    public Student(String name, int rollNo, String department) 
    {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public String getName() 
    {
        return name;
    }

    public int getRollNo() 
    {
        return rollNo;
    }

    public String getDepartment() 
    {
        return department;
    }
}

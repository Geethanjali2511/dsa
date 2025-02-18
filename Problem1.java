import java.util.Scanner;

/*Prob 1 : Write a program that takes an integer, then a string, then a char from the
user and prints them in the screen.
Input:  2 Name y
Expected Output:
2
Name
y*/
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer");
        int value1=sc.nextInt();
        System.out.println("Enter String or name");
        String value2=sc.next();
        System.out.println("Enter character");
        String value3=sc.next();
        char v3=' ';
        if(!value3.isEmpty()){
            v3=value3.charAt(0);
        }
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(v3);

    }
}

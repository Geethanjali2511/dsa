import java.util.Scanner;

/* Prob 4: Write a program using switch case which takes a value and prints
the respective Size.
If size is 29 then its small
If size is 30 then its Medium
If size is 38 then its Large
If size is 42 then its XLarge
If size is not any of the above then Invalid.
Input: 29
Expected Output:
Small  */
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int size=sc.nextInt();
        switch (size){
            case 29:
                System.out.println("It's small");
                break;
            case 30:
                System.out.println("It's medium");
                break;
            case 38:
                System.out.println("It's large");
                break;
            case 42:
                System.out.println("It's extra large");
                break;
            default:
                System.out.println("It's not valid");
                break;
        }
    }
}

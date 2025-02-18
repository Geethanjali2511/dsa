import java.util.Scanner;

/* Prob 2: Write a program to check whether a triangle can be formed with
the given values for the angles.
If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.
Input: 45 45 45
Expected Output:
Triangle cannot be formed
Explanation -> We are getting 3 inputs, that is three angles of triangle,
but here the sum of three angles that is 45+45+45 is not equal to 180 so Triangle
cannot be formed is the output. */
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int triangle=180;
        System.out.println("Enter the three numbers");
        int value1=sc.nextInt();
        int value2=sc.nextInt();
        int value3=sc.nextInt();
        int sum=value1+value2+value3;
        if(sum==triangle){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }
    }
}

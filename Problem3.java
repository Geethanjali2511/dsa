import java.util.Scanner;

/*  Prob 3: Given mark of student, Print the Grade
Grade A if mark is greater than or equal to 90
Grade B if mark is greater than or equal to 80
Grade C if mark if greater than or equal to 60
Grade D if mark if greater than or equal to 35
Fail if mark is lesser than 35
Input: 95
Expected Output:Grade A
Explanation: Here 95 is greater than or equal to 90 so its Grade A   */
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Marks");
        int marks=sc.nextInt();

        if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        }else if(marks>=60){
            System.out.println("Grade C");
        }else if(marks>=35){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
    }
}

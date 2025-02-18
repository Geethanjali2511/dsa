import java.util.Scanner;

/* Prob 1: Write a program which takes two values x and y. Prints x for y number of times.
Input:
2
3
Expected Output
2
2
2
Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output. */
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        for(int i=0; i<y;i++){
            System.out.println(x);
        }
    }
}

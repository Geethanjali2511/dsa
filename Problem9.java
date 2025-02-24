import java.util.Scanner;
/*
Sample 1: Input: n = 4 Expected output:
*
**
***
****   */
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

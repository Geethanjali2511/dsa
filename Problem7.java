import java.util.Scanner;

/* Sample 1:
Input:
n = 4
Expected output:
****
***
**
*
Sample 2
Input:
n= 6
******
*****
****
***
**
*     */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=n-i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

/* Sample 2 Input: n= 6
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6     */
public class Problem12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){

                System.out.print(count);
            }
            count++;
            System.out.println();
        }
    }
}

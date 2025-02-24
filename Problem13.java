import java.util.Scanner;

/* Testcase 1 :
Input :
325345
Expected output:6   */
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int count=String.valueOf(n).length();

        System.out.println(count);
    }
}

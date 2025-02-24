import java.util.Scanner;
/*reverse the number Input : 325345 Expected output:543523  */
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        while(n>0){
            int l=n%10;
            sum=sum*10+l;
            n/=10;
        }
        System.out.print(sum);
    }
}

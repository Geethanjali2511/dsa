/*Write a Program to find the smallest element in the Array
Input:  n = 5   1 3 5 7 8
Ouput Expected:1   Example 2 Input: n = 8   5 7 34 67 2 56 5 8     Output:2 */
public class Problem16 {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8};
        int a=arr[0];
        for(int i=1; i<arr.length;i++){
            if(!(a<arr[i])){
                a=arr[i];
            }
        }System.out.println(a);
    }
}

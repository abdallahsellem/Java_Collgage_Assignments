import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int arr[] ;
        arr =new int[n] ;
        int maximum_number =-10000000 ;
        for(int i=0 ;i<n ;i++)
        {
            arr[i]=sc.nextInt() ;
            maximum_number=Math.max(maximum_number, arr[i]) ;
        }
       System.out.println(maximum_number);

    }
}
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void quick(int begin, int end, int arr[]) {
        if (begin >= end) {
            return;
        }
        int seed = arr[(begin + end) / 2];
        int i = begin;
        int j = end;
        while (i < j) {
            if (arr[i] < seed) {
                i++;
            } else if (arr[j] > seed) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quick(begin, i - 1, arr);
        quick(i + 1, end, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[];
        arr = new int[n];
        for(int i=0 ;i<n ;i++)
        {
            arr[i]=sc.nextInt() ;
        }
        quick(0,n-1,arr);
        for(int i=0 ;i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
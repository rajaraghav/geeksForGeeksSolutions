package searching;


/*
*Given an unsorted array and a number n, find if there exists a pair of elements in the array whose difference is n.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Find_a_pair_with_the_given_difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]  = {5,6,72,1,2,9};
        int n = scanner.nextInt();
        Arrays.sort(arr);
        int aux[] = new int[arr.length];
        int j=0;
        for(int i:arr)
        {
            aux[j++]=i-n;
        }
        int m = Integer.MIN_VALUE;
        int an = Integer.MIN_VALUE;
        for(int i=0;i<aux.length;i++)
        {
             m = Arrays.binarySearch(arr,aux[i]);
             if(m>0)
             {
                 an=i;
                 break;
             }
        }
        System.out.println(arr[m]+" & "+arr[an]);
    }

}

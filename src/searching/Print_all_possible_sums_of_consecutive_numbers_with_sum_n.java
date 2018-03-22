package searching;

import java.util.Scanner;

/*
*Given a number N. The task is to print all possible sums of consecutive numbers that add up to N.
*https://www.geeksforgeeks.org/print-possible-sums-consecutive-numbers-sum-n/
 */
public class Print_all_possible_sums_of_consecutive_numbers_with_sum_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M=(int)Math.ceil(N/2);
        for(int i=0;i<=M;i++)
        {
            int sum = i;
            int arr[] = new int[M+2];
            int b=1;
            arr[0]=i;
            for(int j=i+1;j<=M+1;j++)
            {
                sum+=j;
                arr[b++]=j;
                if(sum==N)break;
            }
            if(sum==N)
            {
                for(int m=0;m<b;m++)
                {
                    System.out.print(arr[m]+" ");
                }
                System.out.println();
            }

        }

    }
}

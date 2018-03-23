package searching;

import java.util.Scanner;

/*
*Find k closest elements to a given value
*Given a sorted array arr[] and a value X, find the k closest elements to X in arr[].
*https://www.geeksforgeeks.org/find-k-closest-elements-given-value/
 */
public class Find_k_closest_elements_to_a_given_value {
    static void findsmallest(int a[],int lb,int ub,int b[])
    {
        int smallest,secondS,thirdS,fourthS;
        smallest=secondS=thirdS=fourthS=0;



        for(int i=lb;i<=ub;i++)
        {
        if(b[smallest]>b[i]&&b[i]!=0)
        {
            fourthS=thirdS;
            thirdS=secondS;
            secondS=smallest;
            smallest=i;
        }
        else if(b[secondS]>b[i]&&b[i]!=0)
        {
            fourthS = thirdS;
            thirdS = secondS;
            secondS = i;
        }
        else if(b[thirdS]>b[i]&&b[i]!=0)
        {
            fourthS = thirdS;
            thirdS = i;

        }
        else if(b[fourthS]>b[i]&&b[i]!=0)
        {
            fourthS=i;
        }
        }
        System.out.println(a[smallest]+" "+a[secondS]+" "+a[thirdS]+" "+a[fourthS]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56};
        int b[] = new int[a.length];
        int n = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            b[i]=Math.abs(n-a[i]);
        }
        int lb,ub;
        lb=ub=0;
        int l=0;
        int h=a.length;
        while(l!=h)
        {
            int mid = (l+h)/2;
            if(b[mid-1]>b[mid]&&b[mid+1]>b[mid])
            {

                if(b[mid]==0)
                {
                    lb=mid-4;
                    ub=mid+4;
                }
                else
                {lb=mid-3;ub=mid+3;}
                if(ub>a.length-1)
                {
                    ub=a.length-1;
                }
                break;
            }
            else if(b[mid]<b[mid-1])
            {
                l=mid;
            }
            else if(b[mid]>b[mid-1])
            {
                h=mid;
            }

        }
    findsmallest(a,lb,ub,b);
    }
}

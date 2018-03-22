package searching;

import java.util.Arrays;
import java.util.Scanner;

/*
*suppose you have a sorted array of infinite numbers, how would you search an element in the array?
* https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        Scanner sc =new Scanner(System.in);
        int i=0;
        System.out.println("enter key");
        int n=sc.nextInt();
        int l=0;
        int h=1;

        boolean found=false;
        while(!found)
        {
            if(arr[h]<n)
            {
                l=h;
                h*=2;
            }
            else
            {
                found=true;
                System.out.println(Arrays.binarySearch(arr,l,h,n));
            }

        }
    }
}

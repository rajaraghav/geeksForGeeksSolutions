package searching;

import java.util.Arrays;
/*
*Given an array of integers. Find a peak element in it. An array element is peak if it is NOT smaller than its neighbors. For corner elements, we need to consider only one neighbor. For example, for input array {5, 10, 20, 15}, 20 is the only peak element. For input array {10, 20, 15, 2, 23, 90, 67}, there are two peak elements: 20 and 90. Note that we need to return any one peak element.

Following corner cases give better idea about the problem.
1) If input array is sorted in strictly increasing order, the last element is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
2) If input array is sorted in strictly decreasing order, the first element is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
3) If all elements of input array are same, every element is a peak element.


 */
public class Find_a_peak_element {
    public static void main(String[] args) {
        int arr[] = {10, 11, 20, 19, 18};
        int l = 0;
        int h = arr.length - 1;
        int mid = 0;
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        else if (arr[l] > arr[l + 1]) {
            System.out.println(arr[l]);
        } else if (arr[h] > arr[h - 1]) {
            System.out.println(arr[h]);
        } else{
            while (l != h && l < h) {
                mid = (l + h) / 2;
                if (arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
                {
                    System.out.println(arr[mid]);
                    break;
                    }
                else if(arr[mid]<arr[mid+1])
                {
                    l = mid;
                }
                else
                    h=mid;
            }
        }
    }
    }


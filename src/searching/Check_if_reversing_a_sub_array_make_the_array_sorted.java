package searching;
/*
*Given an array of distinct n integers. The task is to check whether reversing one sub-array make the array sorted or not.
* If the array is already sorted or by reversing a subarray once make it sorted, print “Yes”, else print “No”.
* https://www.geeksforgeeks.org/check-reversing-sub-array-make-array-sorted/
 */
public class Check_if_reversing_a_sub_array_make_the_array_sorted {

    static int checkLowerIndex(int arr[])
    {
        int low = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<low)
            {
                return i-1;
            }
            low = arr[i];
        }
        return Integer.MIN_VALUE;
    }
    static int checkHigherIndex(int arr[],int low) {

        int lowVal = arr[low];
        for(int i=low;i<arr.length;i++)
        {
            if(arr[i]>lowVal)
            {
                return i-1;
            }
        }
        return arr.length-1;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,4,3,10,2};
        int low = checkLowerIndex(arr);
        int high = checkHigherIndex(arr,low);
        if(high == arr.length-1)
        {
            System.out.println("yes");
        }
        else {
            int lowerVal = arr[low];
            int i;
            for (i = high+1; i < arr.length; i++) {
                if(arr[i]<lowerVal)
                {
                    System.out.println("no");
                    break;
                }
            }
            if(i>=arr.length)
            {
                System.out.println("yes");
            }
        }
    }
}

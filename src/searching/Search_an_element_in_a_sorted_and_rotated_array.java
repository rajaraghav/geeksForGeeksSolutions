package searching;
/*
* problem statement
* An element in a sorted array can be found in O(log n) time via binary search.
* But suppose we rotate an ascending order sorted array at some pivot unknown to you beforehand.
* So for instance, 1 2 3 4 5 might become 3 4 5 1 2.
* Devise a way to find an element in the rotated array in O(log n) time.
*
* https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/
*/
public class Search_an_element_in_a_sorted_and_rotated_array {
    int binarySearch(int arr[],int low,int hi,int key)
    {
        if(low>hi) return -1;
        if(low==hi) return low;
        int mid = (low+hi)/2;

        if(arr[mid]==key)
        {
            return mid;
        }
        if(arr[mid]<key)
        {
            return binarySearch(arr,mid+1,hi,key);
        }
        else
        {
            return binarySearch(arr,low,mid-1,key);
        }
    }
    int findPivot(int a[],int l, int h)
    {
        if(l==h)
            return l;
        if(l>h)
            return -1;
        int mid = (l+h)/2;

        if(a[mid]>a[mid+1])
        {
            return mid;
        }
        if(a[mid]<a[mid-1])
        {
            return mid-1;
        }
        if(a[l]<a[mid])
        {
            return findPivot(a,mid+1,h);

        }
        return findPivot(a,l,mid-1);
    }

    public static void main(String[] args) {
        int a [] ={3,5,6,7,1,2};
        Search_an_element_in_a_sorted_and_rotated_array obj= new Search_an_element_in_a_sorted_and_rotated_array();
        int key = 6;
        int pivot = obj.findPivot(a,0,a.length-1);
        int index = obj.binarySearch(a,0,pivot,key);


        if(index==-1)
        {
            System.out.println("not found");
        }
        else if(a[index]==key)
        {
            System.out.println("found at"+index);
        }
        else
        {
            index = obj.findPivot(a,pivot+1,a.length-1);
            if(index==-1)
            {
                System.out.println("not found");
            }
            else if(a[index]==key)
            {
                System.out.println("found at"+index);
            }
            else
            System.out.println("not found");
        }

    }
}

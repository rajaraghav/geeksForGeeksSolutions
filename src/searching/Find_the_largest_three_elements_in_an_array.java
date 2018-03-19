package searching;
/*
*Find the largest three elements in an array
*Given an array with all distinct elements, find the largest three elements. Expected time complexity is O(n) and extra space is O(1).
*https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
 */
public class Find_the_largest_three_elements_in_an_array {
    public static void main(String[] args) {
        int arr[] = {5,4,2,1,3,8,9};
        int l,m,s;
        l=m=s=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>l) {
                s = m;
                m = l;
                l = arr[i];
            }
        }
        System.out.println("large "+l);
        System.out.println("mid "+m);
        System.out.println("third large "+s);
    }
}

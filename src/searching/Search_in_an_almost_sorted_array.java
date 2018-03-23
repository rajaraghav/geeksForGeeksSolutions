package searching;

public class Search_in_an_almost_sorted_array {
    static int modifiedBinary(int a[],int key)
    {
        int l=0;
        int h=a.length;
        int index=Integer.MIN_VALUE;
        while(l!=h)
        {
            int mid = (l+h)/2;
            int virtualMid = mid;
            if(mid!=0&&a[mid-1]>a[mid])
            {
                virtualMid--;
            }
            else if(mid!=0&&a[mid+1]<a[mid])
            {
                virtualMid++;
            }
            if(a[mid]==key)
            {
                index = mid;
                break;
            }
            else if(a[mid]>key)
            {
                mid=virtualMid;
                h=mid;
            }
            else
            {mid=virtualMid;
                l=mid;}
        }
        return index;
    }
    public static void main(String[] args) {
        int a[] = {10,3,40,20,50,80,70};

        System.out.println(modifiedBinary(a,50));
    }
}

package searching;

/*
*Find the element before which all the elements are smaller than it, and after which all are greater
*Given an array, find an element before which all elements are smaller than it, and after which all are greater than it.
*Return index of the element if there is such an element, otherwise return -1.
*
*/

public class element_before_which_all_the_elements_are_smaller_than_it_and_after_which_all_are_greater {
    public static void main(String[] args) {
        int a[] = {5, 1, 4, 3, 2, 8, 10, 11, 9};
        int l[] = new int[a.length];
        int r[] = new int[a.length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            l[i]=max;
        }
        max = Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            r[i]=max;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:l)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i:r)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        int ans=-1;
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]>l[i-1]&&a[i]<r[i+1])
            {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}

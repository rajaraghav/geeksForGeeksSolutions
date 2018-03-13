package searching;

/*
*You are given a list of n-1 integers and these integers are in the range of 1 to n.
* There are no duplicates in list. One of the integers is missing in the list.
* Write an efficient code to find the missing integer.
*
* https://www.geeksforgeeks.org/find-the-missing-number/
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_the_Missing_Number {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[9];
        int n = a.length+1;
        int totalSum = n/2*(n+1);
        System.out.println(totalSum);
        for(int i=0;i<a.length;i++)
        {
            a[i]= Integer.parseInt(bufferedReader.readLine());
            totalSum-=a[i];
            System.out.println("i"+i);
        }
        System.out.println("missing number is- "+totalSum);
    }
}

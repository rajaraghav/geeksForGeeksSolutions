package searching;

import java.util.HashMap;
import java.util.Map;

public class Check_if_there_exist_two_elements_in_an_array_whose_sum_is_equal_to_the_sum_of_rest_of_the_array {
    public static void main(String[] args) {
        int arr[] = {2,11,5,1,4,7};
        Map<Integer,Integer> map= new HashMap<>();
        int sum = 0;
        for(int i:arr)
        {
            sum+=i;
        }

        if(sum%2!=0)
        {
            System.out.println("no elements exist");
        }
        else
        {
            boolean found=false;
            sum = sum/2;
            for(int i:arr)
            {
                map.put(i,0);
            }
            int num=0;
            for(int i:arr)
            {
                if(map.containsKey(sum-i))
                {
                    found=true;
                    num = i;
                    break;
                }
            }
            if(found)
            {
                System.out.println(num+" "+(sum-num));
            }
        }
    }
}

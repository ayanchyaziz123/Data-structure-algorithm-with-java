import java.util.HashMap;
import java.util.Map;

public class LC_1 {
    public  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int comp = target - nums[i];
            if(map.containsKey(comp))
            {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    public static void main(String[] args)
    {
        LC_1 obj = new LC_1();
        int[] arr = {2,7,11,15};
        int tar = 9;
        int[] arr2 = obj.twoSum(arr, tar);
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i] + " ");
        }
        
    }
}

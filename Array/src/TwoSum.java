import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // if an array was sorted, then use two pointer approach
    public int [] twoSum (int [] nums ,int target){
        int n=nums.length;
        int left =0, right=n-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                return new int[]{left,right};
            }else if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }

//    public int[] twoSum(int[] nums, int target){
//        int n= nums.length;
//        Map<Integer, Integer> mp = new HashMap<>();
//
//        for(int i=0;i<n;i++){
//            int remaining = target - nums[i];
//
//            if(mp.containsKey(remaining)){
//                return new int[] {mp.get(remaining),i};
//            }
//            mp.put(nums[i],i);
//        }
//        return new int[]{};
//    }
    public static void main(String[] args) {

        TwoSum sum = new TwoSum();
        int[] nums= {2,7,11,15,17};
        int target =22;

        int[] result = sum.twoSum(nums,target);

        if(result.length == 2){
            System.out.println("Indices: "+ result[0]+","+result[1]);
        }else{
            System.out.println("No indices found");
        }
    }
}

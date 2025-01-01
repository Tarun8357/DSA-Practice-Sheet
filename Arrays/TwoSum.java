public class TwoSum {
    public static int[] twoSum(int[] nums, int target) { 
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            } 

        }
         
        return null;
    }
    public static void main(String[] args) {
        int nums [] = {2,6,5,4,7,4,5};
        int target = 11;
        int[] twoSum = twoSum(nums, target);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
    
}

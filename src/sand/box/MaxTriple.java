package src.sand.box;

public class MaxTriple{
    private static int maxT(int[] nums){
        return nums[0] > (nums[nums.length/2]>nums[nums.length-1]?nums[nums.length/2]:nums[nums.length-1])?nums[0]:(nums[nums.length/2]>nums[nums.length-1]?nums[nums.length/2]:nums[nums.length-1]);
    }
    public static void main(String[] args){
        int[] nums = {3,2,1};
        System.out.println(maxT(nums));
    }
}
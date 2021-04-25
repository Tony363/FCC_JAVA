// package src.sand.box;
import java.util.Arrays;
public class fillArrayGreatest{
    public static void main(String[] args){
        int[] nums = {1,2,3};
        if (nums[0]>nums[nums.length-1]){
            Arrays.fill(nums,nums[0]);
        }else{
            Arrays.fill(nums,nums[nums.length-1]);
        }
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
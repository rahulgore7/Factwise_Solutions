public class Solution {
    public static void main(String[] args) {
        int nums[]={1,3,5,6};
        System.out.println(searchInsert(nums, 2));
    }
    public static int searchInsert(int[] nums, int target){
        int left=0;
        int right=nums.length;
        while(left<right){
            int mid=(left+right)>>>1;
            if(nums[mid]>=target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}

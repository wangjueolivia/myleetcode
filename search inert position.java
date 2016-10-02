public class Solution {
    public int searchInsert(int[] nums, int target) {
       int res=0,lo=0,hi=nums.length-1;
       while(lo<=hi){
           int mid=(lo+hi)/2;
           if(nums[mid]<target){
               lo=mid+1;
           }
           else{
               hi=mid-1;
           }
       }
       return lo;
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, target);
        int last = lastOccurence(nums, target);
        if(nums.length==0 || last<first){
            first = -1;
            last = -1;
        }
        int[] result = {first, last};
        return result;
    }

    public int firstOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return start;
    }
    public int lastOccurence(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
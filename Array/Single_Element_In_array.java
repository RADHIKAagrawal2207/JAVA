public class Single_Element_In_array {
    class Solution {
    public int singleNonDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
           ans^=nums[i];
        }
        return ans;
    }
}
}


// input - 1 1 2 3 3 4 4 5 5
//output - 2
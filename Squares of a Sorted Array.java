class Solution {
    public int[] sortedSquares(int[] nums) {
        int le=nums.length;
        int[] a=new int[le];
        int sq=0;
        for(int i=0;i<le;i++){
            sq=nums[i]*nums[i];
            nums[i]=sq;
        }
        int l=0;
        int r=le-1;
        int i=le-1;
        while(l<=r){
            if(nums[l]<nums[r]){
                a[i]=nums[r];
                i--;
                r--;
            }else{
                a[i]=nums[l];
                l++;
                i--;
            }
        }
        return a;
    }
}

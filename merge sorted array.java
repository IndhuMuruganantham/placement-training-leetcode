class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;
        int temp=0;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                temp=nums1[k];
                nums1[k]=nums1[i];
                nums1[i]=temp;
                i--;
                k--;
            }else{
                temp=nums1[k];
                nums1[k]=nums2[j];
                nums2[j]=temp;
                j--;
                k--;
            }
        }
        System.out.println(nums1);
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            result[k++] =(nums1[i]< nums2[j])?nums1[i++]:nums2[j++];
        }
        while(i<m){
            result[k++]=nums1[i++];
        }
        while(j<n){
            result[k++]=nums2[j++];
        }
        System.arraycopy(result,0,nums1,0,m+n);
    }
}
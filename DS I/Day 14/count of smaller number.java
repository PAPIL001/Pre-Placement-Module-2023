class Solution {
    public int[] searchRange(int[] a, int k) {
        
        // First Position
        int p=0, q=a.length-1;
        while(p<=q) {
            int m=(p+q)/2;
            if(a[m]>=k) q=m-1;
            else if(a[m]<k) p=m+1;
        }
        int l = q+1<a.length && a[q+1]==k ? q+1 : -1;
        
        // Last Position
        p=0; q=a.length-1;
        while(p<=q) {
            int m=(p+q)/2;
            if(a[m]>k) q=m-1;
            else if(a[m]<=k) p=m+1;
        }
        int r = p-1>=0 && a[p-1]==k ? p-1 : -1;

        return new int[]{l, r};
    }
}
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         int start=1;
    int end=n;
    while(start<end){
        int mid=start+(end-start)/2;
        boolean res=isBadVersion(mid);
        if(res==true){
            end=mid;
        }
        else{
            start=mid+1;
        }
    }
    return start;
    }
}
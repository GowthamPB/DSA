class Solution {
    public int[] searchRange(int[] v, int x) {
        int[] ans=new int[2];
            
        ans[0]=bins(v,x,true);
        ans[1]=bins(v,x,false);
        
        return ans;
    }
    public static int bins(int v[],int x,boolean val){
       int mid;
       int ans=-1;
       int start=0,end=v.length-1;  
       while(start<=end){
           mid=start+(end-start)/2;
           if(x<v[mid]){
               end=mid-1;
           }else if(x>v[mid]){
               start=mid+1;
           }else{
               ans=mid;
               if(val){
                   end=mid-1;
               }else{
                   start=mid+1;
               }
               
           }
       }
       return ans;
    }
}
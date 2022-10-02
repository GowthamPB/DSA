class Solution {
    public int[] searchRange(int[] v, int x) {
        int[] ans=new int[2];
        int start=0,end=v.length-1;        
        ans[0]=bins(v,x,start,end,true);
        ans[1]=bins(v,x,start,end,false);
        
        return ans;
    }
    public static int bins(int v[],int x,int start,int end,boolean val){
       int mid;
       int ans=-1;
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
                   bins(v,x,start,end,val);
               }else{
                   start=mid+1;
                   bins(v,x,start,end,val);
               }
               
           }
       }
       return ans;
    }
}
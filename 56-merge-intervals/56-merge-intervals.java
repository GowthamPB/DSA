class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    List<int[]> list = new ArrayList<>();
    
    int[] prev = intervals[0];
    
    for(int i=1;i<intervals.length;i++){
        
        int[] curr = intervals[i];
        if(prev[1] >= curr[0]){
            prev[1] = Math.max(prev[1],curr[1]);
            //i++;
        }else{
            list.add(prev);
            prev = curr;
            
        }
        //System.out.println(list);
    }
     list.add(prev);
    
    return list.toArray(new int[list.size()][]);
    
}
}
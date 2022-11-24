class Solution {
    public String removeOuterParentheses(String s) {
        int count=0,start=0;
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
            if(count==0){
                result+=s.substring(start+1,i);
                start=i+1;
            }
        }
        return result;
    }
}
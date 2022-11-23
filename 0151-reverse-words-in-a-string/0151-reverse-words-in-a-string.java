class Solution {
    public String reverseWords(String s) {
	StringBuffer ans = new StringBuffer();   	
    String[] words = s.trim().split(" +");
    for (int i = words.length - 1; i >= 0; i--) {
    	ans.append(words[i]).append(" ");
    }
    return ans.toString().trim();
    }
}

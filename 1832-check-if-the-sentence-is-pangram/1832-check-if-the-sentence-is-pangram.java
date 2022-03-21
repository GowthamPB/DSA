class Solution {
    public boolean checkIfPangram(String sentence) {
        int ans[]=new int[sentence.length()];
        if(sentence.length()<26)
            return false;
        else
        {
            for(int i=0;i<sentence.length();i++)
            {
                char ch = sentence.charAt(i);
                int c = (int) ch;
                int index = c - 'a';
                ans[index]++;
                
            }
            for(int i=0;i<26;i++)
            {
                if(ans[i]==0)
                    return false;
                
            }
            
        }
        return true;
    }
    }
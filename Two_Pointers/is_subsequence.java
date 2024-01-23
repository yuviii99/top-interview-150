class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int s_counter = 0;
        int t_counter = 0;
        while(s_counter < s.length() && t_counter < t.length()){
            if(s.charAt(s_counter) == t.charAt(t_counter)){
                count++;
                s_counter++;
                t_counter++;
            }
            else{
                t_counter++;
            }
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
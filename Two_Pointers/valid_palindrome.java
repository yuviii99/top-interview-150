class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if(s.length() == 0){
            return true;
        }
        int ptr1 = 0;
        int ptr2 = s.length()-1;
        while(ptr1<ptr2){

            if(s.charAt(ptr1) == s.charAt(ptr2)){
                ptr1++;
                ptr2--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
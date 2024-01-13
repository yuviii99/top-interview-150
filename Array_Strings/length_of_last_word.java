class Solution {
    public int lengthOfLastWord(String s) {
        String[] wordBag = s.split(" ");
        return wordBag[wordBag.length-1].length();
    }
}
package Beginner;
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String str1 = sb.toString();
        
        if (str.equals(str1)){
            return true;
        }
        return false;

    }
}
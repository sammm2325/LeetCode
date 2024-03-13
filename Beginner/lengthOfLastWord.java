package Beginner;

class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String word = words[words.length-1];
        char[] characters = word.toCharArray();
        int count=0;
        for(int i=0; i<characters.length; i++){
            count++;

        }
        return count;
    }
}
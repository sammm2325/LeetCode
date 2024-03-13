package Beginner;

import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
      Arrays.sort(capacity);

      int total =0;
      int secondaryCount =0;
      int count =0;

      for(int i=0; i<apple.length; i++){
          total+=apple[i];
      }
      for(int i=capacity.length-1; i>=0; i--){
          secondaryCount+=capacity[i];
          count++;
          if(secondaryCount>= total){
              return count;
          }

      }
      return count;

    }
}
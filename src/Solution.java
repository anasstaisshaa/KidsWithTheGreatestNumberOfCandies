import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max)
                max = candies[i];
        }
        for(int i = 0; i < candies.length; i++){
            answer.add(candies[i] + extraCandies >= max);
        }
        return answer;
    }
}

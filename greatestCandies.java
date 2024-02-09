import java.util.*;
class greatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int greatest =0;
        for(int i =0; i<candies.length; i++){
            greatest = Math.max(candies[i], greatest);
        }

        for(int i=0; i<candies.length; i++){
            int sum = candies[i]+extraCandies;
            if(sum>=greatest){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        
       return list; 
    }
    public static void main(String [] args){
        int[] candies = {2,4,1,3,4};
        int extraCandies = 4;
        kidsWithCandies(candies, extraCandies);
    }
}


//Kids with greatest number of candies problem 1431(leetcode)
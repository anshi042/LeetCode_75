import java.util.*;
class mergeStringChAlternately {
    public static String mergeAlternately(String word1, String word2) {
          StringBuilder sb = new StringBuilder();
          int i =0;
          while(i<word1.length()|| i<word2.length()){
              if(i<word1.length()){
                  sb.append(word1.charAt(i));
              }

              if(i<word2.length()){
                  sb.append(word2.charAt(i));
              }

              i++;
          }

         return sb.toString();
        }
      public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          String word1 = sc.next();
          String word2 = sc.next();
          System.out.println(mergeAlternately(word1, word2));
      }  
        
    
}
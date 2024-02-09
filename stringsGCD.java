import java.util.*;
class stringsGCD {
    public static int gcd(int a, int b){
           return b == 0 ? a : gcd(b, a%b);
       
       }   
    public static String gcdOfStrings(String str1, String str2) {
       if(!(str1 + str2).equals(str2 + str1)){
           return "";
       }
       int gcd = gcd(str1.length(), str2.length());
       return str1.substring(0, gcd);
       
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(gcdOfStrings(str1, str2));
    }
}
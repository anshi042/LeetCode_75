import java.util.StringTokenizer;
class reversedString {
    //Return a string of the words in reverse order concatenated by a single space.

    public static String reverseWords(String s) {
        StringTokenizer str = new StringTokenizer(s, " ");

        int n = str.countTokens();

        String[] stringArray = new String[n];

        for(int i=0; i<n; i++){
            stringArray[i] = str.nextToken();
        }

        //Reverse the order of words
        for(int i = 0; i < n/2; i++){
            //swap
            String temp = stringArray[i];
            stringArray[i] = stringArray[n-1-i];
            stringArray[n-1-i] = temp;
        }

        //Concate the reversed words with single space 
        StringBuilder reversedStr = new StringBuilder();
        for(int i =0; i<n; i++){
            reversedStr.append(stringArray[i]);
            if(i < n-1){
                reversedStr.append(" ");
            }
        }

        return reversedStr.toString();
       
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hey! here we are learning data structures"));
    }
}
class Solution{
    public String mergeAlternately(String word1, String word2) {
    StringBuilder s=new StringBuilder();
    for(int i=0;(i<word1.length())||(i<word2.length());i++){
        if(i<word1.length()){
         s.append(word1.charAt(i));
        }
        if(i<word2.length()){
         s.append(word2.charAt(i));
        }
    }
    return s.toString();
    }
}
//Another Efficient Method

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         int len1 = word1.length();  //It takes length in len variable
//         int len2 = word2.length();

//         int i=0,j=0;
        
//         char[] data = new char[len1+len2]; //the size of char array is taken by addition operator

//         while(i<len1 && j < len2) {      //This Loop will take each character from alternate string and set to the index of char array.
//             data[i+j] = word1.charAt(i);    
//             i++;
//             data[i+j] = word2.charAt(j);
//             j++;
//         }

//         while(i<len1) {                    //This loops will append every char which will remain.
//             data[i+j] = word1.charAt(i);
//             i++;
//         }

//         while(j < len2) {
//             data[i+j] = word2.charAt(j);
//             j++;
//         }

//         return new String(data);
//     }
// }
public class LeetCode1768 {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println("String: "+s.mergeAlternately("abc","pqrs"));
    }
}

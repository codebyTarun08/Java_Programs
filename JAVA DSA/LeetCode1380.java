import java.util.*;
// class Solution{
//     public List<Integer> luckyNumbers (int[][] matrix) {
//         List<Integer> l=new ArrayList<>();     
//         List<Integer> lucky=new ArrayList<>();     
//         for(int i=0;i<matrix.length;i++){
//            int[] a=matrix[i];
//            Integer min=Integer.MAX_VALUE;
//            for(int j=0;j<a.length;j++){
//             if(a[j]<min){
//                 min=a[j];
//             }
//            }
//            l.add(min);
//         }
//         Integer max=l.getFirst();
//         for(int k=0;k<l.size();k++){
//             if(l.get(k)>max){
//                 max=l.get(k);
//             }
//         }
//         lucky.add(max);
//         System.out.println("lucky");
//         return lucky;
//     }
// }
// class Solution1 {
//     public List<Integer> luckyNumbers(int[][] matrix) {
//         List<Integer> lucky = new ArrayList<>();

//         for (int i = 0; i < matrix.length; i++) {
//             int[] row = matrix[i];
//             int min = Integer.MAX_VALUE; // Initialize min to a large value
//             for (int j = 0; j < row.length; j++) {
//                 min = Math.min(min, row[j]); // Update min if a smaller value is found
//             }
//             lucky.add(min);
//         }

//         for (int k = 0; k < matrix[0].length; k++) {
//             int max = matrix[0][k]; // Initialize max to the first element
//             for (int i = 1; i < matrix.length; i++) {
//                 max = Math.max(max, matrix[i][k]); // Update max if a larger value is found
//             }
//             if (lucky.contains(max)) {
//                 // Only add to the result if it's both minimum in its row and maximum in its column
//                 lucky.add(max);
//             }
//         }

//         return lucky;
//     }
// }

/* [[3,7,8],[9,11,13],[15,16,17]]
 * [[3,6],[7,1],[5,2],[4,8]]
*/
// class Solution{
//     public List<Integer> luckyNumbers (int[][] matrix) {
//            List<Integer> l=new ArrayList<>();
//            for(int i=0,c=0,r=0;i<matrix.length;i++,c++,r++){
//             Integer min=Integer.MAX_VALUE;
//             for(int j=0;j<matrix.length;j++){
//                 if(matrix[j][c]<min){
//                 min=matrix[j][c];
//               }
//             }
//             Integer max=Integer.MIN_VALUE;
//             for(int k=0;k<matrix.length;k++){
//                 if(matrix[r][k]>max){
//                     max=matrix[r][k];
//                 }
//             }
//             if(min==max){
//                 l.add(max);
//             }
//            }
//         return l;
//     }
// }
class Solution{
    public List<Integer> luckyNumbers (int[][] matrix) {
           List<Integer> mn=new ArrayList<>();
           List<Integer> mx=new ArrayList<>();
        //    List<Integer> lucky=new ArrayList<>(mn);
           System.out.println("length: "+matrix.length);
           for(int i=0,c=0;i<matrix.length;i++,c++){
            Integer min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[c][j]<min){
                min=matrix[c][j];
              }
              System.out.println("j: "+j);
            }
            mn.add(min);
           }
           System.out.println(mn);
           for(int col=0,r=0;col<matrix[0].length;col++,r++){
            Integer max=Integer.MIN_VALUE;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][r]>max){
                    max=matrix[k][r];
                }
            }
            mx.add(max);
           }
           System.out.println(mx);
           mn.retainAll(mx);
        return mn;
    }
}
public class LeetCode1380 {
    public static void main(String[] args) {
        Solution s=new Solution();
       int[][] m1= {{3,7,8},{9,11,13},{15,16,17}};
       int[][] m2= {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
       int[][] m3= {{3,6},{7,1},{5,2},{4,8}};
       System.out.println(s.luckyNumbers(m1));
       System.out.println(s.luckyNumbers(m2));
       System.out.println(s.luckyNumbers(m3));
    }
}

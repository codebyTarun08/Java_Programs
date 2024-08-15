class Solution{
    public int[][] restoreMatrix(int[] rowSum, int[] colSum){
        int row=rowSum.length;
        int col=colSum.length;
        int[][] orgMatrix=new int[row][col];
        int min= Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            if(rowSum[i]<min){
                min=rowSum[i];
            }
        }
        for(int j=0;j<orgMatrix.length;j++){
            for(int c=0;c<orgMatrix.length;c++){
                orgMatrix[j][c]=min;
                if(j==0 && c>0){
                    orgMatrix[j][c]=0;
                }
                if(j>0 && c==0){
                    orgMatrix[j][c]=colSum[0]-min;
                }
                if(j>0 && c>0){
                    orgMatrix[j][c]=rowSum[1]-orgMatrix[1][0];
                }
            }
        }     
        return orgMatrix;
    }
}
class LeetCode1605{
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] rowsum={3,8};
        int[] colsum={4,7};
        s.restoreMatrix(rowsum,colsum);
    }
}
// Output: [[3,0],
//          [1,7]]
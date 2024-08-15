import java.util.*;
class Solution{
    public String[] sortPeople(String[] names, Integer[] heights) {
        HashMap<Integer,String> m=new HashMap<>();
        for(int i=0;i<names.length;i++){
            m.put(heights[i], names[i]);
        }
        String[] res= new String[heights.length];
        // int index=0;
        Arrays.sort(heights,Collections.reverseOrder());
        // for(int k=heights.length-1;k>=0;k--){
        //     res[index]=m.get(heights[k]);
        //     index++;
        // }
        for(int k=0;k<heights.length;k++){
            res[k]=m.get(heights[k]);          
        }
        for (int x : heights) {
            System.out.print(x+",");
        }
        for (String x : res) {
            System.out.print(x+",");
        }
        return res;
    }
}
public class LeetCode2180 {
    public static void main(String[] args) {
        Solution s=new Solution();
        String[] names={"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        Integer[] heights={17233,32521,14087,42738,46669,65662,43204,8224};
        // String[] names={"Mary","John","amma"};
        // int[] heights={180,165,170};
        String[] str=s.sortPeople(names, heights);
        System.out.println(str);
    }
}

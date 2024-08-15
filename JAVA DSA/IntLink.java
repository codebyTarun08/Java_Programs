class ListNode{
    public int val;
    public ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
public class IntLink{
    ListNode headA;
    ListNode headB;
    
    class IntersectionLL {
        public static void main(String[] args) {
            Solution s=new Solution();
            IntLink l=new IntLink();
            ListNode l1=new ListNode(4);
            ListNode l2=new ListNode(1);

            l1.next=
        }
    }
}
 
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        while(p.val!=q.val){
            int a1=0;
            int b1=0;
                p=p.next;
                a1++;

     
               q=q.next;
               b1++;
      
        }
        if(p.val==q.val)
          return p;
        else
          return null;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> node = new HashSet<>();
        
        if(head == null) return false;
        
        while(head != null){
            if(node.contains(head)) return true;
            
            node.add(head);
            head = head.next;
        }
        
        return false;
    }
}
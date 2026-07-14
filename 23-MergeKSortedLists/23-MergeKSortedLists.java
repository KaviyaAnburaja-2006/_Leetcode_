// Last updated: 7/14/2026, 2:14:28 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer>nums=new ArrayList<>();
        for(ListNode list:lists){
            while(list!=null){
            nums.add(list.val);
            list=list.next;
            }
        }
        Collections.sort(nums);
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int num:nums){
            current.next=new ListNode(num);
            current=current.next;
        }
        return dummy.next;  
    }
}
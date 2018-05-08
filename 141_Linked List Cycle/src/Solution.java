/**
 * 思路：
 * 使用两个指针，一个跑得快，一个跑得慢，如果有环，则必然会相遇
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode p = head;    // 慢指针
        ListNode q = head;    // 快指针

        while (p != null && q != null && q.next != null) { // 边界条件是出现空指针，就返回false
            p = p.next;
            q = q.next.next;

            if (q == p) {
                return true;
            }
        }

        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
// Title: Linked List Cycle
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/linked-list-cycle/

        var fast = head?.next?.next

        if(head == null || head.next == null) return false
        var slow = head.next

        while(fast != null){
        }
            if(fast == slow) return true
        return false
    fun hasCycle(head: ListNode?): Boolean {
class Solution {

 */
    }
            slow = slow?.next
            fast = fast?.next?.next
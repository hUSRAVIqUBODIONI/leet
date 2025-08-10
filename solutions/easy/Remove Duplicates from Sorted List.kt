// Title: Remove Duplicates from Sorted List
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var curr = head

        while (curr?.next != null) {
            var next = curr.next
            
            while (curr.`val` == next?.`val`) {
                next = next.next
            }
            curr.next = next
            curr = next
        }

        return head
    }
}

// Title: Middle of the Linked List
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/middle-of-the-linked-list/

 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head 

        while(fast?.next != null){
            slow = slow?.next
        }
            fast = fast?.next?.next

        return slow
    }
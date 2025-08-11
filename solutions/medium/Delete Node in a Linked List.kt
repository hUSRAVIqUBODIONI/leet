// Title: Delete Node in a Linked List
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/delete-node-in-a-linked-list/

 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun deleteNode(node: ListNode?) {
        val next = node!!.next
        node.`val` = next.`val`
        node?.next = next?.next
        
    }
}
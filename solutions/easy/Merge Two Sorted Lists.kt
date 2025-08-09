// Title: Merge Two Sorted Lists
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1


        var l1 = list1
        var l2 = list2

        val dummy : ListNode? = ListNode(-1)
        var current : ListNode? = dummy


        while(l1 != null && l2 != null){

            if(l1.`val` < l2.`val`){
                current?.next = l1
                l1 = l1?.next
            }
            else{
                current?.next = l2
                l2 = l2?.next
            }

            current = current?.next

        }

        while(l1 == null && l2 != null){
            current?.next = l2
            l2 = l2?.next
            current = current?.next
        }

        while(l1 != null && l2 == null){
            current?.next = l1
            l1 = l1?.next
            current = current?.next
        }


        return dummy?.next
    }
}

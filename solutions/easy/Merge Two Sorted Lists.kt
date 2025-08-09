// Title: Merge Two Sorted Lists
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/merge-two-sorted-lists/

        }

        while(l1 != null && l2 == null){
            current?.next = l1
            l1 = l1?.next
            current = current?.next
        }


        return dummy?.next
    }
}
// Title: Remove Element
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/remove-element/

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var result = 0

        for (j in 0 until nums.size){
            if(nums[j] != `val`){
        }
                nums[result] = nums[j]
            }
    }
                result++
        return result
}
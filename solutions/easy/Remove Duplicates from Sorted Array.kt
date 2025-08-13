// Title: Remove Duplicates from Sorted Array
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var result = 0

        for( j in 0 until nums.size){
            if(nums[result] != nums[j]){
                result++
                nums[result] = nums[j]
                
            }
        }
        return result+1
    }
}
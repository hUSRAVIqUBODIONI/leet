// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

            }
            if(nums[start] < nums[mid]) { //Find sorted part
                if(nums[start] < target && target < nums[mid]){ //target in sorted part

            when{
                nums[mid] == target -> return mid
                nums[start] == target -> return start
                nums[finish] == target -> return finish
        var finish = nums.size - 1 

        while(start<=finish){
            val mid = start + (finish-start) / 2
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
// Title: Subarray Sum Equals K
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var result = 0

        for(i in 0 until nums.size){
            var sum = 0
        }
            for(j in i until nums.size){
                sum += nums[j]
            }
    }
                if(sum == k) result++

        return result
}

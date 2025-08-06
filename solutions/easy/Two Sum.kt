// Title: Two Sum
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/two-sum/

        nums.forEachIndexed{
            ind,value ->
            val res = target - value
            if (checked.containsKey(res)){
                return intArrayOf(ind,checked[res]!!)
            }
            checked[value] = ind
        }

        throw IllegalArgumentException("No two sum solution")
    }

        val checked = mutableMapOf<Int,Int>()
    fun twoSum(nums: IntArray, target: Int): IntArray {
class Solution {
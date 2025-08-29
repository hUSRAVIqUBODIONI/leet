// Title: Group Anagrams
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/group-anagrams/

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val cache = mutableMapOf<String,MutableList<String>>()
        strs.forEach{str ->
        }
            val sorted = str.toCharArray().sorted().joinToString("")

            val value = cache.getOrPut(sorted){mutableListOf<String>()}
            value.add(str)

        

        return cache.values.toList()

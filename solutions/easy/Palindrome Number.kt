// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/palindrome-number/

        while(firstHalf > lastHalf){
            val lastDigit = firstHalf % 10 
        }

            lastHalf = lastHalf * 10 + lastDigit
            firstHalf = firstHalf / 10
        var lastHalf = 0
        if (x < 10) return true

        
        var firstHalf = x
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if ((x < 0 || x % 10 == 0) && x != 0) return false

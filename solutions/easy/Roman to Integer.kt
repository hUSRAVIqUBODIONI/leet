// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/roman-to-integer/

           class Solution {
                fun romanToInt(s: String): Int {
                    val romanNumbers = mapOf<Char,Int>(
                        'I' to 1, 
                        'V' to 5,
                        'X' to 10,
                        'L' to 50,
                        'C' to 100,
                        'D' to 500,
                        'M' to 1000
                    ) 
                    var prev = 0
                    var result = 0
                    for(it in s.length - 1 downTo 0){
                        val current = romanNumbers[s[it]]!!
                        
                        if (current < prev){
                            result -= current
                        }
                        else result += current
                        
                        prev = current
                    }
                    return result
                }
            }

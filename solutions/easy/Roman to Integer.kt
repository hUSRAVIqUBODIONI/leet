// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/roman-to-integer/

            val current = romanNumbers[it]!!
            
            if (current < prev){
                result -= current
            }
            else result += current
            
            prev = current
        }
        return result
    }
}
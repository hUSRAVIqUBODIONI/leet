// Title: Valid Parentheses
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/valid-parentheses/

        val stack = ArrayDeque<Char>()

        for(char in s){
            when{
                char in map.values -> stack.add(char)
                }
                char in map.keys -> {
            
                    if (stack.isEmpty()) return false
                }
                    if(map[char] != stack.last()) return false
                    stack.removeLast()
        }
        return stack.isEmpty()
    }
}


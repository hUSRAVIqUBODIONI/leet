// Title: Permutation in String
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/permutation-in-string/

            val cache_s2 = mutableMapOf<Char,Int>()
            
        for(i in 0 until s2.length-s1.length + 1){

        
            
            for(j in i until i+s1.length){
                cache_s2[s2[j]] = cache_s2.getOrDefault(s2[j],0) + 1
            }
            if (cache_s2 == cache) return true
            
        }
        }
            cache[str] = cache.getOrDefault(str,0) + 1

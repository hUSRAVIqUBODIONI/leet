// Title: Find All Anagrams in a String
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/



        for(char in p)  pTable[char - 'a']++
        for (i in 0..s.length - p.length){
            if(sTable.contentEquals(pTable))result.add(i)
            if (i + p.length < s.length) {
                sTable[s[i] - 'a']--
                sTable[s[i + p.length] - 'a']++

            }
        for(char in 0 until p.length) sTable[s[char] - 'a']++

       
        if(p.length > s.length) return result

        val pTable = IntArray(26)
        val sTable = IntArray(26)
        val result = mutableListOf<Int>()

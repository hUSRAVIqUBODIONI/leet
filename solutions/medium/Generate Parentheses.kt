// Title: Generate Parentheses
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/generate-parentheses/

        n:Int,
        result:MutableList<String>
    ) {
        if(open_br == n && close_br == n){
            result.add(current)
            return
        } 

        if(open_br < n) generate(current +"(",open_br+1,close_br,n,result)

        if(close_br < open_br) generate(current +")",open_br,close_br+1,n,result)

    }
}

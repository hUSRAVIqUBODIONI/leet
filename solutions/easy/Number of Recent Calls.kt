// Title: Number of Recent Calls
            // Difficulty: Easy
            // Language: Kotlin
            // Link: https://leetcode.com/problems/number-of-recent-calls/

class RecentCounter() {

    fun ping(t: Int): Int {
        calls.add(t)
    }

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()

    private val calls = mutableListOf<Int>()

        return calls.filter{
            it >= t-3000
        }.size
 * var param_1 = obj.ping(t)

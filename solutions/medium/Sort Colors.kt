// Title: Sort Colors
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/sort-colors/

             var read = write
            
            while(read < n){
                if(nums[read] == i){
                    val temp = nums[write]
                    nums[write] = nums[read]
                    nums[read] = temp
                    write++

                }
                read++
            }
        }
    }

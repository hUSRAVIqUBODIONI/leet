// Title: Longest Subarray of 1's After Deleting One Element
            // Difficulty: Medium
            // Language: Kotlin
            // Link: https://leetcode.com/problems/longest-subarray-of-1's-after-deleting-one-element/

·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌current_max·‌+=1
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌result·‌=·‌if·‌(result·‌<·‌current_max)·‌current_max·‌else·‌result
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌while(·‌nums[i]·‌!=·‌0){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}else·‌if·‌(nums[pos]·‌!=·‌1·‌&&·‌pos·‌!=·‌nums.size·‌-·‌1){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌find_zero·‌=·‌true
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌var·‌i·‌=·‌pos·‌+·‌1
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌current_max·‌+=1
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌result·‌=·‌if·‌(result·‌<·‌current_max)·‌current_max·‌else·‌result
·‌·‌·‌·‌·‌·‌·‌·‌var·‌current_max·‌=·‌0
·‌·‌·‌·‌·‌·‌·‌·‌for(·‌pos·‌in·‌0·‌until·‌nums.size){
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if(nums[pos]·‌==·‌1){
·‌·‌·‌·‌·‌·‌·‌·‌var·‌find_zero·‌=·‌false
·‌·‌·‌·‌·‌·‌·‌·‌var·‌result·‌=·‌0
class·‌Solution·‌{
·‌·‌·‌·‌fun·‌longestSubarray(nums:·‌IntArray):·‌Int·‌{

// Title: Maximum Depth of Binary Tree
            // Difficulty: Unknown
            // Language: Kotlin
            // Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null) return 0

        val l = maxDepth(root?.left)
        val r = maxDepth(root?.right)

        return 1 + maxOf(l,r)
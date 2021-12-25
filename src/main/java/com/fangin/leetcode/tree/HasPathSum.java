package com.fangin.leetcode.tree;

import com.fangin.leetcode.def.TreeNode;

/**
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * 输出：true
 * 解释：等于目标和的根节点到叶节点路径如上图所示。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class HasPathSum {
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        return hasPathSum(root, 0);
    }

    boolean help(TreeNode root, int p_sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val + p_sum == target;
        }
        p_sum += root.val;

        return help(root.left, p_sum) || help(root.right, p_sum);
    }

}

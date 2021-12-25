package com.fangin.leetcode.tree;

import com.fangin.leetcode.def.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class InOrder {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (true) {
            inorder2(root);
            return res;
        }
        return inorder1(root);
    }

    public List<Integer> inorder1(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        TreeNode p = root;
        Stack<TreeNode> s = new Stack<>();

        while (!s.empty() || p != null) {
            if (p != null) {
                s.push(p);
                p = p.left;
            } else {
                TreeNode tmp = s.pop();
                res.add(tmp.val);
                p = tmp.right;
            }
        }
        return res;

    }

    List<Integer> res = new LinkedList<>();

    public void inorder2(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder2(root.left);
        res.add(root.val);
        inorder2(root.right);
    }

}

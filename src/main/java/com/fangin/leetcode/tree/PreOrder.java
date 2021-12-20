package com.fangin.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetco给定de-cn.com/problems/binary-tree-preorder-traversal/
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历
 */
public class PreOrder {

    public static void main(String[] args) {

        //   0
        // 1  2
        //3 4
        TreeNode root = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;

        PreOrder slu = new PreOrder();
        System.out.println(slu.preOrder2(root));
        System.out.println(slu.preOrder1(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        return preOrder1(root);
    }

    List<Integer> res = new ArrayList<>();

    public List<Integer> preOrder1(TreeNode root) {
        if (root == null) {
            return res;
        } else {
            res.add(root.val);
            preOrder1(root.left);
            preOrder1(root.right);
        }
        return res;
    }


    public List<Integer> preOrder2(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.empty()) {
            if (p != null) {
                stack.push(p);
                res.add(p.val);
                p = p.left;
            } else {
                p = stack.pop();
                p = p.right;
            }
        }
        return res;
    }

}

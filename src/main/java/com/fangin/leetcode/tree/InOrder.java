package com.fangin.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历
 */
public class InOrder {

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

        InOrder slu = new InOrder();
        System.out.println(slu.inOrder2(root));
        System.out.println(slu.inOrder1(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        return inOrder1(root);
    }

    List<Integer> res = new ArrayList<>();

    public List<Integer> inOrder1(TreeNode root) {
        if (root == null) {
            return res;
        } else {
            inOrder1(root.left);
            res.add(root.val);
            inOrder1(root.right);
        }
        return res;
    }


    public List<Integer> inOrder2(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.empty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                res.add(p.val);
                p = p.right;
            }
        }

        return res;
    }

}

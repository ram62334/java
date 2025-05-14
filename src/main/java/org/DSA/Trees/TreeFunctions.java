package org.DSA.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeFunctions<T extends Comparable<T>> {
    TreeNode<T> root;

    public TreeFunctions() {
        this.root = null;
    }

    public void buildTree(){
        TreeNode node = new TreeNode(1);

        root=node;
        TreeNode two = new TreeNode(2);
        root.left=two;
        TreeNode three = new TreeNode(3);
        root.right=three;
        TreeNode four = new TreeNode(4);
        two.left=four;
        TreeNode five = new TreeNode(5);
        two.right=five;
        TreeNode six= new TreeNode(6);
        three.left=six;
        TreeNode seven = new TreeNode(7);
        three.right=seven;
    }

//    pre order traversal using recurssion
    public void preOrder(TreeNode root){
//        base case
        if (root == null){
            return;
        }

        System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
//    pre order using stack
    public void preOrderUsingStack(){
        Stack<TreeNode<T>> sf = new Stack<>();
        sf.push(root);
        while(!sf.isEmpty()){
            TreeNode<T> temp = sf.pop();
            System.out.print(temp.data);
            if (temp.right!=null){
                sf.push(temp.right);
            }
            if (temp.left!=null){
                sf.push(temp.left);
            }
        }
    }

    //    in order traversal using recurssion
    public void inOrder(TreeNode root){
//        base case
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

//    in order using stack
    public void inorderStack(TreeNode<T> root){
        Stack<TreeNode<T>> s = new Stack<>();

        TreeNode<T> temp = root;
        while(!s.isEmpty() ||temp!=null){
            if (temp!=null){
                s.push(temp);
                temp=temp.left;
            }
            else {
                temp= s.pop();
                System.out.print(temp.data);
                temp=temp.right;
            }
        }
    }
//    Post order using recurssion
    public void postorder(TreeNode<T> root){
        if (root==null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }
//    Post order using iterative
//    public void postOrderStack(TreeNode<T> root){
//        Stack<TreeNode<T>> s = new Stack<>();
//        TreeNode<T> temp = root;
//        while(!s.isEmpty()||temp!=null){
//            if (temp!=null) {
//                s.push(temp);
//                temp = temp.left;
//            }
//            else {
//                temp = s.pop();
//                System.out.print(temp.data);
//            }
//        }
//    }

//    Level order traversal
    public void levelOrder(TreeNode<T> root){
        if (root==null)
            return;

        Queue<TreeNode<T>> q = new LinkedList<>();
//        add root first
        q.offer(root);

        while (!q.isEmpty()){
            TreeNode<T> temp = q.poll();
            System.out.print(temp.data+" ");
            if (temp.left!=null)
                q.offer(temp.left);
            if (temp.right!=null)
                q.offer(temp.right);
        }
    }

//    Find greatest number
    public int findLargestValue(TreeNode<Integer> root){
        if (root==null)
            return Integer.MIN_VALUE;

        int result = (int) root.data;
        int left = findLargestValue(root.left);
        int right = findLargestValue(root.right);

        if (left>result)
            return left;
        if (right>result)
            return right;

        return result;
    }
//                                          Binary search tree
public void insert(T val) {
    root = binarySearch(root, val);
}

    public TreeNode<T> binarySearch(TreeNode<T> root, T val){
       if (root==null){
           return new TreeNode<>(val);
       }

       if (val.compareTo(root.data) < 0){
           root.left= binarySearch(root.left, val);
       }
       else root.right= binarySearch(root.right,val);
        return root;
    }

//    search key
    public TreeNode search(int key){
       return search((TreeNode<Integer>) this.root, key);
    }

    public TreeNode<Integer> search(TreeNode<Integer> root, Integer key){
        if (root == null||root.data==key)
            return root;

        if (key<root.data) {
          return  search(root.left,key);
        }
            else
             return   search(root.right,key);
        }
//        check validity of a binary tree
    public boolean check(TreeNode<Integer> root, Integer min, Integer max){
        if (root==null)
            return true;
        if (root.data<=min||root.data>=max)
            return false;

        boolean left=check(root.left, min, root.data);
        if (left){
            boolean right = check(root.right, root.data, max);
            return right;
        }
        return false;
        }
}

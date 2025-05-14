package org.DSA.Trees;

public class TreeMain {
    public static void main(String[] args) {
        TreeFunctions<Integer> tree = new TreeFunctions<>();
//        tree.buildTree();
//       tree.preOrder(tree.root);
//        System.out.println("");
//        tree.preOrderUsingStack();
//        System.out.println("");
//        tree.inOrder(tree.root);
//        System.out.println("");
//        tree.inorderStack(tree.root);
//        System.out.println("");
//        tree.postorder(tree.root);
//        System.out.println("\n"+"level order");
//        tree.levelOrder(tree.root);
//        System.out.println("\n"+"find largest number");
//        System.out.print(tree.findLargestValue(tree.root));
       tree.insert(7);
       tree.insert(5);
       tree.insert(10);
       tree.insert(4);
       tree.insert(19);
       tree.insert(1);
        tree.inOrder(tree.root);
//        search element
        tree.search(4);
//        check validity
        if (tree.check(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.print("binary tree is valid");
        else System.out.print("binary tree is not valid");
    }
}

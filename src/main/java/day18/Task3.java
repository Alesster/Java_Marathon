package day18;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);

        int[] nums = {23, 14, 22, 27, 11, 16, 24, 150, 5, 15, 18, 8};

        for (int num : nums) {
            insertNode(num, root);
        }

//        System.out.println(root);

        System.out.println("Unsorted output:");
        System.out.println(dfs_my(root));
        System.out.println("Sorted correct output:");
        dfs(root);

    }

    private static void dfs(Node root){
        if(root == null)
            return;

        dfs(root.getLeftChild());
        System.out.print(root.getValue() + " ");
        dfs(root.getRightChild());
    }

    // My unsorted output
    private static String dfs_my(Node root) {
        String strL = "", strR = "";

        if (root.getLeftChild() != null) {
            strL += root.getValue() + " " + dfs_my(root.getLeftChild());
        } else {
            strL += root.getValue();
        }

        if (root.getRightChild() != null) {
            strR += " " + dfs_my(root.getRightChild());
        }

        return strL + strR;

    }


    private static void insertNode(int value, Node root) {
        Node newNode = new Node(value);
        if (root == null)
            throw new IllegalArgumentException("Root Node must not be null");

        Node nextNode = root;
        Node currentNode;
        while (true) {
            currentNode = nextNode;
            if (value < nextNode.getValue()) {
                nextNode = nextNode.getLeftChild();
                if (nextNode == null) {
                    currentNode.setLeftChild(newNode);
                    return;
                }
            } else {
                nextNode = nextNode.getRightChild();
                if (nextNode == null) {
                    currentNode.setRightChild(newNode);
                    return;
                }
            }
        }
    }

}
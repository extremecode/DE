package com.de.code.basics.algorithms.trees;

public class RemoveNodes {

    Node<Integer> root;

    private Node removeNodesUtil(Node node,int level,int k){
        if(node ==null)
            return null;

        node.left = removeNodesUtil(node.left,level+1,k);
        node.right = removeNodesUtil(node.right,level+1,k);

        if(node.left == null && node.right == null && level<k)
            return null;

        return node;

    }

    public Node removeShortPathNodes(Node node, int k)
    {
        int pathLen = 0;
        return removeNodesUtil(node, 1, k);
    }

    void printInorder(Node node)
    {
        if (node != null)
        {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }
}

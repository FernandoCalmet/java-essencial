package Excercises.EDD.BST.ejercicio3;

public class Tree {
    public static void main(String args[]) {
        Tree tree = new Tree();
        Node root = new Node(10);
        System.out.println("SIMPLE ARBOL DE BUSQUEDA BINARIA");
        System.out.println("[Valor: " + root.value + "] -> insertado: " + root.value);
        tree.insert(root, 20);
        tree.insert(root, 21);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 16);
        tree.insert(root, 23);
        tree.insert(root, 2);
        System.out.println("------------------------");
        System.out.println("Valor minimo: " + Tree.findMin(root));
        System.out.println("Valor maximo: " + Tree.findMax(root));
    }

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("[Valor: " + value + "] -> " + node.value + " [L] -> insertado: " + value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("[Valor: " + value + "] -> " + node.value + " [R] -> insertado: " + value);
                node.right = new Node(value);
            }
        }
    }

    static int findMax(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.value;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    static int findMin(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return (current.value);
    }
}
package Excercises.EDA.BST.ejercicio4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class BinarySearchTree {
    private BSTNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Integer data) {
        root = insert(root, data);
    }

    public BSTNode insert(BSTNode node, int value) {
        BSTNode result = null;
        if (value < node.data) {
            if (node.left != null) {
                result = insert(node.left, value);
            } else {
                System.out.println("[Valor: " + value + "] -> " + node.data + " [L] -> insertado: " + value);
                result = node.left = new BSTNode(value);
            }
        } else if (value > node.data) {
            if (node.right != null) {
                result = insert(node.right, value);
            } else {
                System.out.println("[Valor: " + value + "] -> " + node.data + " [R] -> insertado: " + value);
                result = node.right = new BSTNode(value);
            }
        }

        return result;
    }

    public int findMin(BSTNode node) {
        BSTNode current = node;

        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    public int findMax(BSTNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res) {
            res = lres;
        }
        if (rres > res) {
            res = rres;
        }
        return res;
    }
}

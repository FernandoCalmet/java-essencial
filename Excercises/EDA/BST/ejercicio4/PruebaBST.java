package Excercises.EDA.BST.ejercicio4;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class PruebaBST {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BSTNode root = new BSTNode(10);
        System.out.println("SIMPLE ARBOL DE BUSQUEDA BINARIA");
        System.out.println("[Valor: " + root.data + "] -> insertado: " + root.data);
        tree.insert(root, 20);
        tree.insert(root, 21);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 16);
        tree.insert(root, 23);
        tree.insert(root, 2);
        System.out.println("------------------------");
        System.out.println("Valor minimo: " + tree.findMin(root));
        System.out.println("Valor maximo: " + tree.findMax(root));
    }
}

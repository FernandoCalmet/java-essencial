package Excercises.EDA.Cinema;

/**
 *
 * @author Fernando Calmet
 * @homepage https://github.com/FernandoCalmet
 */
public class LinearNode<E> {
    private LinearNode<E> next;
    private E element;

    public LinearNode() {
        this.next = null;
        this.element = null;
    }

    public LinearNode(E element) {
        this.next = null;
        this.element = element;
    }

    public LinearNode<E> getNext() {
        return this.next;
    }

    public void setNext(LinearNode<E> node) {
        this.next = node;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
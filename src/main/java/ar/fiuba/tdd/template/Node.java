package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 1/10/2016.
 */
public abstract class Node<T> implements Visitable {


    public abstract T getValue();

    public Node() {

    }

    public abstract int getSize();

    public abstract Node<T> iterateNodes(Node<T> previousNode);

    public abstract Node<T> getNextNode();

    public abstract void addNextNode(InternalNode<T> nextNode);


}

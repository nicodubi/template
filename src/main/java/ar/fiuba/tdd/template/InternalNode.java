package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 1/10/2016.
 */
public class InternalNode<T> extends Node<T> implements Visitable {

    protected T value;
    protected Node nextNode = new NullNode();

    public InternalNode(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public int getSize() {
        return 1 + nextNode.getSize();
    }

    @Override
    public Node<T> iterateNodes(Node<T> previousNode) {
        return nextNode.iterateNodes(this);
    }

    @Override
    public Node<T> getNextNode() {
        return nextNode;
    }

    @Override
    public void addNextNode(InternalNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public void setNextNode(Node<T> node) {
        nextNode = node;
    }


    @Override
    public void accept(NodeAdderVisitor visitor, Node nodeToAdd) {
        visitor.visit(this, nodeToAdd);
    }
}

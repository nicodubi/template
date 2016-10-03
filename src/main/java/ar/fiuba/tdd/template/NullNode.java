package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 1/10/2016.
 */
public class NullNode<T> extends Node<T> implements Visitable {

    @Override
    public T getValue() {
        throw new AssertionError();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public Node<T> iterateNodes(Node<T> previousNode) {
        return previousNode;
    }

    @Override
    public Node<T> getNextNode() {
        throw new AssertionError();
    }

    @Override
    public void addNextNode(InternalNode<T> nextNode) {
        nextNode.setNextNode(this);
    }

    @Override
    public void accept(NodeAdderVisitor visitor, Node nodeToAdd) {
        visitor.visit(this, nodeToAdd);
    }
}

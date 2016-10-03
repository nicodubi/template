package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 2/10/2016.
 */
public class NodeChain<T> implements NodeAdderVisitor<T> {


    private Node<T> firstNode;

    public NodeChain() {
        firstNode = new NullNode();
    }

    public int size() {
        return firstNode.getSize();
    }

    public void add(T item) {
        getLastItem().accept(this, new InternalNode<T>(item));
    }

    public Node<T> getLastItem() {
        return firstNode.iterateNodes(firstNode);
    }


    public T top() {
        return (T) firstNode.getValue();
    }

    public void remove() throws AssertionError {
        firstNode = firstNode.getNextNode();
    }

    @Override
    public void visit(InternalNode<T> node, Node nodeToAdd) {
        node.addNextNode((InternalNode) nodeToAdd);
    }

    @Override
    public void visit(NullNode<T> node, Node nodeToAdd) {
        firstNode = nodeToAdd;
    }
}

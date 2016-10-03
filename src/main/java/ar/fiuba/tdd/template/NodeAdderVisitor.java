package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 2/10/2016.
 */
public interface NodeAdderVisitor<T> {

    public void visit(InternalNode<T> node, Node nodeToAdd);

    public void visit(NullNode<T> node, Node nodeToAdd);
}

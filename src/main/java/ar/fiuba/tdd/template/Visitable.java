package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 2/10/2016.
 */
public interface Visitable {

    public void accept(NodeAdderVisitor visitor, Node nodeToAdd);
}

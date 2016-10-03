package ar.fiuba.tdd.template;

/**
 * Created by Nicolas on 1/10/2016.
 */
public class CustomQueue<T> {

    private NodeChain nodeChain;

    public CustomQueue() {
        nodeChain = new NodeChain();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return nodeChain.size();
    }

    public void add(T item) {
        nodeChain.add(item);
    }

    public T top() throws AssertionError {
        return (T) nodeChain.top();
    }

    public void remove() throws AssertionError {
        nodeChain.remove();
    }


}

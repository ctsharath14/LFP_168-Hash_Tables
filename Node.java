public class Node <K,V> implements INode<K> {
    K key;
    V value;
    Node<K,V> next;

    //Node data getter & setter methods
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode<K> next) {
        this.next = (Node<K,V>) next;
    }

    //Node constructor
    public Node(K key,V value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
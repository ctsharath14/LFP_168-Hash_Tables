public class MyHashMap<K,V> {
    LinkedList<K> linkedList;

    public MyHashMap() {
        this.linkedList = new LinkedList<>();
    }

    /* using search ,method of my linked list
     * to get value.  */
    public V get(K key) {
        Node<K, V> mapNode = (Node<K, V>) this.linkedList.search(key);
        if (mapNode == null) {
            return null;
        }
        else {
            return mapNode.getValue();
        }
    }

    /* function to add node to hash table.
     * first it checks if table is empty
     *  then adds node using append method of my linked list */
    public void add(K key, V value) {
        Node<K, V> mapNode = (Node<K, V>) this.linkedList.search(key);
        if (mapNode == null) {
            mapNode = new Node<>(key, value);
            this.linkedList.append(mapNode);
        }
        else {
            mapNode.setValue(value);
        }
    }
}
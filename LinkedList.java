public class LinkedList<K> {

    public INode<K> head ;
    public INode<K> tail ;
    int size ;

    //method to search node to linked list
    public INode<K> search(K key) {
        INode<K> tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }

    //method to append node in linked list
    public void append(INode<K> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }

    //method to delete node in linked list
    public INode<K> delete(K key) {
        INode<K> tempNode = head;
        if (tempNode == null) {
            return null;
        }
        while (tempNode.getNext() != null) {
            if (tempNode.getNext().getKey().equals(key)) {
                INode<K> value = tempNode.getNext().getNext();
                tempNode.setNext(value);
            }
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

}
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

}
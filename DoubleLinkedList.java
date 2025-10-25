
class DNode {
    int data; // node's value
    DNode next; // next pointer
    DNode prev; // previous pointer

    // constructore that will assign data to the node and initialize next to null
    DNode(int d) {
        this.data = d;
        this.next = null;
        this.prev = null;
    }
}

class nodeList {
    DNode head; // head of the list

    // method to insert a new node at the end of the list
    public void addNode(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DNode currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
    }

    // method to display the linked list in forward direction
    public void displayList() {
        DNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
    
    // method to display the linked list in backward direction
    public void traverseBackward(){
        DNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " <-> ");
            currentNode = currentNode.prev;
        }
        System.out.println("null");

    }

    public void addToStart(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteLastNode() {
        DNode trackNode = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;
        }
        while (trackNode.next.next != null) {
            trackNode = trackNode.next;
        }
        trackNode.next = null;

    }

    public void deleteAtPosition(int position) {
        System.out.println("Deleting node at position: " + position);
    
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }
    
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        // Case 1: delete head node
        if (position == 1) {
            System.out.println("Deleted node: " + head.data);
            head = head.next;
            return;
        }
    
        DNode currNode = head;
        int count = 1;
    
        // traverse to the (position - 1)th node
        while (currNode != null && count < position - 1) {
            currNode = currNode.next;
            count++;
        }
    
        // if position is out of bounds
        if (currNode == null || currNode.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
    
        // delete the node
        System.out.println("Deleted node: " + currNode.next.data);
        currNode.next = currNode.next.next;
        if(currNode.next.next != null){
            currNode.next.next.prev = currNode;
        }
    }
}

public class DoubleLinkedList {
    public static void main(String[] args) {
        nodeList list = new nodeList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addToStart(5);
        // list.deleteLastNode();
        // list.traverseBackward();
        list.deleteAtPosition(3);
        list.displayList();
    }

}

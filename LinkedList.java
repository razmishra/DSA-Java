
class Node {
    int data; // node's value
    Node next; // pointer

    // constructore that will assign data to the node and initialize next to null
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class nodeList {

    Node head; // head of the list

    // method to insert a new node at the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    // method to display the linked list
    public void displayList() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void addToStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteLastNode() {
        Node trackNode = head;
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
    
        Node currNode = head;
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
    }
}
    

public class LinkedList {
    public static void main(String[] args) {

        nodeList list = new nodeList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addToStart(12);
        list.deleteLastNode();
        list.deleteLastNode();
        list.deleteLastNode();
        list.deleteAtPosition(2);
        list.displayList();
    }
}
// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Add node at the end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse the linked list iteratively
    public void reverseIterative() {
        Node prev = null;         // Previous node starts as null
        Node current = head;      // Current node starts as head
        Node next = null;         // Next node (to keep track)

        while (current != null) {
            next = current.next;      // Save next node
            current.next = prev;      // Reverse the link
            prev = current;           // Move prev and current forward
            current = next;
        }

        head = prev;   // Update head to the last node (new head)
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);

        System.out.println("Original Linked List:");
        ll.display();   // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        ll.reverseIterative();

        System.out.println("Reversed Linked List:");
        ll.display();   // Output: 5 -> 4 -> 3 -> 2 -> 1 -> null
    }
}

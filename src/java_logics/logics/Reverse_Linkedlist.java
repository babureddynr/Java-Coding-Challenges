package java_logics.logics;

// Define the Node class for the linked list
class Node {
    int data;  // Data to store in the node
    Node next; // Pointer to the next node in the list

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
    }
}

public class Reverse_Linkedlist {

    // Function to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;  // To store the previous node (starts as null)
        
        // Iterate through the list
        while (head != null) {
            Node next = head.next;  // Save the next node
            head.next = prev;       // Reverse the current node's pointer
            prev = head;            // Move 'prev' to the current node
            head = next;            // Move 'head' to the next node
        }
        
        // 'prev' is now the new head of the reversed list
        return prev;
    }

    // Function to print the elements of the linked list
    public static void printList(Node head) {
        // Traverse through the list until the end
        while (head != null) {
            System.out.print(head.data + " ");  // Print the data of the current node
            head = head.next;  // Move to the next node
        }
    }

    public static void main(String[] args) {
        // Creating the linked list: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Reverse the linked list
        head = reverse(head);

        // Print the reversed list: Expected output: 3 2 1
        printList(head);
    }
}

package linkedlist;

public class DLinkedList {

    class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


    Node head, tail = null;

    public void addNote(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;

            head.prev = null;

            tail.next = null;
        }

        else {
            tail.next = newNode;

            newNode.prev = tail;

            tail = newNode;

            tail.next = null;
        }
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        list.addNote(1);
        list.addNote(2);
        list.addNote(3);
        list.addNote(4);
        list.addNote(5);
        list.addNote(6);
        list.addNote(7);
        list.addNote(8);

        list.display();
    }
}

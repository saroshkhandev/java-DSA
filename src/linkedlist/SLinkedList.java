package linkedlist;

public class SLinkedList {
    ListNode head;
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static SLinkedList insert(SLinkedList list, int val) {
        ListNode new_node = new ListNode(val);

        if(list.head == null) {
            list.head = new_node;
        } else {
            ListNode last = list.head;
            while(last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }

    public static SLinkedList deleteWithKey(SLinkedList list, int key) {
        ListNode currNode = list.head, prev = null;

        if(currNode != null && currNode.val == key) {
            list.head = currNode.next;

            System.out.println(key + " found and deleted");

            return list;
        }

        while(currNode != null && currNode.val != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if(currNode != null) {
            prev.next = currNode.next;

            System.out.println(key + " found and deleted");
        }

        if(currNode == null) {
            System.out.println(key + " not found");
        }

        return list;
    }

    public static SLinkedList deletedByIndex(SLinkedList list, int index) {
        ListNode currNode = list.head, prev = null;
        if(index == 0 && currNode != null) {
            list.head = currNode.next;

            System.out.println(index + " position element deleted");

            return list;
        }
        int counter = 0;

        while(currNode != null) {
            if(counter == index) {
                prev.next = currNode.next;

                System.out.println(index + " position element deleted");
                break;
            } else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        if(currNode == null) {
            System.out.println(index + " is out of bound");
        }

        return list;


    }

    public static void print(SLinkedList list) {
        ListNode currNode = list.head;

        System.out.print("Singly LinkedList: ");

        while(currNode != null) {
            System.out.print(currNode.val + " ");
            currNode = currNode.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        SLinkedList list = new SLinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        insert(list, 8);

        print(list);

        deleteWithKey(list, 1);

        print(list);

        deleteWithKey(list, 4);

        print(list);

        deleteWithKey(list, 10);

        print(list);

        deletedByIndex(list, 0);

        print(list);

        deletedByIndex(list, 2);

        print(list);

        deletedByIndex(list, 10);

        print(list);

    }
}

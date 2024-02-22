package LinkedList;

public class Linkedlist{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step1 --> Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        // Step 2-->> newNode next= head
        newNode.next = head;// link
        // Step 3-> head= newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;

        }
        // i=idx-1: temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        // prev :i =size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Search using Recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;// Base Case
        }
        if (head.data == key) {
            return 0;

        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;

        }
        return idx + 1;
    }

    public int reSearch(int key) {
        return helper(head, key);

    }

    // Reverse the ll
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    // Find & Remove Nth node from end
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next;// remove first
            return;
        }
        // size-n
        int i = 1;
        int iToFind = sz = n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }

    // Slow Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// Slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null && head.next == null) {
            return true;
        }
        // find node
        Node mid = findMid(head);
        // Reverse 2nd half
        Node curr = mid;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;
        // check if equal
        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

   

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    // public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    // ll.addFirst(2);
    // ll.addFirst(1);
    // ll.addLast(2);
    // // ll.add(2, 3);
    // ll.addLast(1);
    // // ll.addFirst(2);
    // ll.print();
    // // ll.removeFirst();
    // // ll.print();
    // // ll.removeLast();
    // // ll.print();
    // // System.out.println(ll.size);
    // // System.out.println(ll.itrSearch(2));
    // // System.out.println(ll.itrSearch(11));

    // // System.out.println(ll.reSearch(4));
    // // System.out.println(ll.reSearch(23));

    // // ll.reverse();
    // // ll.print();

    // // ll.deleteNthFromEnd(3);
    // // ll.print();
    // System.out.println(ll.checkPalindrome());

    // }

  

}

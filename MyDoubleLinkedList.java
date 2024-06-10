public class MyDoubleLinkedList {

    MyDoubleLinkedList.Node head;

    public MyDoubleLinkedList.Node getHead() {
        return head;
    }

    static class Node {

        int data;
        MyDoubleLinkedList.Node next;
        MyDoubleLinkedList.Node previous;

        Node(int d) {
            data = d;
            next = null;
            previous = null;
        }

        int getData() {
            return data;
        }

        boolean hasNext() {
            return next != null;
        }

        boolean hasPrevious() {
            return previous != null;
        }
    }

    public static void insertBack(MyDoubleLinkedList list, int data) {
        MyDoubleLinkedList.Node new_node = new MyDoubleLinkedList.Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            MyDoubleLinkedList.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            new_node.previous = last;
            last.next = new_node;
        }
    }

    public static void insertFront(MyDoubleLinkedList list, int data) {
        MyDoubleLinkedList.Node new_node = new MyDoubleLinkedList.Node(data);
        if (list.head == null) {
            list.head = new_node;
        } else {
            MyDoubleLinkedList.Node current = list.head;
            current.previous = new_node;
            list.head = new_node;
            list.head.next = current;
        }
    }

    public static void printActualList(MyDoubleLinkedList.Node headOfList) {
        MyDoubleLinkedList.Node currNode = headOfList;
        System.out.print("LinkedList ");
        while (currNode != null) {
            System.out.print("Element: " + currNode.data + " ");
            if(currNode.hasPrevious()){
                System.out.println(" Poprzedni: " + currNode.previous.getData());
            }
            if(currNode.hasNext()){
                System.out.println(" Nastepny: " + currNode.next.getData());
            }
            System.out.print("\n");
            currNode = currNode.next;
        }
    }

    public static MyDoubleLinkedList createLinkedListBasicWay(int[] array) {
        MyDoubleLinkedList myList = new MyDoubleLinkedList();
        for (int j : array) {
            insertBack(myList, j);
        }
        return myList;
    }

    public static MyDoubleLinkedList createLinkedListReversedWay(int[] array) {
        MyDoubleLinkedList myList = new MyDoubleLinkedList();
        for (int j : array) {
            insertFront(myList, j);
        }
        return myList;
    }

    public static MyDoubleLinkedList removeElementWithGivenIndex(MyDoubleLinkedList list, int indexToDelete){
        Node temp = list.getHead();
        if(indexToDelete == 0){
            list.head = temp.next;
            temp.next.previous = null;
            return list;
        }
        for(int i = 0; i<indexToDelete; i++){
            temp = temp.next;
        }
        temp.previous.next = temp.next;
        if(temp.hasNext()){
            temp.next.previous = temp.previous;
        }
        return list;
    }

    public static void insertIntoGivenIndex(int element, int index, Node head){
        Node n = new Node(element);
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        if(temp.hasNext()){
            Node temp2 = temp.next;
            temp2.previous = n;
            n.next = temp2;
        }
        temp.next = n;
        n.previous = temp;
    }
    public static void main(String[] args) {
        int[] myTestArray = {2, 0, 4, 1, 5};
        MyDoubleLinkedList myList1 = MyDoubleLinkedList.createLinkedListBasicWay(myTestArray);
        //removeElementWithGivenIndex(myList1, 4);
        insertIntoGivenIndex(8, 2, myList1.head);
        printActualList(myList1.getHead());
    }
}

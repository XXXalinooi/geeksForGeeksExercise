public class MyLinkedList {

    Node head;

    public Node getHead() {
        return head;
    }

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
        int getData(){ return data;}
        boolean hasNext(){
            return next!=null;
        }
    }

    public static void insertBack(MyLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public static void insertFront(MyLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node current = list.head;
            list.head = new_node;
            list.head.next = current;
        }
    }

    public static void printActualList(Node headOfList) {
        Node currNode = headOfList;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static MyLinkedList createLinkedListBasicWay(int [] array){
        MyLinkedList myList = new MyLinkedList();
        for (int j : array) {
            insertBack(myList, j);
        }
        return myList;
    }
    public static MyLinkedList createLinkedList(int [] array){
        MyLinkedList myList = new MyLinkedList();
        for(int i = 1; i < array.length; i=i+2){
            if(array[i] == 0){
                insertFront(myList, array[i-1]);
            }
            else if(array[i] == 1){
                insertBack(myList, array[i-1]);
            }
            else{
                System.out.println("Źle skonstruowana tablica");
                return myList;
            }
        }
        return myList;
    }

    static public int getSizeOfLinkedList(Node head){
        Node current = head;
        int amountOfElement = 1;
        while(current.next != null){
            amountOfElement++;
            current = current.next;
        }
        return amountOfElement;
    }

    public boolean isLinkedListCircular(Node head){
        if(head == null){
            return  false;
        }
        Node current = head.next;
        while (current != head && current.hasNext()){
            current = current.next;
        }
        return current == head;
    }

    public static boolean areTwoLinkedListsIdenticalSecondWay(Node firstHead, Node secondHead){
        int sizeOfLists = getSizeOfLinkedList(firstHead);
        if(sizeOfLists != getSizeOfLinkedList(secondHead)){
            return false;
        }
        if(firstHead.getData() != secondHead.getData()){
            return false;
        }
        if(!firstHead.hasNext() && !secondHead.hasNext()){
            return true;
        }
        else {
            areTwoLinkedListsIdenticalSecondWay(firstHead.next, secondHead.next);
        }
        return true;
    }

    public static boolean areTwoLinkedListsIdentical(Node firstHead, Node secondHead){
        int sizeOfLists = getSizeOfLinkedList(firstHead);
        if(sizeOfLists != getSizeOfLinkedList(secondHead)){
            return false;
        }
        if(firstHead.getData() != secondHead.getData()){
            return false;
        }
        else {
            Node temp1 = firstHead;
            Node temp2 = secondHead;
            for(int i = 0; i < sizeOfLists-1; i++){
                temp1 = temp1.next;
                temp2 = temp2.next;
                if(temp1.getData() != temp2.getData()){
                    return false;
                }
            }
        }
        return true;
    }

    public static void insertIntoMiddleOfLinkedListFirstWay(Node headOfList, Node nodeToInsert){
        int sizeOfList = getSizeOfLinkedList(headOfList);
        int middle = Math.floorMod(sizeOfList, 2)+1;
        Node temp1;
        Node temp2;
        temp1 = headOfList;
        temp2 = headOfList.next;
        for(int i = 0; i<=middle; i++){
            temp1 = temp2;
            temp2 = temp2.next;
        }
        temp1.next = nodeToInsert;
        nodeToInsert.next = temp2;

        printActualList(headOfList);
    }
    public static boolean isLinkedListSizeEven(Node head){
        if(head == null){
            return true;
        }
        int numberOfNodes = 1;
        if(!head.hasNext()){
            return false;
        }
        else{
            while (head.hasNext()){
                numberOfNodes = numberOfNodes + 1;
                head = head.next;
            }
        }
        return numberOfNodes%2 == 0;

    }

    public static void main(String[] args) {
        int[] myTestArray = {2};
        MyLinkedList myList1 = createLinkedListBasicWay(myTestArray);
        System.out.println(isLinkedListSizeEven(myList1.getHead()));

    }
}

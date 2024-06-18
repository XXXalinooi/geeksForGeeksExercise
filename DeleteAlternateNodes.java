public class DeleteAlternateNodes {
    public static class Node {
        public int value;
        public Node next;
        Node(int val){
            this.value = val;
        }
        public boolean hasNext(){
            return (this.next != null);
        }
    }
    public static class LinkedList {
        public Node head;
        LinkedList(Node head1){
            this.head = head1;
        }
        public static void addAtTheEnd(Node head, int val){
            Node nodeToAdd = new Node(val);
            while(head.hasNext()){
                head = head.next;
            }
            head.next = nodeToAdd;
        }

        public static void removeNode(Node head, int nodeToRemove){
            while (head.hasNext() && head.next.value != nodeToRemove) {
                head = head.next;
            }
            head.next = head.next.next;
        }

        public static void removeNode(Node nodeBeforeNodeToRemove){
            nodeBeforeNodeToRemove.next = nodeBeforeNodeToRemove.next.next;
        }
    }

    public static void deleteAlternateNodes(Node head){
        while(head.hasNext()){
            LinkedList.removeNode(head);
            head = head.next;
        }
    }

    public static void printLinkedList(Node head){
        while(head.hasNext()){
            System.out.print(head.value + "->");
            head = head.next;
        }
        System.out.print(head.value);
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        LinkedList.addAtTheEnd(head, 9);
        LinkedList.addAtTheEnd(head, 6);
        LinkedList.addAtTheEnd(head, 8);
        LinkedList.addAtTheEnd(head, 1);
        LinkedList.addAtTheEnd(head, 0);
        LinkedList.addAtTheEnd(head, 12);
        LinkedList.addAtTheEnd(head, 4);
        LinkedList.addAtTheEnd(head, 7);
        printLinkedList(head);
        deleteAlternateNodes(head);
        System.out.print("\n");
        printLinkedList(head);
    }
}

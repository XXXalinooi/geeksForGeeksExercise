import java.awt.*;
import java.util.LinkedList;

public class NumberAtIndexInLinkedList {
    public static int getNumberAtIndex(int index, int sizeOfList, MyLinkedList.Node head) throws Exception{
        if(sizeOfList == 0 || head == null){
            throw new Exception("Empty Linkedlist");
        }
        MyLinkedList.Node node = head.next;
        for(int i = 2; i<index; i++){
            node = node.next;
        }
        return node.getData();
    }

    public static void main(String[] args) throws Exception {
        int[] myTestArray = {2, 0, 4, 1, 5, 0, 6, 0, 3, 1, 9, 0};
        MyLinkedList myList1 = MyLinkedList.createLinkedListBasicWay(myTestArray);
        int result = getNumberAtIndex(12,12, myList1.getHead());
        System.out.println(result);
    }
}

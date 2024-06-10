public class StackUsingLinkedList {
    MyLinkedList myLinkedList;

    public StackUsingLinkedList(MyLinkedList myLinkedList) {
        this.myLinkedList = myLinkedList;
    }

    void pushToLinkedListStack(int numberToPush){
        MyLinkedList.Node newNode = new MyLinkedList.Node(numberToPush);
        if(myLinkedList.head == null){
            myLinkedList.head = newNode;
        }
        else {
            MyLinkedList.Node currentNode = myLinkedList.head;
            while(currentNode.hasNext()){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    int popFromLinkedListStack() {
        if(myLinkedList.head == null){
            return -1;
        }
        else{
            MyLinkedList.Node currentNode = myLinkedList.head;
            while(currentNode.next.hasNext()){
                currentNode = currentNode.next;
            }
            int valueToReturn = currentNode.next.data;
            currentNode.next = null;
            return valueToReturn;
        }
    }

    void printActualList(){
        MyLinkedList.Node currNode = myLinkedList.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        StackUsingLinkedList myStack = new StackUsingLinkedList(list1);
        myStack.pushToLinkedListStack(3);
        myStack.pushToLinkedListStack(1);
        myStack.pushToLinkedListStack(2);
        myStack.popFromLinkedListStack();
        myStack.pushToLinkedListStack(7);
        myStack.pushToLinkedListStack(4);
        myStack.popFromLinkedListStack();
        myStack.printActualList();
    }
}

public class Stack {
    public int[] myStack = new int[1000];
    public int top;

    Stack(){
        top = -1;
    }

    void push(int numberToPush){
        if(this.top == -1){
            this.myStack[0] = numberToPush;
            this.top = 1;
        }
        else{
            this.myStack[top] = numberToPush;
            this.top++;
        }
    }

    void pull(){
        if (this.top >= 0) {
            this.myStack[top] = 0;
        }
        this.top --;
    }

    void printStack(Stack stackToPrint){
        for(int i = 0; i < stackToPrint.top; i++){
            System.out.println(stackToPrint.myStack[i] + " ");
        }
    }

    public static void main(String[] args) {
        Stack testStack = new Stack();
        testStack.push(7);
        testStack.push(9);
        testStack.push(8);
        testStack.push(1);
        testStack.push(8);
        testStack.pull();
        testStack.pull();
        testStack.push(7);
        testStack.push(2);
        testStack.printStack(testStack);
    }
}

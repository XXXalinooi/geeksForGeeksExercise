import org.jetbrains.annotations.NotNull;

public class QueImplementation {
    int[] que;

    QueImplementation(int[] que1){
        this.que = que1;
    }

    void push(int number){
        if(que.length == 0){
            int [] que1 = new int[1];
            que1[0] = number;
            que = que1;
            return;
        }
        int [] que1 = new int[que.length+1];
        System.arraycopy(que, 0, que1, 0, que.length);
        que1[que.length] = number;
        this.que = que1;
    }

    int pop(){
        if(que.length == 0){
            return -1;
        }
        int head = que[0];
        int [] que1 = new int[que.length -1];
        System.arraycopy(que, 1, que1, 0, que.length - 1);
        this.que = que1;
        return head;
    }

    void createQue(int @NotNull [] inputArray){
        int i = 0;
        while(i < inputArray.length){
            if(inputArray[i]!= 1 && inputArray[i]!= 2){
                System.out.println("źle przygotowana lista");
            }
            if(inputArray[i] == 1){
                push(inputArray[i+1]);
                i = i+2;
            }
            if(inputArray[i] == 2) {
                System.out.println(pop());
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] myTestArray = {1, 2, 1, 3, 2, 1, 4, 2};
        int[] myTestArray2 = {1, 3, 2, 2, 1, 4};
        int[] outputArray = new int[0];
        QueImplementation myQueImp = new QueImplementation(outputArray);
        myQueImp.createQue(myTestArray);
    }
}

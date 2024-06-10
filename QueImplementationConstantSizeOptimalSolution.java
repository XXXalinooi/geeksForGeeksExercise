import org.jetbrains.annotations.NotNull;

public class QueImplementationConstantSizeOptimalSolution {
    int maximumAvailableSizeOfQue;
    int actualStartQueIndex;
    int actualStopQueIndex;
    int[] que = new int[maximumAvailableSizeOfQue];

    QueImplementationConstantSizeOptimalSolution(int maxSize, int startIndex, int stopIndex) {
        this.actualStartQueIndex = startIndex;
        this.maximumAvailableSizeOfQue = maxSize;
        this.actualStopQueIndex = stopIndex;
    }

    void push(int number) {
        if (actualStopQueIndex < maximumAvailableSizeOfQue) {
            que[actualStopQueIndex] = number;
            actualStopQueIndex = actualStartQueIndex + 1;
        } else {
            System.out.println("Maximum capabilities has been restored");
        }
    }

    int pop() {
        if (actualStartQueIndex == actualStopQueIndex) {
            return -1;
        } else {
            int result = que[actualStartQueIndex];
            actualStartQueIndex = actualStartQueIndex + 1;
            return result;
        }
    }

    int pullSecondWayWithoutStartIndex() {
        if (actualStopQueIndex == 0) {
            return -1;
        } else {
            int result = que[0];
            if (actualStopQueIndex >= 0) System.arraycopy(que, 1, que, 0, actualStopQueIndex);
            actualStopQueIndex = actualStopQueIndex - 1;
            return result;
        }
    }

    void createQue(int @NotNull [] inputArray) {
        int i = 0;
        while (i < inputArray.length) {
            if (inputArray[i] != 1 && inputArray[i] != 2) {
                System.out.println("źle przygotowana lista");
            }
            if (inputArray[i] == 1) {
                push(inputArray[i + 1]);
                i = i + 2;
            }
            if (inputArray[i] == 2) {
                System.out.println(pullSecondWayWithoutStartIndex());
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

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
    public static final int STACK_SIZE = 10;
    private ArrayList<int[]> listOfStacks = new ArrayList<int[]>();
    private int size = 0;
    
    public void push(int item) {
        int[] tempStack;
        int index = size % STACK_SIZE;
        if (index != 0) {
            tempStack = getLastStack();
            tempStack[index] = item;
            removeLastStack();
        } else {
            tempStack = new int[STACK_SIZE];
            tempStack[0] = item;
        }
        listOfStacks.add(tempStack);
        size++;
    }
    
    public int pop() {
        if (size > 0) {
            int[] tempStack = getLastStack();
            int index = size % STACK_SIZE;
            int result = index != 0 ? tempStack[index - 1] : tempStack[STACK_SIZE - 1];
            size--;
            if (size % STACK_SIZE == 0) {
                removeLastStack();
            }
            return result;
        } else {
            throw new EmptyStackException();
        }
    }
    
    public int popAt(int index) {
        if (size > 0) {
            int numOfStacks = listOfStacks.size();
            if (index == numOfStacks-1) {
                return pop();
            } else {
                int result = getPopAtResult(index);
                cleanUpStack(index);
                return result;
            }
        } else {
            throw new EmptyStackException();
        }
    }
    
    private int[] getLastStack() {
        int numOfStacks = listOfStacks.size();
        return listOfStacks.get(numOfStacks - 1);
    }
    
    private void removeLastStack() {
        int numOfStacks = listOfStacks.size();
        listOfStacks.remove(numOfStacks - 1);
    }
    
    private int getPopAtResult(int index) {
        int[] tempStack = listOfStacks.get(index);
        return tempStack[STACK_SIZE - 1];
    }
    
    private void cleanUpStack(int index) {
        int serial = (index+1) * STACK_SIZE - 1;
        int num = size - serial;
        popPush(num);
    }
    
    private void popPush(int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = pop();
        }
        for (int i = 1; i < n; i++) {
            push(temp[n-i-1]);
        }
    }    
}

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackMin {
    private ArrayList<StackNode> arr = new ArrayList<StackNode>();
    
    public void push(int item) {
        if (arr.isEmpty()) {
            arr.add(new StackNode(item, 0));
        } else {
            int minIndex = getMinIndex();
            StackNode minNode = arr.get(minIndex);
            int minVal = minNode.getVal();
            if (item < minVal) {
                arr.add(new StackNode(item, arr.size()));
            } else {
                arr.add(new StackNode(item, minIndex));
            }
        }
    }

    public int pop() {
        if (arr.isEmpty()) {
            throw new EmptyStackException();
        } else {
            int topIndex = arr.size() - 1;
            StackNode topNode = arr.get(topIndex);
            arr.remove(topIndex);
            return topNode.getVal();
        }
    }
    
    public int min() {
        if (arr.isEmpty()) {
            throw new EmptyStackException();
        } else {
            int minIndex = getMinIndex();
            StackNode minNode = arr.get(minIndex);
            return minNode.getVal();
        }
    }
    
    private int getMinIndex() {
        StackNode topNode = arr.get(arr.size() -1);
        return topNode.getMin();
    }
}

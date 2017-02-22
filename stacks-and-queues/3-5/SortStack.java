import java.util.Stack;

public class SortStack {
    public static void sortStack(Stack<Integer> stack) {
    	// insertion sort
    	if (!stack.isEmpty()) {
    		Stack<Integer> temp = new Stack<Integer>();
    		int size = stack.size();
    		int item = stack.pop();
    		while (temp.size() < size) {
    			if (temp.isEmpty() || item > temp.peek()) {
    				temp.push(item);
    				if (!stack.isEmpty()) {
    				    item = stack.pop();
    				}
    			} else {
    				stack.push(temp.pop());
    			}
    		}
    		while (!temp.isEmpty()) {
    			stack.push(temp.pop());
    		}
    	}
    } 
}

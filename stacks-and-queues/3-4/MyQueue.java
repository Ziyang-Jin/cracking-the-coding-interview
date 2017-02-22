import java.util.Stack;

public class MyQueue<E> {
    Stack<E> s1 = new Stack<E>(); // store
    Stack<E> s2 = new Stack<E>(); // offer
    
    public void add(E i) {
        s1.push(i);
    }
    
    public E remove() {
        pour(s1, s2, s1.size()-1);
        E result = s1.pop();
        pour(s2, s1, s2.size());
        return result;
    }
    
    public E peek() {
        pour(s1, s2, s1.size()-1);
        E result = s1.peek();
        pour(s2, s1, s2.size());
        return result;
    }
    
    public boolean isEmpty() {
        return s1.isEmpty();
    }
    
    private void pour(Stack<E> s1, Stack<E> s2, int n) {
        for (int i = 0; i < n; i++) {
            E item = s1.pop();
            s2.push(item);
        }
    }
}

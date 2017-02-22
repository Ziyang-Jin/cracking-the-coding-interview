import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

public class SortStackTest {
    Stack<Integer> stk;
    
    @Before
    public void setUp() {
        stk = new Stack<Integer>();
    }

    @Test
    public void test() {
        stk.push(3);
        stk.push(4);
        stk.push(7);
        stk.push(2);
        stk.push(5);
        stk.push(9);
        stk.push(1);
        stk.push(0);
        stk.push(8);
        stk.push(6);
        SortStack.sortStack(stk);
        for (int i = 0; i < 10; i++) {
            assertEquals(i, (int) stk.pop());
        }
    }

}

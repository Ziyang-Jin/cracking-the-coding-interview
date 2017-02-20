import java.lang.IndexOutOfBoundsException;
import java.util.EmptyStackException;

public class ThreeInOne {
	
    public static final int STACK_SIZE = 10;
    public static final int STACK_NUM = 3;
    private int[] arr = new int[STACK_SIZE * STACK_NUM];
    private int stackOneSize = 0;
    private int stackTwoSize = 0;
    private int stackThreeSize = 0;

    public int pop(int index) throws EmptyStackException {
        switch (index) {
            case 1: 
        	    return popStackOne();
            case 2: 
            	return popStackTwo();
            case 3:
            	return popStackThree();
            default:
            	throw new IndexOutOfBoundsException();
        }
    }
    
    private int popStackOne() throws EmptyStackException {
    	if (stackOneSize > 0) {
    		stackOneSize--;
    		return arr[stackOneSize];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    private int popStackTwo() throws EmptyStackException {
    	if (stackTwoSize > 0) {
    		stackTwoSize--;
    		return arr[STACK_SIZE + stackTwoSize];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    private int popStackThree() throws EmptyStackException {
    	if (stackThreeSize > 0) {
    		stackThreeSize--;
    		return arr[2 * STACK_SIZE + stackOneSize];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    public void push(int index, int item) throws StackOverflowException{
    	switch (index) {
    	    case 1:
    	    	pushStackOne(item);
    	    	break;
    	    case 2:
    	    	pushStackTwo(item);
    	    	break;
    	    case 3:
    	    	pushStackThree(item);
    	    	break;
    	    default:
    	    	throw new IndexOutOfBoundsException();
    	}
    }
    
    private void pushStackOne(int item) throws StackOverflowException {
    	if (stackOneSize < STACK_SIZE) {
    		arr[stackOneSize] = item;
    		stackOneSize++;
    	} else {
    		throw new StackOverflowException();
    	}
    }
    
    private void pushStackTwo(int item) throws StackOverflowException {
    	if (stackTwoSize < STACK_SIZE) {
    		arr[STACK_SIZE + stackTwoSize] = item;
    		stackTwoSize++;
    	} else {
    		throw new StackOverflowException();
    	}
    }
    
    private void pushStackThree(int item) throws StackOverflowException {
    	if (stackThreeSize < STACK_SIZE) {
    		arr[2 * STACK_SIZE + stackThreeSize] = item;
    		stackThreeSize++;
    	} else {
    		throw new StackOverflowException();
    	}
    }
    
    public int peek(int index) throws EmptyStackException {
        switch (index) {
            case 1: 
        	    return peekStackOne();
            case 2: 
            	return peekStackTwo();
            case 3:
            	return peekStackThree();
            default:
            	throw new IndexOutOfBoundsException();
        }
    }
    
    private int peekStackOne() throws EmptyStackException {
    	if (stackOneSize > 0) {
    		return arr[stackOneSize - 1];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    private int peekStackTwo() throws EmptyStackException {
    	if (stackTwoSize > 0) {
    		return arr[STACK_SIZE + stackTwoSize - 1];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    private int peekStackThree() throws EmptyStackException {
    	if (stackThreeSize > 0) {
    		return arr[2 * STACK_SIZE + stackOneSize - 1];
    	} else {
    		throw new EmptyStackException();
    	}
    }
    
    public boolean isEmpty(int index) {
        switch (index) {
            case 1: 
        	    return stackOneSize == 0;
            case 2: 
            	return stackTwoSize == 0;
            case 3:
            	return stackThreeSize == 0;
            default:
            	throw new IndexOutOfBoundsException();
        }
    }
}

public class StackNode {
    private int val;
    private int min;
    
    public StackNode(int val, int min) {
        this.val = val;
        this.min = min;
    }
    
    public int getVal() {
        return val;
    }
    
    public int getMin() {
        return min;
    }
    
    public void setVal(int val) {
        this.val = val;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
}

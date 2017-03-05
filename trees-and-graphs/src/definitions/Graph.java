package definitions;

import java.util.ArrayList;

public class Graph {
    public ArrayList<Node> nodes;
    
    public Graph() {
        nodes = new ArrayList<Node>();
    }
    
    public Graph(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
    
    public void addNode(Node node) {
        nodes.add(node);
    }
    
    public boolean contains(Node n) {
        for (int i = 0; i < nodes.size(); i++) {
            if (n.name == nodes.get(i).name) {
                return true;
            }
        }
        return false;
    }
}

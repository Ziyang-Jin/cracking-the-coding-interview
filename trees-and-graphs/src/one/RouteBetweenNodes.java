package one;

import java.util.ArrayList;

import definitions.Graph;
import definitions.Node;

public class RouteBetweenNodes {
    public static boolean routeExist(Graph g, Node a, Node b) {
    	if (g.contains(a) && g.contains(b)) {
    		if (!a.equals(b)) { 
    		    ArrayList<Node> visited = new ArrayList<Node>();
    		    return dfs(g, a, b, visited);
    		} else {
    			return true;
    		}
    	} else {
    	    return false;
    	}
    }
    
    public static boolean dfs(Graph g, Node a, Node b, ArrayList<Node> visited) {
    	if (a.equals(b)) {
    		return true;
    	} else if (g.nodes.size() != visited.size()) {
    		visited.add(a);
    	    for (int i = 0; i < a.children.size(); i++) {
    	    	if (dfs(g, a.children.get(i), b, visited)) {
    	    		return true;
    	    	}
    	    }
    	    return false;
    	} else {
    	    return false;
    	}
    }
}

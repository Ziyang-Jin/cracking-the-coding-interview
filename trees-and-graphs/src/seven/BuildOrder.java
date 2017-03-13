package seven;

import java.util.ArrayList;
import java.util.List;

import definitions.Graph;
import definitions.Node;
import definitions.Pair;

public class BuildOrder {
    public static List<String> computeBuildOrder(List<String> projects, List<Pair> dependencies) {
    	Graph g = generateGraph(projects);
    	for (int i = 0; i < dependencies.size(); i++) {
    	    addDependency(g, dependencies.get(i));
    	}
    	List<String> result = new ArrayList<String>();
    	resolve(result, g);
    	return result;
    }
    
    public static Graph generateGraph(List<String> projects) {
    	ArrayList<Node> nodes = new ArrayList<Node>();
    	for (int i = 0; i < projects.size(); i++) {
    		Node node = new Node(projects.get(i));
    		nodes.add(node);
    	}
    	return new Graph(nodes);
    }
    
    public static void addDependency(Graph g, Pair dependency) {
    	for (int i = 0; i < g.nodes.size(); i++) {
    		Node node = g.nodes.get(i);
    		if (dependency.b == node.name) {
    			Node nodeFound = find(g.nodes, dependency.a);
    			if (nodeFound != null && find(node.children, dependency.a) == null) {
    			    node.children.add(nodeFound);
    			} else {
    				// throw new UnresolvableDependencyException
    			}
    		}
    	}
    }
    
    public static Node find(List<Node> children, String s) {
    	for (int i = 0; i < children.size(); i++) {
    	    if (children.get(i).name == s) {
    	    	return children.get(i);
    	    }
    	}
    	return null;
    }
    
    public static void resolve(List<String> result, Graph g) {
    	while (!g.nodes.isEmpty()) {
    		List<Node> lonelyNodes = new ArrayList<Node>();
    		for (int i = 0; i < g.nodes.size(); i++) {
    			Node node = g.nodes.get(i);
    			if (node.children.isEmpty()) {
    				lonelyNodes.add(node);
    			}
    		}

    		for (int i = 0; i < lonelyNodes.size(); i++) {
    			Node node = lonelyNodes.get(i);
    			g.nodes.remove(node);
    			result.add(node.name);
    		}

    		for (int i = 0; i < lonelyNodes.size(); i++) {
    			Node lonelyNode = lonelyNodes.get(i);
    			for (int j = 0; j < g.nodes.size(); j++) {
    				Node node = g.nodes.get(j);
    				Node nodeFound = find(node.children, lonelyNode.name);
    				if (nodeFound != null) {
    					node.children.remove(nodeFound);
    				}
    			}
    		}
    	}
    }
}

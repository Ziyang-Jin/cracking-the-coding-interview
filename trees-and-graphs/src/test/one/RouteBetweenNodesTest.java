package test.one;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import definitions.Graph;
import definitions.Node;
import one.RouteBetweenNodes;

public class RouteBetweenNodesTest {
    Graph g;
    Node a;
    Node b;
    Node c;
    Node d;
    Node f;
    
    @Before
    public void setUp() {
        ArrayList<Node> nodes = new ArrayList<Node>();
        a = new Node("a");
        b = new Node("b");
        c = new Node("c");
        d = new Node("d");
        f = new Node("f");
        a.addChild(b);
        a.addChild(c);
        b.addChild(c);
        c.addChild(d);
        nodes.add(a);
        nodes.add(b);
        nodes.add(c);
        nodes.add(d);
        g = new Graph(nodes);
    }

    @Test
    public void test() {
        assertTrue(RouteBetweenNodes.routeExist(g, a, b));
        assertTrue(RouteBetweenNodes.routeExist(g, a, c));
        assertTrue(RouteBetweenNodes.routeExist(g, a, d));
        assertTrue(RouteBetweenNodes.routeExist(g, b, c));
        assertTrue(RouteBetweenNodes.routeExist(g, b, d));
        assertTrue(RouteBetweenNodes.routeExist(g, c, d));
        
        assertFalse(RouteBetweenNodes.routeExist(g, b, a));
        assertFalse(RouteBetweenNodes.routeExist(g, c, a));
        assertFalse(RouteBetweenNodes.routeExist(g, c, b));
        assertFalse(RouteBetweenNodes.routeExist(g, d, a));
        assertFalse(RouteBetweenNodes.routeExist(g, d, b));
        assertFalse(RouteBetweenNodes.routeExist(g, d, c));
        
        assertFalse(RouteBetweenNodes.routeExist(g, a, f));
        assertFalse(RouteBetweenNodes.routeExist(g, b, f));
        assertFalse(RouteBetweenNodes.routeExist(g, c, f));
        assertFalse(RouteBetweenNodes.routeExist(g, d, f));
    }

}

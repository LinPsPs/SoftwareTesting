package maven_test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class PathTest {
	
	//Node in path
	@Test public void testindexof0() {
		Path.Node n0 = new Path.Node();
        Path.Node n1 = new Path.Node();
        List<Path.Node> l1 = new ArrayList<Path.Node>();
        l1.add(n0);
        l1.add(n1);
        Path p0 = new Path(l1);
        assertEquals(p0.indexOf(n1), 1);
        
	}
	
	//Node not in path
	@Test public void testindexof1() {
		Path.Node n0 = new Path.Node();
		Path.Node n1 = new Path.Node();
        List<Path.Node> l1 = new ArrayList<Path.Node>();
        l1.add(n0);
        Path p0 = new Path(l1);
        assertEquals(p0.indexOf(n1), -1);
        
	}
	
	//Empty path
	@Test public void testindexof2() {
		Path.Node n0 = new Path.Node();
        List<Path.Node> l1 = new ArrayList<Path.Node>();
        Path p0 = new Path(l1);
        assertEquals(p0.indexOf(n0), -1);
        
	}
}

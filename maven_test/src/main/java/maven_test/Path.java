package maven_test;

import java.util.List;


public class Path {
	
	private List<Node>path;
	
	public Path(List<Node>path) {
		this.path = path;
	}
	
	public int indexOf(Node n)
	{
		for(int i=0; i <path.size(); i++) {
			if(path.get(i).equals(n))
				return i;
		}
		return -1;
	}
	
	public static class Node {
		public Node () {}
			
	}
	
	
}
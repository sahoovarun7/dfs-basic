package com.ninjacoder.dfs;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
	
		List<Node> graph = createNode();
		Node source = graph.get(0);
		dfs(source);
		
	}
	
	private static List<Node> createNode() {
		
		
		Node node1 = new Node("A",false);
		Node node2 = new Node("B",false);
		Node node3 = new Node("C",false);
		Node node4 = new Node("D",false);
		Node node5 = new Node("E",false);
		
		node1.addEdge(node1);
		node1.addEdge(node2);
		node1.addEdge(node3);
		node1.addEdge(node4);
		node3.addEdge(node1);
		node3.addEdge(node4);
		node4.addEdge(node5);
		List<Node> graph = new ArrayList<>();
		graph.add(node1);
		graph.add(node2);
		graph.add(node3);
		graph.add(node4);
		graph.add(node5);
		return graph;
	}
	
	public static void dfs(Node source) {
		
		source.setVisited(true);
		System.out.print(source.getName()+" ");
		List<Node> adjNodes = source.getLinkedNodes();
		if(adjNodes == null) {
			return;
		}else {
			for (Node node : adjNodes) {
				if(node.isVisited())
					return;
				else {
					node.setVisited(true);
					dfs(node);
				}
			}
		}
	}
}

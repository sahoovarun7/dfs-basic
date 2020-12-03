package com.ninjacoder.dfs;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private boolean isVisited;
	private List<Node> linkedNodes;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node(String name,boolean isVisited) {
		this.name = name;
		this.isVisited = isVisited;
		linkedNodes = new ArrayList<>();
	}
	
	public void addEdge(Node node) {
		if(!linkedNodes.contains(node)) {
			linkedNodes.add(node);
		}
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public List<Node> getLinkedNodes() {
		return linkedNodes;
	}

	public void setLinkedNodes(List<Node> linkedNodes) {
		this.linkedNodes = linkedNodes;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + ", isVisited=" + isVisited + "]\n";
	}
	
	
}

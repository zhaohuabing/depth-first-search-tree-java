package com.zhaohuabing;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public void depthFirstSearchRecursion(Node node, List<Node> result) {
    result.add(node);
    if (!node.hasChild()) {
      return;
    }
    List<Node> children = node.getChildren();
    for (int i = 0; i < children.size(); i++) {
      depthFirstSearchRecursion(children.get(i), result);
    }
  }

  public List<Node> depthFirstSerarchStack(Node root) {
    List<Node> result = new ArrayList<Node>();

    List<Node> stack = new ArrayList<Node>();
    stack.add(0, root);
    while (stack.size() > 0) {
      Node currentNode = stack.remove(0);
      result.add(currentNode);
      stack.addAll(0, currentNode.getChildren());
    }
    return result;
  }
}

class Node {
  String name;
  List<Node> children = new ArrayList<Node>();

  public Node(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public boolean hasChild() {
    return children.size() > 0;
  }

  public void addChild(Node child) {
    children.add(child);
  }

  public List<Node> getChildren() {
    return children;
  }

  public String toString() {
    return this.name;
  }
}

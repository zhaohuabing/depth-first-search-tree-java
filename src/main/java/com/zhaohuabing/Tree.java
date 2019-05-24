package com.zhaohuabing;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  Node root;

  public Tree(Node root) {
    this.root = root;
  }

  public void depthFirstSearch(Node node, List<Node> result) {
    result.add(node);
    if (!node.hasChild()) {
      return;
    }
    List<Node> children = node.getChildren();
    for (int i = 0; i < children.size(); i++) {
      depthFirstSearch(children.get(i), result);
    }
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

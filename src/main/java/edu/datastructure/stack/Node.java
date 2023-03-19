package edu.datastructure.stack;

public class Node {
    private int content;
    private Node referenceNode = null;

    public Node() {
    }

    public Node(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public Node getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node referenceNode) {
        this.referenceNode = referenceNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}

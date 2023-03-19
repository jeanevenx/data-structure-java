package edu.datastructure.stack;

public class Node<T> {
    private T content;
    private Node<T> referenceNode = null;

    public Node() {
    }

    public Node(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getReferenceNode() {
        return referenceNode;
    }

    public void setReferenceNode(Node<T> referenceNode) {
        this.referenceNode = referenceNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}

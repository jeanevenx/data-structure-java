package edu.datastructure.stack;

public class Stack {
    Node top = null;

    public boolean isEmpty(){
        return top == null ? true : false;
    }

    public void push(Node newNode){
        Node temporaryTop = top;

        top = newNode;
        top.setReferenceNode(temporaryTop);
    }

}

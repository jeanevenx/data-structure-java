package edu.datastructure.stack;

public class Stack<T> {
    private Node top = null;
    private int length = 0;


    public int size(){
        return this.length;
    }
    public boolean isEmpty(){
        return top == null ? true : false;
    }

    public void push(T content){
        Node<T> newNode = new Node<>(content);
        Node<T> temporaryTop = top;
        top = newNode;
        top.setReferenceNode(temporaryTop);
        length++;
    }

    public Node pop(){

        if(!isEmpty()){
            Node poppedNode = top;
            top = top.getReferenceNode();
            length--;
            return poppedNode;
        }

        return null;

    }

    @Override
    public String toString() {
        String printedString = "-----------------\n";
        printedString += "   Stack\n";
        printedString += "-----------------\n";
        Node temporaryNode = top;
        while(true){
            if(temporaryNode != null){
                printedString += "[Node{Content=" + temporaryNode.getContent() + "}]\n";
                temporaryNode = temporaryNode.getReferenceNode();
            }else{
                break;
            }
        }
        printedString += "======================";
        return printedString;
    }

}

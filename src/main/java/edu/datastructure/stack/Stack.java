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

    public Node pop(){

        if(!isEmpty()){
            Node poppedNode = top;
            top = top.getReferenceNode();
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
        printedString += "============";
        return printedString;
    }

}

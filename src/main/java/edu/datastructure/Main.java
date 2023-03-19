package edu.datastructure;

import edu.datastructure.stack.Node;
import edu.datastructure.stack.Stack;

public class Main {
    public static void main(String[] args) {

       Stack<String> myStack = new Stack();

       myStack.push("First content");
       myStack.push("Second content");
       myStack.push("Third content");
       myStack.push("Fourth content");


       System.out.println("Size: " + myStack.size());

       System.out.println(myStack.pop());
       System.out.println("Size: " + myStack.size());

       myStack.push("fifth content");
       System.out.println(myStack);
       System.out.println("Size: " + myStack.size());



    }
}
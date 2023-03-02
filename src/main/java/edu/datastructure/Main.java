package edu.datastructure;

import edu.datastructure.no.No;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Nó 1");
        No<String> no2 = new No<>("145");
        No<String> no3 = new No<>("Nó 3");

        no1.setProximo(no2);
        no2.setProximo(no3);



        System.out.println(no1);
        System.out.println(no1.getProximo());
        System.out.println(no1.getProximo().getProximo());




    }
}
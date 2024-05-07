package org.example;

public class Main {

    public static void printCaesar(String text){
        System.out.println(Caesar.encrypt(text, 1));
    }

    public static void main(String[] args) {
        printCaesar("hello");
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        MultithreadThing myThread = new MultithreadThing();
        MultithreadThing myThread2 = new MultithreadThing();

        myThread.start();
        myThread2.start();
    }
}
package ru.spb.kupchinolab.otus.online_master;

public class BadBenchmark {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Algorithm.sum();
        System.out.println((System.nanoTime() - startTime) / 1000 / 1000);
    }

}

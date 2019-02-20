package ru.spb.kupchinolab.otus.online_master;

class Algorithm {

    final static private long N = 100000000L;

    static void sum() {
        long result = 0;
        for (long i = 1; i <= N; i++) {
            result += i;
        }
    }

    static long sumAndResult() {
        long result = 0;
        for (long i = 1; i <= N; i++) {
            result += i;
        }
        return result;
    }


}

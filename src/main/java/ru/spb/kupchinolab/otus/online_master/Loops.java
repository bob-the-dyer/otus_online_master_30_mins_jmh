package ru.spb.kupchinolab.otus.online_master;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*TODO hint*/
public class Loops {

    private int N = 1000000;

    private List<String> DATA_FOR_TESTING = createData();

    public void loopFor(/*TODO hint*/) {
        for (int i = 0; i < DATA_FOR_TESTING.size(); i++) {
            String s = DATA_FOR_TESTING.get(i);
            /*TODO hint*/
        }
    }

    /*TODO hint*/
    public void loopWhile(/*TODO hint*/) {
        int i = 0;
        while (i < DATA_FOR_TESTING.size()) {
            String s = DATA_FOR_TESTING.get(i);
            /*TODO hint*/
            i++;
        }
    }

    public void loopForEach(/*TODO hint*/) {
        for (String s : DATA_FOR_TESTING) {
            /*TODO hint*/
        }
    }

    public void loopIterator(/*TODO hint*/) {
        Iterator<String> iterator = DATA_FOR_TESTING.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            /*TODO hint*/
        }
    }

    private List<String> createData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            data.add("Number : " + i);
        }
        return data;
    }

}
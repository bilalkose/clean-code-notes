package main.java.com.bilalkose.cleancode.ch2_meaningful_names.c01;

import java.util.ArrayList;
import java.util.List;

public class BadNaming {
    int d; //elapsed time in day

    public List<int[]> getThem(int[][] theList){
        List<int[]> list1 = new ArrayList<>();
        for(int[] x : theList)
            if(x[0] == 4)
                list1.add(x);
        return list1;
    }

    //Bu kod düz yazı okur gibi okunabilir hale olmalıdır. theList? list1?
}

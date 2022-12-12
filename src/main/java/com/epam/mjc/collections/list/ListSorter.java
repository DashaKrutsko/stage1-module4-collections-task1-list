package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public static void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer x = Integer.parseInt(a);
        Integer y = Integer.parseInt(b);
        Integer z = x * x * 5 + 3;
        Integer w = y * y * 5 + 3;
        if (z.compareTo(w) == 0) {
            return x.compareTo(y);
        } else return z.compareTo(w);
    }

}


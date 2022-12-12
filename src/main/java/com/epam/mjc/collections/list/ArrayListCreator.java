package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> receiverList = new ArrayList<>();
        int i = 1;
        for (String iter : sourceList) {
            if (i % 3 == 0) {
                receiverList.add(iter);
                receiverList.add(iter);
            }
            i++;
        }
        return receiverList;
    }
}

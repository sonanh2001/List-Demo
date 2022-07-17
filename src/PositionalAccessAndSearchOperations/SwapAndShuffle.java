package PositionalAccessAndSearchOperations;

import java.util.List;
import java.util.Random;

public class SwapAndShuffle {
    public <Element> void swap(List<Element> arrayList, int i, int j) {
        Element temp = arrayList.get(i);
        arrayList.set(i, arrayList.get(j));
        arrayList.set(j, temp);
    }

    public void shuffle(List<?> arrayList, Random random) {
        for(int i = arrayList.size(); i > 1; i--) {
            swap(arrayList, i-1, random.nextInt(i));
        }
    }
}

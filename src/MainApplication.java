import java.util.ArrayList;
import java.util.Random;

import Iterators.IteratorDemo;
import PositionalAccessAndSearchOperations.SwapAndShuffle;
import Range_VIewOperation.SubListDemo;

public class MainApplication {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Sơn Anh");
        arrayList.add("Linh");
        arrayList.add("Đạt");
        arrayList.add("Hồng");
        arrayList.add("Toàn");
        IteratorDemo iteratorDemo = new IteratorDemo();
        iteratorDemo.printList(arrayList);
        iteratorDemo.printListReverse(arrayList);
        SwapAndShuffle swapAndShuffle = new SwapAndShuffle();
        swapAndShuffle.shuffle(arrayList, new Random());
        System.out.println(arrayList);
        SubListDemo subListDemo = new SubListDemo();
        subListDemo.printSubList(arrayList, 1, 4);
        subListDemo.deleteSublistFromList(arrayList, 1, 4);
        System.out.println(arrayList);
    }
}

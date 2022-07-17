package Iterators;

import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public void printList(List<?> list) {
        for (ListIterator<?> listIterator = list.listIterator(); listIterator.hasNext();) {
            System.out.println(listIterator.next());
        }
    }
    public void printListReverse(List<?> list) {
        for (ListIterator<?> listIterator = list.listIterator(list.size()); listIterator.hasPrevious();) {
            System.out.println(listIterator.previous());
        }
    }

}

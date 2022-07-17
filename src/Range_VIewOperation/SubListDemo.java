package Range_VIewOperation;

import java.util.List;

public class SubListDemo {
    public void printSubList(List<?> list , int start, int end) {
        System.out.println(list.subList(start-1, end - 1));
    }
    public void deleteSublistFromList(List<?> list, int start, int end) {
        list.subList(start - 1, end - 1).clear();
    }
}

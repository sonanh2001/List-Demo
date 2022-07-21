package util;

import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListUtil {

  /**
   * print sublist of list
   * @param list
   * @param startIndex
   * @param endIndex
   * @param <Object>
   */
  public static <Object> void printSublist(List<Object> list,int startIndex, int endIndex) {
    System.out.println(list.subList(startIndex, endIndex));
  }

  /**
   * delete sublist from list
   * @param list
   * @param startIndex
   * @param endIndex
   * @param <Object>
   */
  public static <Object> void deleteSublistFromList(List<Object> list, int startIndex, int endIndex) {
    list.subList(startIndex, endIndex).clear();
  }

  /**
   * use iterator to print list
   * @param list
   * @param <Object>
   */
  public static <Object> void printList(List<Object> list) {
    ListIterator<Object> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }
  }

  /**
   * use iterator to print list by reverse
   * @param list
   * @param <Object>
   */
  public static <Object> void printListReverse(List<Object> list) {
    ListIterator<Object> listIterator = list.listIterator(list.size());
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }
  }
  /**
   * swap 2 element in list
   * @param list
   * @param firstSwapIndex
   * @param secondSwapIndex
   * @param <Object>
   */
  public static <Object> void swap(List<Object> list, int firstSwapIndex, int secondSwapIndex) {
    Object temp = list.get(firstSwapIndex);
    list.set(firstSwapIndex, list.get(secondSwapIndex));
    list.set(secondSwapIndex, temp);
  }

  /**
   * shuffle the list
   *
   * @param list
   * @param random
   * @param <Object>
   */
  public static <Object> void shuffle(List<Object> list, Random random) {
    for (int i = list.size() - 1; i > 0; i--) {
      swap(list, i, random.nextInt(i));
    }
  }
}

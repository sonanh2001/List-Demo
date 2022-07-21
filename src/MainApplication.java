import static util.ListUtil.deleteSublistFromList;
import static util.ListUtil.printList;
import static util.ListUtil.printListReverse;
import static util.ListUtil.printSublist;
import static util.ListUtil.shuffle;

import java.util.List;

import java.util.ArrayList;
import java.util.Random;

public class MainApplication {
  public static void main(String[] args) {

    var names = initArrList();

    printList(names);
    printListReverse(names);

    shuffle(names, new Random());
    System.out.println(names);

    printSublist(names, 1, 4);
    deleteSublistFromList(names, 1, 4);
    System.out.println(names);
  }

  private static List<String> initArrList() {
    ArrayList<String> names = new ArrayList<>();
    names.add("Sơn Anh");
    names.add("Linh");
    names.add("Đạt");
    names.add("Hồng");
    names.add("Toàn");
    return names;
  }
}

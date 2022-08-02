package test;

import java.util.*;

public class CollectionListTest {

    public static List<String> arrayListTest() {
        List<String> strList1 = new ArrayList<>();

        strList1.add("apple");
        strList1.add("banana");
        strList1.add("cat");
        strList1.add("dog");

        int list1HashCode = strList1.hashCode();

        strList1.set(3, "anotherCat");

        return strList1;
    }

    public static void linkedListTest() {
        List<String> strList2 = new LinkedList<>();

    }

    public static void stackTest() {
        List<String> strList3 = new Stack<>();

    }

    public static void main(String[] args) {
        System.out.println(arrayListTest().subList(0,4));
    }
}

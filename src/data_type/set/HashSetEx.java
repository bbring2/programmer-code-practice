package data_type.set;


import java.util.*;
import java.util.stream.Collectors;

public class HashSetEx {

    static Set<String> hashSet = new HashSet<>();
    static Set<String> treeSet = new TreeSet<>();

    public static Set<String> testHashSet () {
        hashSet.add("11");
        hashSet.add("11");
        hashSet.add("21");
        hashSet.add("99");
        hashSet.add("101");
        hashSet.add("21");

        return hashSet;
    }

    public static Set<String> testTreeSet() {
        treeSet.add("가나다");
        treeSet.add("나머지");
        treeSet.add("다주거");
        treeSet.add("라저디");
        treeSet.add("말아라");

        return treeSet;
    }

    public static void main(String[] args) {
        System.out.println(testHashSet());
        System.out.println(testHashSet().stream().sorted().collect(Collectors.toList()));
        System.out.println(testHashSet().stream().sorted().findAny());
        System.out.println(Arrays.toString(testTreeSet().toArray()));
    }
}

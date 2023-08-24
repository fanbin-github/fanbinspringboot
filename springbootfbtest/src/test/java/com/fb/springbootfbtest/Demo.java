package com.fb.springbootfbtest;

import java.util.*;

public class Demo {

    final int bb = 3;

    public static void main(String[] args) {

        final int a = 1;
        String ss = "123";


        List<String> list = new ArrayList<>();
        list.add("213");
        list.add("12");
        list.add("4565");
        list.forEach(s -> System.out.println(s));

/*        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });*/

        list.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "aa");
        map.put("2", "bb");
        map.forEach((s, s2) -> System.out.println(s + " " + s2));
    }
}

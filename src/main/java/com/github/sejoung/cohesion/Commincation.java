package com.github.sejoung.cohesion;

import java.util.ArrayList;
import java.util.List;

/**
 * 대화 통신 결합 대화를 하는것 같다.
 */
public class Commincation {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("c");

        System.out.println(list.get(0));

        System.out.println(list.remove(0));


    }
}

package com.github.sejoung.coupling.control;

public class ControlTest {
    public static void main(String[] args) throws Exception {


        GoControl go = new GoControl(new Control());
        System.out.println(go.gogo(3));

    }
}
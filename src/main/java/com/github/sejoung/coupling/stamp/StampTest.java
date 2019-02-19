package com.github.sejoung.coupling.stamp;

public class StampTest {
    public static void main(String[] args) {
        Data data = new Data();
        data.setAge(38);
        data.setName("김세중");
        StampCode.printAge(data);
        StampCode.printName(data);
    }
}

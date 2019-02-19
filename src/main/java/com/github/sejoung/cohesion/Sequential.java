package com.github.sejoung.cohesion;

/**
 * 실행순서에 의한
 */
public class Sequential {

    public String select(){
        lock();
        getData();
        unlock();
        return "조회";
    }

    private void lock(){

    }

    private void getData(){

    }

    private void unlock(){

    }
}

package com.github.sejoung.coupling.data;

public class DataCode2 {
    private DataCode dataCode;

    private int counter;

    public DataCode2(DataCode dataCode){
        this.dataCode = dataCode;
        this.counter = 0;
    }

    public void count(){
        this.counter = this.dataCode.count(this.counter);
    }

    public int getCounter(){
        return this.counter;
    }
}

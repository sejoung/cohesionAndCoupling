package com.github.sejoung.coupling.common;

public class FreqABTest {

    private static int freqAbtestType;

    public static void setFreqAbtestType(int freqAbtestType) throws InterruptedException {
        FreqABTest.freqAbtestType = freqAbtestType;
    }

    public static int getFreqAbtestType(){
        return FreqABTest.freqAbtestType;
    }
}

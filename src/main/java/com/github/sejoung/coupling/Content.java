package com.github.sejoung.coupling;

/**
 * 내용결합
 */
public class Content {

    static class A {
        public String a;
        A(String a){
            this.a = a;
        }

    }

    static class B {
        private String b;
        B(A a){
            this.b = a.a;
        }

    }

    public static void main(String[] args) {

        B b = new B(new A("메롱"));

    }

}

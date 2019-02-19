package com.github.sejoung.coupling.control;

public class GoControl {
    private Control control;

    public GoControl(Control control) {
        this.control = control;
    }

    public String gogo(int i) throws Exception {
        String returnStr = this.control.process(i);
        if ("A".equals(returnStr)) {
            return "배곱";
        } else if ("B".equals(returnStr)) {
            return "안녕";
        } else if ("C".equals(returnStr)) {
            return "덥다";
        } else {
            throw new Exception("에러닷");
        }
    }

}


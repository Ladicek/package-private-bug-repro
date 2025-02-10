package com.example.one;

public abstract class Parent {
    private final MyBean myBean;

    protected Parent(MyBean myBean) {
        this.myBean = myBean;
    }

    /*public*/ MyBean getMyBean() {
        return myBean;
    }
}

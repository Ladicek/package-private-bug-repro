package com.example.one;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Consumer {
    private final Parent parent;

    public Consumer(Parent parent) {
        this.parent = parent;
    }

    public String hello() {
        return parent.getMyBean().hello();
    }
}

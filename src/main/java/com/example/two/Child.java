package com.example.two;

import com.example.one.MyBean;
import com.example.one.Parent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
class Child extends Parent {
    Child() {
        super(null);
    }

    @Inject
    Child(MyBean myBean) {
        super(myBean);
    }
}

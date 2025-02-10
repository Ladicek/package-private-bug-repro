package com.example;

import com.example.one.Consumer;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class ConsumerTest {
    @Inject
    Consumer consumer;

    @Test
    public void hello() {
        assertEquals("hello", consumer.hello());
    }
}

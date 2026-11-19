package com.saatvik.studentapp;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class MyTest {
    @Test
    void testToFail() {
        fail("Failing this test intentionally");
    }
}
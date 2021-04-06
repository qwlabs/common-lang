package com.qwlabs.lang;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class S2Test {
    @Test
    void should_isEmpty() {
        assertTrue(S2.isEmpty(null));
        assertTrue(S2.isEmpty(""));
        assertFalse(S2.isEmpty(" "));
        assertFalse(S2.isEmpty("a"));
    }

    @Test
    void should_isNotEmpty() {
        assertFalse(S2.isNotEmpty(null));
        assertFalse(S2.isNotEmpty(""));
        assertTrue(S2.isNotEmpty(" "));
        assertTrue(S2.isNotEmpty("a"));
    }

    @Test
    void should_isBlank() {
        assertTrue(S2.isBlank(null));
        assertTrue(S2.isBlank(""));
        assertTrue(S2.isBlank(" "));
        assertFalse(S2.isBlank("a"));
    }

    @Test
    void should_isNotBlank() {
        assertFalse(S2.isNotBlank(null));
        assertFalse(S2.isNotBlank(""));
        assertFalse(S2.isNotBlank(" "));
        assertTrue(S2.isNotBlank("a"));
    }
}

package com.qwlabs.lang;

import java.util.function.Consumer;

public final class F2 {
    private F2() {
    }

    public static <E> void ifNotPresent(E value, Consumer<E> consumer) {
        if (value == null) {
            consumer.accept(null);
        }
    }

    public static <E> void ifPresent(E value, Consumer<E> consumer) {
        if (value != null) {
            consumer.accept(value);
        }
    }
}

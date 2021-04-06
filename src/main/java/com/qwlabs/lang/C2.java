package com.qwlabs.lang;

import java.util.Collection;
import java.util.Map;
import java.util.function.Consumer;

public final class C2 {
    private C2() {
    }

    public static <E> boolean isEmpty(Collection<E> c) {
        return c == null || c.isEmpty();
    }

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <E> boolean isNotEmpty(Collection<E> c) {
        return !isEmpty(c);
    }

    public static <K, V> boolean isNotEmpty(Map<K, V> map) {
        return !isEmpty(map);
    }

    public static <E> void ifEmpty(Collection<E> value, EmptyConsumer consumer) {
        if (isEmpty(value)) {
            consumer.accept();
        }
    }

    public static <K, V> void ifEmpty(Map<K, V> value, EmptyConsumer consumer) {
        if (isEmpty(value)) {
            consumer.accept();
        }
    }

    public static <E> void ifNotEmpty(Collection<E> value, EmptyConsumer consumer) {
        if (isNotEmpty(value)) {
            consumer.accept();
        }
    }

    public static <K, V> void ifNotEmpty(Map<K, V> value, EmptyConsumer consumer) {
        if (isNotEmpty(value)) {
            consumer.accept();
        }
    }

    public static <K, V, M extends Map<K, V>> void ifNotEmpty(M value, Consumer<M> consumer) {
        if (isNotEmpty(value)) {
            consumer.accept(value);
        }
    }
}

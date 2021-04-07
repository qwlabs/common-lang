package com.qwlabs.lang;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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

    public static <E> void ifEmpty(Collection<E> c, EmptyConsumer consumer) {
        if (isEmpty(c)) {
            consumer.accept();
        }
    }

    public static <K, V> void ifEmpty(Map<K, V> map, EmptyConsumer consumer) {
        if (isEmpty(map)) {
            consumer.accept();
        }
    }

    public static <E, C extends Collection<E>, R> Optional<R> ifEmpty(C c, Supplier<R> supplier) {
        if (isEmpty(c)) {
            return Optional.ofNullable(supplier.get());
        }
        return Optional.empty();
    }

    public static <K, V, M extends Map<K, V>, R> Optional<R> ifEmpty(M map, Supplier<R> supplier) {
        if (isEmpty(map)) {
            return Optional.ofNullable(supplier.get());
        }
        return Optional.empty();
    }

    public static <E> void ifNotEmpty(Collection<E> c, EmptyConsumer consumer) {
        if (isNotEmpty(c)) {
            consumer.accept();
        }
    }

    public static <K, V> void ifNotEmpty(Map<K, V> map, EmptyConsumer consumer) {
        if (isNotEmpty(map)) {
            consumer.accept();
        }
    }

    public static <E, C extends Collection<E>> void ifNotEmpty(C c, Consumer<C> consumer) {
        if (isNotEmpty(c)) {
            consumer.accept(c);
        }
    }

    public static <K, V, M extends Map<K, V>> void ifNotEmpty(M map, Consumer<M> consumer) {
        if (isNotEmpty(map)) {
            consumer.accept(map);
        }
    }

    public static <E, C extends Collection<E>, R> Optional<R> ifNotEmpty(C c, Supplier<R> supplier) {
        if (isNotEmpty(c)) {
            return Optional.ofNullable(supplier.get());
        }
        return Optional.empty();
    }

    public static <K, V, M extends Map<K, V>, R> Optional<R> ifNotEmpty(M map, Supplier<R> supplier) {
        if (isNotEmpty(map)) {
            return Optional.ofNullable(supplier.get());
        }
        return Optional.empty();
    }

    public static <E, C extends Collection<E>, R> Optional<R> ifNotEmpty(C c, Function<C, R> mapper) {
        if (isNotEmpty(c)) {
            return Optional.ofNullable(mapper.apply(c));
        }
        return Optional.empty();
    }

    public static <K, V, M extends Map<K, V>, R> Optional<R> ifNotEmpty(M map, Function<M, R> mapper) {
        if (isNotEmpty(map)) {
            return Optional.ofNullable(mapper.apply(map));
        }
        return Optional.empty();
    }
}

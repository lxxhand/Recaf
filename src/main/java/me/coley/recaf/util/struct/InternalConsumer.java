package me.coley.recaf.util.struct;

import me.coley.recaf.plugin.api.InternalApi;
import me.coley.recaf.util.InternalElement;

import java.util.function.Consumer;

/**
 * Internal listener for Recaf purposes.
 *
 * @author xxDark
 */
@InternalApi
@FunctionalInterface
public interface InternalConsumer<T> extends Consumer<T>, InternalElement {

    /**
     * Wraps consumer into internal listener.
     *
     * @param consumer
     *      Original consumer.
     * @return
     *      Consumer wrapped into internal listener.
     */
    static <T> InternalConsumer<T> internal(Consumer<T> consumer) {
        return consumer::accept;
    }
}

package kb;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public interface q<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    @CanIgnoreReturnValue
    boolean put(@NullableDecl K k10, @NullableDecl V v2);

    int size();

    Collection<V> values();
}

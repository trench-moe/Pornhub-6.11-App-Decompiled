package ba;

import d9.a;
import h9.m;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f3624b = new a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            Objects.requireNonNull((a) obj);
            return m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null) && m.a(null, null);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}

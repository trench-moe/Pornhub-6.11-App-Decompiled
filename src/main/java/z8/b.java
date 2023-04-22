package z8;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f21915a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            return this.f21915a == bVar.f21915a;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.f21915a), 0, 0, 0, Boolean.FALSE});
    }
}

package z8;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            Objects.requireNonNull((a) obj);
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = 0;
        return num.hashCode();
    }
}

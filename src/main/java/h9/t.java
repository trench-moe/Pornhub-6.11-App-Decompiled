package h9;

import d9.a;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class t implements a.d {

    /* renamed from: c  reason: collision with root package name */
    public static final t f10377c = new t(null);

    /* renamed from: b  reason: collision with root package name */
    public final String f10378b = null;

    public /* synthetic */ t(String str) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            return m.a(this.f10378b, ((t) obj).f10378b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10378b});
    }
}

package j8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f11643a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f11644b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f11644b == null) {
                this.f11644b = Collections.unmodifiableMap(new HashMap(this.f11643a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11644b;
    }
}

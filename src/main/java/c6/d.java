package c6;

import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements h5.b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f3765b;

    public d(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f3765b = obj;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f3765b.toString().getBytes(h5.b.f10146a));
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3765b.equals(((d) obj).f3765b);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        return this.f3765b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ObjectKey{object=");
        m10.append(this.f3765b);
        m10.append('}');
        return m10.toString();
    }
}

package l6;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final i6.b f12303a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12304b;

    public l(i6.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f12303a = bVar;
        this.f12304b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f12303a.equals(lVar.f12303a)) {
                return Arrays.equals(this.f12304b, lVar.f12304b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12303a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12304b);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("EncodedPayload{encoding=");
        m10.append(this.f12303a);
        m10.append(", bytes=[...]}");
        return m10.toString();
    }
}

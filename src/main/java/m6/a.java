package m6;

import java.util.Arrays;
import l6.m;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<m> f12911a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f12912b;

    public a(Iterable iterable, byte[] bArr, C0211a c0211a) {
        this.f12911a = iterable;
        this.f12912b = bArr;
    }

    @Override // m6.e
    public Iterable<m> a() {
        return this.f12911a;
    }

    @Override // m6.e
    public byte[] b() {
        return this.f12912b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f12911a.equals(eVar.a())) {
                if (Arrays.equals(this.f12912b, eVar instanceof a ? ((a) eVar).f12912b : eVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12911a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f12912b);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("BackendRequest{events=");
        m10.append(this.f12911a);
        m10.append(", extras=");
        m10.append(Arrays.toString(this.f12912b));
        m10.append("}");
        return m10.toString();
    }
}

package xb;

import java.util.Arrays;
import xb.a0;

/* loaded from: classes2.dex */
public final class f extends a0.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final String f18229a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f18230b;

    public f(String str, byte[] bArr, a aVar) {
        this.f18229a = str;
        this.f18230b = bArr;
    }

    @Override // xb.a0.d.a
    public byte[] a() {
        return this.f18230b;
    }

    @Override // xb.a0.d.a
    public String b() {
        return this.f18229a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d.a) {
            a0.d.a aVar = (a0.d.a) obj;
            if (this.f18229a.equals(aVar.b())) {
                if (Arrays.equals(this.f18230b, aVar instanceof f ? ((f) aVar).f18230b : aVar.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18229a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18230b);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("File{filename=");
        m10.append(this.f18229a);
        m10.append(", contents=");
        m10.append(Arrays.toString(this.f18230b));
        m10.append("}");
        return m10.toString();
    }
}

package j7;

import android.util.Log;
import java.util.UUID;
import k8.t;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class h {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f11511a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11512b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11513c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f11511a = uuid;
            this.f11512b = i10;
            this.f11513c = bArr;
        }
    }

    public static a a(byte[] bArr) {
        t tVar = new t(bArr);
        if (tVar.f12011c < 32) {
            return null;
        }
        tVar.D(0);
        if (tVar.f() == tVar.a() + 4 && tVar.f() == 1886614376) {
            int f10 = (tVar.f() >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
            if (f10 > 1) {
                a0.a.p(37, "Unsupported pssh version: ", f10, "PsshAtomUtil");
                return null;
            }
            UUID uuid = new UUID(tVar.m(), tVar.m());
            if (f10 == 1) {
                tVar.E(tVar.v() * 16);
            }
            int v2 = tVar.v();
            if (v2 != tVar.a()) {
                return null;
            }
            byte[] bArr2 = new byte[v2];
            System.arraycopy(tVar.f12009a, tVar.f12010b, bArr2, 0, v2);
            tVar.f12010b += v2;
            return new a(uuid, f10, bArr2);
        }
        return null;
    }

    public static byte[] b(byte[] bArr, UUID uuid) {
        a a10 = a(bArr);
        if (a10 == null) {
            return null;
        }
        if (uuid.equals(a10.f11511a)) {
            return a10.f11513c;
        }
        String valueOf = String.valueOf(uuid);
        String valueOf2 = String.valueOf(a10.f11511a);
        StringBuilder n = a0.a.n(valueOf2.length() + valueOf.length() + 33, "UUID mismatch. Expected: ", valueOf, ", got: ", valueOf2);
        n.append(".");
        Log.w("PsshAtomUtil", n.toString());
        return null;
    }
}

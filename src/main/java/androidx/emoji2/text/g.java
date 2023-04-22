package androidx.emoji2.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g {
    public static final ThreadLocal<y0.a> d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1962a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1963b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1964c = 0;

    public g(m mVar, int i10) {
        this.f1963b = mVar;
        this.f1962a = i10;
    }

    public int a(int i10) {
        y0.a e10 = e();
        int a10 = e10.a(16);
        if (a10 != 0) {
            ByteBuffer byteBuffer = e10.f18382b;
            int i11 = a10 + e10.f18381a;
            return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
        }
        return 0;
    }

    public int b() {
        y0.a e10 = e();
        int a10 = e10.a(16);
        if (a10 != 0) {
            int i10 = a10 + e10.f18381a;
            return e10.f18382b.getInt(e10.f18382b.getInt(i10) + i10);
        }
        return 0;
    }

    public short c() {
        y0.a e10 = e();
        int a10 = e10.a(14);
        if (a10 != 0) {
            return e10.f18382b.getShort(a10 + e10.f18381a);
        }
        return (short) 0;
    }

    public int d() {
        y0.a e10 = e();
        int a10 = e10.a(4);
        if (a10 != 0) {
            return e10.f18382b.getInt(a10 + e10.f18381a);
        }
        return 0;
    }

    public final y0.a e() {
        ThreadLocal<y0.a> threadLocal = d;
        y0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new y0.a();
            threadLocal.set(aVar);
        }
        y0.b bVar = this.f1963b.f1992a;
        int i10 = this.f1962a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f18381a;
            int i12 = (i10 * 4) + bVar.f18382b.getInt(i11) + i11 + 4;
            aVar.b(bVar.f18382b.getInt(i12) + i12, bVar.f18382b);
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(d()));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}

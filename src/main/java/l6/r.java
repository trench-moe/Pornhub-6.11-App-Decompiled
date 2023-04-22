package l6;

import a9.c0;
import android.os.Parcel;
import java.util.Set;
import u8.l0;

/* loaded from: classes2.dex */
public final class r implements com.google.android.exoplayer2.source.l, e9.l {

    /* renamed from: c  reason: collision with root package name */
    public final Object f12309c;

    /* renamed from: f  reason: collision with root package name */
    public Object f12310f;

    /* renamed from: j  reason: collision with root package name */
    public Object f12311j;

    public /* synthetic */ r(c7.l lVar) {
        this.f12309c = lVar;
    }

    public /* synthetic */ r(Object obj, Object obj2, Object obj3) {
        this.f12309c = obj;
        this.f12310f = obj2;
        this.f12311j = obj3;
    }

    public long a() {
        Object obj = this.f12311j;
        if (((c7.i) obj) != null) {
            return ((c7.i) obj).getPosition();
        }
        return -1L;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        l0 l0Var = (l0) this.f12309c;
        l0Var.g();
        a9.f fVar = (a9.f) ((c0) obj).getService();
        Parcel a12 = fVar.a1();
        a12.writeString((String) this.f12310f);
        a12.writeString((String) this.f12311j);
        t9.v.b(a12, null);
        fVar.d1(14, a12);
        l0Var.i((ea.h) obj2);
    }

    public i6.e b(String str, i6.b bVar, i6.d dVar) {
        if (((Set) this.f12309c).contains(bVar)) {
            return new t((q) this.f12310f, str, bVar, dVar, (u) this.f12311j);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, (Set) this.f12309c));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(j8.d r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, c7.j r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.r.c(j8.d, android.net.Uri, java.util.Map, long, long, c7.j):void");
    }
}

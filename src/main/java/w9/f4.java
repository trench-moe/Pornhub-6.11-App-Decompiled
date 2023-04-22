package w9;

import android.content.Context;

/* loaded from: classes2.dex */
public final class f4 extends u4 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17133a;

    /* renamed from: b  reason: collision with root package name */
    public final x4 f17134b;

    public f4(Context context, x4 x4Var) {
        this.f17133a = context;
        this.f17134b = x4Var;
    }

    @Override // w9.u4
    public final Context a() {
        return this.f17133a;
    }

    @Override // w9.u4
    public final x4 b() {
        return this.f17134b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r9.b() == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r4 = 1
            r0 = r4
            if (r9 != r8) goto L5
            return r0
        L5:
            r5 = 4
            boolean r1 = r9 instanceof w9.u4
            r2 = 0
            r7 = 6
            if (r1 == 0) goto L33
            w9.u4 r9 = (w9.u4) r9
            android.content.Context r1 = r8.f17133a
            android.content.Context r3 = r9.a()
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L33
            w9.x4 r1 = r8.f17134b
            if (r1 != 0) goto L27
            r7 = 7
            w9.x4 r9 = r9.b()
            if (r9 != 0) goto L33
            goto L32
        L27:
            w9.x4 r9 = r9.b()
            boolean r9 = r1.equals(r9)
            if (r9 != 0) goto L32
            goto L34
        L32:
            return r0
        L33:
            r7 = 2
        L34:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.f4.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f17133a.hashCode() ^ 1000003) * 1000003;
        x4 x4Var = this.f17134b;
        return hashCode ^ (x4Var == null ? 0 : x4Var.hashCode());
    }

    public final String toString() {
        String obj = this.f17133a.toString();
        String valueOf = String.valueOf(this.f17134b);
        StringBuilder sb2 = new StringBuilder(obj.length() + 46 + valueOf.length());
        android.support.v4.media.a.o(sb2, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}

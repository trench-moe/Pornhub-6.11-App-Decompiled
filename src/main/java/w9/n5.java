package w9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n5 {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final l7 f17248a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17249b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17250c;

    static {
        new n5(true);
    }

    public n5() {
        this.f17248a = new f7(16);
    }

    public n5(boolean z10) {
        f7 f7Var = new f7(0);
        this.f17248a = f7Var;
        if (!this.f17249b) {
            f7Var.a();
            this.f17249b = true;
        }
        if (this.f17249b) {
            return;
        }
        f7Var.a();
        this.f17249b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(w9.m5 r8, java.lang.Object r9) {
        /*
            com.google.android.gms.internal.measurement.zzmr r4 = r8.zzb()
            r0 = r4
            java.nio.charset.Charset r1 = w9.b6.f17081a
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.measurement.zzmr r1 = com.google.android.gms.internal.measurement.zzmr.f7086c
            r7 = 5
            com.google.android.gms.internal.measurement.zzms r1 = com.google.android.gms.internal.measurement.zzms.INT
            com.google.android.gms.internal.measurement.zzms r4 = r0.b()
            r0 = r4
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L4f;
                case 1: goto L4b;
                case 2: goto L46;
                case 3: goto L41;
                case 4: goto L3b;
                case 5: goto L37;
                case 6: goto L2c;
                case 7: goto L25;
                case 8: goto L1f;
                default: goto L1d;
            }
        L1d:
            r6 = 3
            goto L56
        L1f:
            boolean r0 = r9 instanceof w9.s6
            if (r0 == 0) goto L56
            r5 = 5
            goto L55
        L25:
            r5 = 6
            boolean r0 = r9 instanceof java.lang.Integer
            if (r0 == 0) goto L56
            r5 = 3
            goto L55
        L2c:
            r7 = 7
            boolean r0 = r9 instanceof com.google.android.gms.internal.measurement.zzix
            if (r0 != 0) goto L54
            r5 = 5
            boolean r0 = r9 instanceof byte[]
            if (r0 == 0) goto L56
            goto L55
        L37:
            boolean r0 = r9 instanceof java.lang.String
            r5 = 1
            goto L51
        L3b:
            r7 = 1
            boolean r0 = r9 instanceof java.lang.Boolean
            java.lang.String r5 = "Ⓢⓜⓞⓑ⓸⓺"
            goto L51
        L41:
            r6 = 3
            boolean r0 = r9 instanceof java.lang.Double
            r5 = 4
            goto L51
        L46:
            r5 = 5
            boolean r0 = r9 instanceof java.lang.Float
            r6 = 7
            goto L51
        L4b:
            boolean r0 = r9 instanceof java.lang.Long
            r5 = 4
            goto L51
        L4f:
            boolean r0 = r9 instanceof java.lang.Integer
        L51:
            if (r0 == 0) goto L56
            r5 = 4
        L54:
            r7 = 1
        L55:
            return
        L56:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            r7 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 5
            r2 = 0
            int r3 = r8.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r4 = 1
            r2 = r4
            com.google.android.gms.internal.measurement.zzmr r8 = r8.zzb()
            com.google.android.gms.internal.measurement.zzms r8 = r8.b()
            r1[r2] = r8
            r4 = 2
            r8 = r4
            java.lang.Class r9 = r9.getClass()
            java.lang.String r4 = r9.getName()
            r9 = r4
            r1[r8] = r9
            r7 = 6
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            r8 = r4
            java.lang.String r4 = java.lang.String.format(r8, r1)
            r8 = r4
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.n5.b(w9.m5, java.lang.Object):void");
    }

    public final void a(m5 m5Var, Object obj) {
        if (!m5Var.a()) {
            b(m5Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(m5Var, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f17248a.put(m5Var, obj);
    }

    public final Object clone() {
        n5 n5Var = new n5();
        for (int i10 = 0; i10 < this.f17248a.b(); i10++) {
            Map.Entry d10 = this.f17248a.d(i10);
            n5Var.a((m5) d10.getKey(), d10.getValue());
        }
        l7 l7Var = this.f17248a;
        for (Map.Entry entry : l7Var.f17227j.isEmpty() ? t9.j0.f15269w : l7Var.f17227j.entrySet()) {
            n5Var.a((m5) entry.getKey(), entry.getValue());
        }
        n5Var.f17250c = this.f17250c;
        return n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n5) {
            return this.f17248a.equals(((n5) obj).f17248a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17248a.hashCode();
    }
}

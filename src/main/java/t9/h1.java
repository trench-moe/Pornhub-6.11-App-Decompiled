package t9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t9.g1;

/* loaded from: classes2.dex */
public final class h1<T extends g1<T>> {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final c3<T, Object> f15239a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15240b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15241c;

    static {
        new h1(true);
    }

    public h1() {
        this.f15239a = new w2(16);
    }

    public h1(boolean z10) {
        w2 w2Var = new w2(0);
        this.f15239a = w2Var;
        if (!this.f15240b) {
            w2Var.a();
            this.f15240b = true;
        }
        if (this.f15240b) {
            return;
        }
        w2Var.a();
        this.f15240b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (r0 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(T r7, java.lang.Object r8) {
        /*
            r4 = r7
            com.google.android.gms.internal.cast.zzrs r6 = r4.zzb()
            r0 = r6
            java.nio.charset.Charset r1 = t9.t1.f15353a
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.Objects.requireNonNull(r8)
            com.google.android.gms.internal.cast.zzrs r1 = com.google.android.gms.internal.cast.zzrs.f6970c
            com.google.android.gms.internal.cast.zzrt r1 = com.google.android.gms.internal.cast.zzrt.INT
            r6 = 2
            com.google.android.gms.internal.cast.zzrt r0 = r0.b()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L50;
                case 1: goto L4c;
                case 2: goto L48;
                case 3: goto L44;
                case 4: goto L40;
                case 5: goto L3c;
                case 6: goto L32;
                case 7: goto L27;
                case 8: goto L1f;
                default: goto L1d;
            }
        L1d:
            r6 = 2
            goto L58
        L1f:
            r6 = 6
            boolean r0 = r8 instanceof t9.j2
            r6 = 3
            if (r0 == 0) goto L57
            r6 = 4
            goto L56
        L27:
            boolean r0 = r8 instanceof java.lang.Integer
            if (r0 != 0) goto L55
            r6 = 6
            boolean r0 = r8 instanceof t9.n1
            r6 = 4
            if (r0 == 0) goto L57
            goto L56
        L32:
            boolean r0 = r8 instanceof com.google.android.gms.internal.cast.zzoe
            if (r0 != 0) goto L55
            r6 = 5
            boolean r0 = r8 instanceof byte[]
            if (r0 == 0) goto L57
            goto L56
        L3c:
            r6 = 7
            boolean r0 = r8 instanceof java.lang.String
            goto L53
        L40:
            boolean r0 = r8 instanceof java.lang.Boolean
            r6 = 3
            goto L53
        L44:
            r6 = 6
            boolean r0 = r8 instanceof java.lang.Double
            goto L53
        L48:
            boolean r0 = r8 instanceof java.lang.Float
            r6 = 7
            goto L53
        L4c:
            boolean r0 = r8 instanceof java.lang.Long
            r6 = 5
            goto L53
        L50:
            r6 = 2
            boolean r0 = r8 instanceof java.lang.Integer
        L53:
            if (r0 == 0) goto L57
        L55:
            r6 = 4
        L56:
            return
        L57:
            r6 = 4
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            r6 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r6 = 0
            r2 = r6
            int r6 = r4.zza()
            r3 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r3 = r6
            r1[r2] = r3
            r6 = 4
            r2 = 1
            com.google.android.gms.internal.cast.zzrs r6 = r4.zzb()
            r4 = r6
            com.google.android.gms.internal.cast.zzrt r6 = r4.b()
            r4 = r6
            r1[r2] = r4
            r6 = 2
            r4 = r6
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r1[r4] = r8
            r6 = 6
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            r4 = r6
            java.lang.String r6 = java.lang.String.format(r4, r1)
            r4 = r6
            r0.<init>(r4)
            r6 = 3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.h1.b(t9.g1, java.lang.Object):void");
    }

    public final void a(T t2, Object obj) {
        if (!t2.a()) {
            b(t2, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b(t2, arrayList.get(i10));
            }
            obj = arrayList;
        }
        this.f15239a.put(t2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        h1 h1Var = new h1();
        for (int i10 = 0; i10 < this.f15239a.b(); i10++) {
            Map.Entry<T, Object> d10 = this.f15239a.d(i10);
            h1Var.a(d10.getKey(), d10.getValue());
        }
        c3<T, Object> c3Var = this.f15239a;
        for (Map.Entry entry : c3Var.f15198j.isEmpty() ? k0.f15281j : c3Var.f15198j.entrySet()) {
            h1Var.a((g1) entry.getKey(), entry.getValue());
        }
        h1Var.f15241c = this.f15241c;
        return h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1) {
            return this.f15239a.equals(((h1) obj).f15239a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15239a.hashCode();
    }
}

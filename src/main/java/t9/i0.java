package t9;

import android.os.Bundle;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i0 {
    public static final a9.b d = new a9.b("ApplicationAnalyticsUtils");

    /* renamed from: e  reason: collision with root package name */
    public static final String f15244e = "20.1.0";

    /* renamed from: a  reason: collision with root package name */
    public final String f15245a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, Integer> f15246b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Integer, Integer> f15247c;

    public i0(Bundle bundle, String str) {
        this.f15245a = str;
        this.f15246b = com.google.android.gms.internal.cast.p0.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.f15247c = com.google.android.gms.internal.cast.p0.a(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static void c(r0 r0Var, boolean z10) {
        o0 n = com.google.android.gms.internal.cast.i.n(r0Var.l());
        if (n.f15273j) {
            n.j();
            n.f15273j = false;
        }
        com.google.android.gms.internal.cast.i.r((com.google.android.gms.internal.cast.i) n.f15272f, z10);
        r0Var.n(n);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    @org.checkerframework.dataflow.qual.Pure
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.cast.m a(t9.h0 r9, int r10) {
        /*
            r8 = this;
            r4 = r8
            t9.r0 r9 = r4.b(r9)
            com.google.android.gms.internal.cast.i r0 = r9.l()
            t9.o0 r0 = com.google.android.gms.internal.cast.i.n(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f15247c
            java.lang.String r6 = "null reference"
            r2 = r6
            if (r1 == 0) goto L32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r1 = r1.containsKey(r3)
            if (r1 != 0) goto L20
            r7 = 1
            goto L33
        L20:
            r7 = 4
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f15247c
            java.lang.Object r6 = r1.get(r3)
            r1 = r6
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.Objects.requireNonNull(r1, r2)
            int r1 = r1.intValue()
            goto L36
        L32:
            r6 = 1
        L33:
            int r1 = r10 + 10000
            r6 = 7
        L36:
            r0.l(r1)
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r4.f15246b
            r6 = 2
            if (r1 == 0) goto L5e
            r6 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r7 = r1.containsKey(r3)
            r1 = r7
            if (r1 != 0) goto L4b
            goto L5f
        L4b:
            r7 = 5
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r4.f15246b
            r6 = 5
            java.lang.Object r10 = r10.get(r3)
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.util.Objects.requireNonNull(r10, r2)
            int r7 = r10.intValue()
            r10 = r7
            goto L62
        L5e:
            r6 = 3
        L5f:
            int r10 = r10 + 10000
            r7 = 3
        L62:
            boolean r1 = r0.f15273j
            r6 = 7
            if (r1 == 0) goto L6f
            r6 = 2
            r0.j()
            r7 = 0
            r1 = r7
            r0.f15273j = r1
        L6f:
            MessageType extends com.google.android.gms.internal.cast.l1<MessageType, BuilderType> r1 = r0.f15272f
            com.google.android.gms.internal.cast.i r1 = (com.google.android.gms.internal.cast.i) r1
            com.google.android.gms.internal.cast.i.u(r1, r10)
            com.google.android.gms.internal.cast.l1 r10 = r0.c()
            com.google.android.gms.internal.cast.i r10 = (com.google.android.gms.internal.cast.i) r10
            r7 = 7
            r9.o(r10)
            com.google.android.gms.internal.cast.l1 r9 = r9.c()
            com.google.android.gms.internal.cast.m r9 = (com.google.android.gms.internal.cast.m) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.i0.a(t9.h0, int):com.google.android.gms.internal.cast.m");
    }

    public final r0 b(h0 h0Var) {
        long j10;
        r0 n = com.google.android.gms.internal.cast.m.n();
        long j11 = h0Var.f15234c;
        if (n.f15273j) {
            n.j();
            n.f15273j = false;
        }
        com.google.android.gms.internal.cast.m.u((com.google.android.gms.internal.cast.m) n.f15272f, j11);
        int i10 = h0Var.d;
        h0Var.d = i10 + 1;
        if (n.f15273j) {
            n.j();
            n.f15273j = false;
        }
        com.google.android.gms.internal.cast.m.q((com.google.android.gms.internal.cast.m) n.f15272f, i10);
        String str = h0Var.f15233b;
        if (str != null) {
            if (n.f15273j) {
                n.j();
                n.f15273j = false;
            }
            com.google.android.gms.internal.cast.m.x((com.google.android.gms.internal.cast.m) n.f15272f, str);
        }
        String str2 = h0Var.f15237g;
        if (str2 != null) {
            if (n.f15273j) {
                n.j();
                n.f15273j = false;
            }
            com.google.android.gms.internal.cast.m.v((com.google.android.gms.internal.cast.m) n.f15272f, str2);
        }
        n0 m10 = com.google.android.gms.internal.cast.h.m();
        String str3 = f15244e;
        if (m10.f15273j) {
            m10.j();
            m10.f15273j = false;
        }
        com.google.android.gms.internal.cast.h.p((com.google.android.gms.internal.cast.h) m10.f15272f, str3);
        String str4 = this.f15245a;
        if (m10.f15273j) {
            m10.j();
            m10.f15273j = false;
        }
        com.google.android.gms.internal.cast.h.o((com.google.android.gms.internal.cast.h) m10.f15272f, str4);
        com.google.android.gms.internal.cast.h c10 = m10.c();
        if (n.f15273j) {
            n.j();
            n.f15273j = false;
        }
        com.google.android.gms.internal.cast.m.s((com.google.android.gms.internal.cast.m) n.f15272f, c10);
        o0 m11 = com.google.android.gms.internal.cast.i.m();
        if (h0Var.f15232a != null) {
            u0 m12 = com.google.android.gms.internal.cast.q.m();
            String str5 = h0Var.f15232a;
            if (m12.f15273j) {
                m12.j();
                m12.f15273j = false;
            }
            com.google.android.gms.internal.cast.q.o((com.google.android.gms.internal.cast.q) m12.f15272f, str5);
            com.google.android.gms.internal.cast.q c11 = m12.c();
            if (m11.f15273j) {
                m11.j();
                m11.f15273j = false;
            }
            com.google.android.gms.internal.cast.i.q((com.google.android.gms.internal.cast.i) m11.f15272f, c11);
        }
        if (m11.f15273j) {
            m11.j();
            m11.f15273j = false;
        }
        com.google.android.gms.internal.cast.i.r((com.google.android.gms.internal.cast.i) m11.f15272f, false);
        String str6 = h0Var.f15235e;
        if (str6 != null) {
            try {
                String replace = str6.replace("-", BuildConfig.FLAVOR);
                j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e10) {
                a9.b bVar = d;
                Log.w(bVar.f254a, bVar.e("receiverSessionId %s is not valid for hash", str6), e10);
                j10 = 0;
            }
            if (m11.f15273j) {
                m11.j();
                m11.f15273j = false;
            }
            com.google.android.gms.internal.cast.i.s((com.google.android.gms.internal.cast.i) m11.f15272f, j10);
        }
        int i11 = h0Var.f15236f;
        if (m11.f15273j) {
            m11.j();
            m11.f15273j = false;
        }
        com.google.android.gms.internal.cast.i.v((com.google.android.gms.internal.cast.i) m11.f15272f, i11);
        n.n(m11);
        return n;
    }
}

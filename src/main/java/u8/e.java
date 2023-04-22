package u8;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import d9.a;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15656a = 0;

    /* loaded from: classes.dex */
    public interface a extends d9.f {
        u8.d S();

        boolean e();

        String g0();

        String h();
    }

    /* loaded from: classes2.dex */
    public static final class b implements a.d {

        /* renamed from: b  reason: collision with root package name */
        public final CastDevice f15657b;

        /* renamed from: c  reason: collision with root package name */
        public final c f15658c;
        public final Bundle d;

        /* renamed from: e  reason: collision with root package name */
        public final String f15659e = UUID.randomUUID().toString();

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public CastDevice f15660a;

            /* renamed from: b  reason: collision with root package name */
            public c f15661b;

            /* renamed from: c  reason: collision with root package name */
            public Bundle f15662c;

            public a(CastDevice castDevice, c cVar) {
                this.f15660a = castDevice;
                this.f15661b = cVar;
            }
        }

        public /* synthetic */ b(a aVar) {
            this.f15657b = aVar.f15660a;
            this.f15658c = aVar.f15661b;
            this.d = aVar.f15662c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
            if (r1 == r3) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean equals(java.lang.Object r10) {
            /*
                r9 = this;
                r7 = 1
                r0 = r7
                if (r10 != r9) goto L7
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                return r0
            L7:
                r8 = 4
                boolean r1 = r10 instanceof u8.e.b
                r2 = 0
                r8 = 2
                if (r1 != 0) goto Lf
                return r2
            Lf:
                u8.e$b r10 = (u8.e.b) r10
                r8 = 5
                com.google.android.gms.cast.CastDevice r1 = r9.f15657b
                r8 = 1
                com.google.android.gms.cast.CastDevice r3 = r10.f15657b
                boolean r1 = h9.m.a(r1, r3)
                if (r1 == 0) goto L7a
                android.os.Bundle r1 = r9.d
                r8 = 4
                android.os.Bundle r3 = r10.d
                if (r1 == 0) goto L6a
                r8 = 4
                if (r3 != 0) goto L29
                r8 = 5
                goto L6b
            L29:
                r8 = 5
                int r4 = r1.size()
                int r5 = r3.size()
                if (r4 == r5) goto L36
                r8 = 3
                goto L7b
            L36:
                java.util.Set r4 = r1.keySet()
                java.util.Set r7 = r3.keySet()
                r5 = r7
                boolean r5 = r4.containsAll(r5)
                if (r5 == 0) goto L7a
                r8 = 7
                java.util.Iterator r7 = r4.iterator()
                r4 = r7
            L4b:
                boolean r7 = r4.hasNext()
                r5 = r7
                if (r5 == 0) goto L6d
                r8 = 4
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                r8 = 3
                java.lang.Object r6 = r1.get(r5)
                java.lang.Object r5 = r3.get(r5)
                boolean r5 = h9.m.a(r6, r5)
                if (r5 != 0) goto L4b
                r8 = 4
                goto L7b
            L6a:
                r8 = 1
            L6b:
                if (r1 != r3) goto L7a
            L6d:
                r8 = 7
                java.lang.String r1 = r9.f15659e
                java.lang.String r10 = r10.f15659e
                boolean r7 = h9.m.a(r1, r10)
                r10 = r7
                if (r10 == 0) goto L7a
                return r0
            L7a:
                r8 = 3
            L7b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: u8.e.b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.f15657b, this.d, 0, this.f15659e});
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public void a(int i10) {
        }

        public void b(int i10) {
        }

        public void c(u8.d dVar) {
        }

        public void d() {
        }

        public void e(int i10) {
        }

        public void f() {
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(CastDevice castDevice, String str, String str2);
    }

    static {
        a.g<a9.b0> gVar = a9.j.f278a;
    }
}

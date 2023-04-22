package t9;

import android.view.View;
import w8.g;

/* loaded from: classes2.dex */
public final class i extends y8.a implements g.d {

    /* renamed from: b  reason: collision with root package name */
    public final View f15242b;

    /* renamed from: c  reason: collision with root package name */
    public final o3.d f15243c;

    public i(View view, o3.d dVar) {
        this.f15242b = view;
        this.f15243c = dVar;
        view.setEnabled(false);
    }

    @Override // w8.g.d
    public final void a(long j10, long j11) {
        f();
    }

    @Override // y8.a
    public final void b() {
        f();
    }

    @Override // y8.a
    public final void c() {
        this.f15242b.setEnabled(false);
    }

    @Override // y8.a
    public final void d(v8.d dVar) {
        super.d(dVar);
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.b(this, 1000L);
        }
        f();
    }

    @Override // y8.a
    public final void e() {
        w8.g gVar = this.f18545a;
        if (gVar != null) {
            gVar.s(this);
        }
        this.f15242b.setEnabled(false);
        this.f18545a = null;
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r14 = this;
            r10 = r14
            w8.g r0 = r10.f18545a
            r13 = 2
            r1 = 0
            r13 = 3
            if (r0 == 0) goto L78
            boolean r2 = r0.j()
            if (r2 == 0) goto L78
            r12 = 5
            boolean r2 = r0.p()
            if (r2 == 0) goto L16
            goto L79
        L16:
            boolean r2 = r0.l()
            r3 = 1
            if (r2 != 0) goto L24
            r12 = 4
            android.view.View r0 = r10.f15242b
            r0.setEnabled(r3)
            return
        L24:
            android.view.View r2 = r10.f15242b
            boolean r0 = r0.A()
            if (r0 == 0) goto L74
            o3.d r0 = r10.f15243c
            r13 = 5
            int r12 = r0.b()
            r4 = r12
            long r4 = (long) r4
            long r6 = r0.f()
            long r6 = r6 + r4
            java.lang.Object r4 = r0.f13543c
            w8.g r4 = (w8.g) r4
            if (r4 == 0) goto L6f
            boolean r13 = r4.j()
            r4 = r13
            if (r4 != 0) goto L49
            r13 = 6
            goto L6f
        L49:
            java.lang.Object r4 = r0.f13543c
            w8.g r4 = (w8.g) r4
            r13 = 2
            boolean r12 = r4.A()
            r4 = r12
            if (r4 != 0) goto L56
            goto L6f
        L56:
            int r13 = r0.d()
            r4 = r13
            long r4 = (long) r4
            r12 = 5
            long r8 = r0.f()
            long r8 = r8 + r4
            r13 = 1
            long r8 = r8 - r6
            r4 = 10000(0x2710, double:4.9407E-320)
            r12 = 7
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L6f
            r13 = 3
            r0 = 1
            r12 = 4
            goto L70
        L6f:
            r0 = 0
        L70:
            if (r0 != 0) goto L74
            r13 = 1
            r1 = r13
        L74:
            r2.setEnabled(r1)
            return
        L78:
            r13 = 3
        L79:
            android.view.View r0 = r10.f15242b
            r13 = 4
            r0.setEnabled(r1)
            r12 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.i.f():void");
    }
}

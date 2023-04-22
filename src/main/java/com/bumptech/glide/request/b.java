package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import z5.c;

/* loaded from: classes.dex */
public class b implements RequestCoordinator, c {

    /* renamed from: a  reason: collision with root package name */
    public final RequestCoordinator f5923a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5924b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f5925c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public RequestCoordinator.RequestState f5926e;

    /* renamed from: f  reason: collision with root package name */
    public RequestCoordinator.RequestState f5927f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5928g;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f5926e = requestState;
        this.f5927f = requestState;
        this.f5924b = obj;
        this.f5923a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, z5.c
    public boolean a() {
        boolean z10;
        synchronized (this.f5924b) {
            z10 = this.d.a() || this.f5925c.a();
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator b() {
        RequestCoordinator b10;
        synchronized (this.f5924b) {
            RequestCoordinator requestCoordinator = this.f5923a;
            b10 = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return b10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f5924b) {
            RequestCoordinator requestCoordinator = this.f5923a;
            z10 = true;
            if (requestCoordinator != null && !requestCoordinator.c(this)) {
                z11 = false;
                if (z11 || !cVar.equals(this.f5925c) || a()) {
                    z10 = false;
                }
            }
            z11 = true;
            if (z11) {
            }
            z10 = false;
        }
        return z10;
    }

    @Override // z5.c
    public void clear() {
        synchronized (this.f5924b) {
            this.f5928g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f5926e = requestState;
            this.f5927f = requestState;
            this.d.clear();
            this.f5925c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void d(c cVar) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.FAILED;
        synchronized (this.f5924b) {
            if (!cVar.equals(this.f5925c)) {
                this.f5927f = requestState;
                return;
            }
            this.f5926e = requestState;
            RequestCoordinator requestCoordinator = this.f5923a;
            if (requestCoordinator != null) {
                requestCoordinator.d(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000e, B:13:0x001e, B:15:0x0028, B:20:0x0034), top: B:27:0x0005 }] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(z5.c r9) {
        /*
            r8 = this;
            r4 = r8
            java.lang.Object r0 = r4.f5924b
            r6 = 2
            monitor-enter(r0)
            r7 = 7
            com.bumptech.glide.request.RequestCoordinator r1 = r4.f5923a     // Catch: java.lang.Throwable -> L37
            r7 = 5
            r6 = 1
            r2 = r6
            r3 = 0
            if (r1 == 0) goto L19
            r6 = 4
            boolean r6 = r1.e(r4)     // Catch: java.lang.Throwable -> L37
            r1 = r6
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = 0
            goto L1c
        L19:
            r6 = 6
        L1a:
            r6 = 1
            r1 = r6
        L1c:
            if (r1 == 0) goto L31
            r6 = 6
            z5.c r1 = r4.f5925c     // Catch: java.lang.Throwable -> L37
            boolean r7 = r9.equals(r1)     // Catch: java.lang.Throwable -> L37
            r9 = r7
            if (r9 != 0) goto L33
            com.bumptech.glide.request.RequestCoordinator$RequestState r9 = r4.f5926e     // Catch: java.lang.Throwable -> L37
            r7 = 6
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L37
            r7 = 2
            if (r9 == r1) goto L31
            goto L34
        L31:
            r7 = 0
            r2 = r7
        L33:
            r7 = 3
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            r7 = 6
            return r2
        L37:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r9
            r6 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.b.e(z5.c):boolean");
    }

    @Override // z5.c
    public boolean f() {
        boolean z10;
        synchronized (this.f5924b) {
            z10 = this.f5926e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean g(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f5924b) {
            RequestCoordinator requestCoordinator = this.f5923a;
            z10 = true;
            if (requestCoordinator != null && !requestCoordinator.g(this)) {
                z11 = false;
                if (z11 || !cVar.equals(this.f5925c) || this.f5926e == RequestCoordinator.RequestState.PAUSED) {
                    z10 = false;
                }
            }
            z11 = true;
            if (z11) {
            }
            z10 = false;
        }
        return z10;
    }

    @Override // z5.c
    public boolean h(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f5925c == null) {
                if (bVar.f5925c != null) {
                    return false;
                }
            } else if (!this.f5925c.h(bVar.f5925c)) {
                return false;
            }
            if (this.d == null) {
                if (bVar.d != null) {
                    return false;
                }
            } else if (!this.d.h(bVar.d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // z5.c
    public void i() {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.RUNNING;
        synchronized (this.f5924b) {
            this.f5928g = true;
            if (this.f5926e != RequestCoordinator.RequestState.SUCCESS && this.f5927f != requestState) {
                this.f5927f = requestState;
                this.d.i();
            }
            if (this.f5928g && this.f5926e != requestState) {
                this.f5926e = requestState;
                this.f5925c.i();
            }
            this.f5928g = false;
        }
    }

    @Override // z5.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5924b) {
            z10 = this.f5926e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(c cVar) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.SUCCESS;
        synchronized (this.f5924b) {
            if (cVar.equals(this.d)) {
                this.f5927f = requestState;
                return;
            }
            this.f5926e = requestState;
            RequestCoordinator requestCoordinator = this.f5923a;
            if (requestCoordinator != null) {
                requestCoordinator.j(this);
            }
            if (!this.f5927f.b()) {
                this.d.clear();
            }
        }
    }

    @Override // z5.c
    public boolean k() {
        boolean z10;
        synchronized (this.f5924b) {
            z10 = this.f5926e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // z5.c
    public void pause() {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.PAUSED;
        synchronized (this.f5924b) {
            if (!this.f5927f.b()) {
                this.f5927f = requestState;
                this.d.pause();
            }
            if (!this.f5926e.b()) {
                this.f5926e = requestState;
                this.f5925c.pause();
            }
        }
    }
}

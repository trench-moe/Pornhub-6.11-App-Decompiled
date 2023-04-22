package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;
import z5.c;

/* loaded from: classes.dex */
public final class a implements RequestCoordinator, c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5918a;

    /* renamed from: b  reason: collision with root package name */
    public final RequestCoordinator f5919b;

    /* renamed from: c  reason: collision with root package name */
    public volatile c f5920c;
    public volatile c d;

    /* renamed from: e  reason: collision with root package name */
    public RequestCoordinator.RequestState f5921e;

    /* renamed from: f  reason: collision with root package name */
    public RequestCoordinator.RequestState f5922f;

    public a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f5921e = requestState;
        this.f5922f = requestState;
        this.f5918a = obj;
        this.f5919b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, z5.c
    public boolean a() {
        boolean z10;
        synchronized (this.f5918a) {
            z10 = this.f5920c.a() || this.d.a();
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator b() {
        RequestCoordinator b10;
        synchronized (this.f5918a) {
            RequestCoordinator requestCoordinator = this.f5919b;
            b10 = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return b10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f5918a) {
            RequestCoordinator requestCoordinator = this.f5919b;
            z10 = true;
            if (requestCoordinator != null && !requestCoordinator.c(this)) {
                z11 = false;
                if (z11 || !l(cVar)) {
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
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f5921e = requestState;
            this.f5920c.clear();
            if (this.f5922f != requestState) {
                this.f5922f = requestState;
                this.d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void d(c cVar) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.FAILED;
        synchronized (this.f5918a) {
            if (cVar.equals(this.d)) {
                this.f5922f = requestState;
                RequestCoordinator requestCoordinator = this.f5919b;
                if (requestCoordinator != null) {
                    requestCoordinator.d(this);
                }
                return;
            }
            this.f5921e = requestState;
            RequestCoordinator.RequestState requestState2 = this.f5922f;
            RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.RUNNING;
            if (requestState2 != requestState3) {
                this.f5922f = requestState3;
                this.d.i();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f5918a) {
            RequestCoordinator requestCoordinator = this.f5919b;
            z10 = true;
            if (requestCoordinator != null && !requestCoordinator.e(this)) {
                z11 = false;
                if (z11 || !l(cVar)) {
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
    public boolean f() {
        boolean z10;
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState = this.f5921e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z10 = requestState == requestState2 && this.f5922f == requestState2;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean g(c cVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f5918a) {
            RequestCoordinator requestCoordinator = this.f5919b;
            z10 = true;
            if (requestCoordinator != null && !requestCoordinator.g(this)) {
                z11 = false;
                if (z11 || !l(cVar)) {
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
        if (cVar instanceof a) {
            a aVar = (a) cVar;
            return this.f5920c.h(aVar.f5920c) && this.d.h(aVar.d);
        }
        return false;
    }

    @Override // z5.c
    public void i() {
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState = this.f5921e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f5921e = requestState2;
                this.f5920c.i();
            }
        }
    }

    @Override // z5.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState = this.f5921e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z10 = requestState == requestState2 || this.f5922f == requestState2;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(c cVar) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.SUCCESS;
        synchronized (this.f5918a) {
            if (cVar.equals(this.f5920c)) {
                this.f5921e = requestState;
            } else if (cVar.equals(this.d)) {
                this.f5922f = requestState;
            }
            RequestCoordinator requestCoordinator = this.f5919b;
            if (requestCoordinator != null) {
                requestCoordinator.j(this);
            }
        }
    }

    @Override // z5.c
    public boolean k() {
        boolean z10;
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState = this.f5921e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2 && this.f5922f != requestState2) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean l(c cVar) {
        if (!cVar.equals(this.f5920c) && (this.f5921e != RequestCoordinator.RequestState.FAILED || !cVar.equals(this.d))) {
            return false;
        }
        return true;
    }

    @Override // z5.c
    public void pause() {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.PAUSED;
        synchronized (this.f5918a) {
            RequestCoordinator.RequestState requestState2 = this.f5921e;
            RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.RUNNING;
            if (requestState2 == requestState3) {
                this.f5921e = requestState;
                this.f5920c.pause();
            }
            if (this.f5922f == requestState3) {
                this.f5922f = requestState;
                this.d.pause();
            }
        }
    }
}

package hf;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public final class e<R> implements gf.c<R, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f10440a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10441b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10442c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10443e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10444f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f10445g;

    public e(Type type, Scheduler scheduler, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f10440a = type;
        this.f10441b = z11;
        this.f10442c = z12;
        this.d = z13;
        this.f10443e = z14;
        this.f10444f = z15;
        this.f10445g = z16;
    }

    @Override // gf.c
    public Type a() {
        return this.f10440a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // gf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(gf.b<R> r2) {
        /*
            r1 = this;
            hf.b r0 = new hf.b
            r0.<init>(r2)
            boolean r2 = r1.f10441b
            if (r2 == 0) goto L10
            hf.d r2 = new hf.d
            r2.<init>(r0)
        Le:
            r0 = r2
            goto L1a
        L10:
            boolean r2 = r1.f10442c
            if (r2 == 0) goto L1a
            hf.a r2 = new hf.a
            r2.<init>(r0)
            goto Le
        L1a:
            boolean r2 = r1.d
            if (r2 == 0) goto L25
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.Flowable r2 = r0.toFlowable(r2)
            return r2
        L25:
            boolean r2 = r1.f10443e
            if (r2 == 0) goto L2e
            io.reactivex.Single r2 = r0.singleOrError()
            return r2
        L2e:
            boolean r2 = r1.f10444f
            if (r2 == 0) goto L37
            io.reactivex.Maybe r2 = r0.singleElement()
            return r2
        L37:
            boolean r2 = r1.f10445g
            if (r2 == 0) goto L40
            io.reactivex.Completable r2 = r0.ignoreElements()
            return r2
        L40:
            io.reactivex.Observable r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.e.b(gf.b):java.lang.Object");
    }
}

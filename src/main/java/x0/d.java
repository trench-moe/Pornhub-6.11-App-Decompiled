package x0;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* loaded from: classes2.dex */
public final class d extends b<d> {

    /* renamed from: r  reason: collision with root package name */
    public e f17657r;

    /* renamed from: s  reason: collision with root package name */
    public float f17658s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f17659t;

    public <K> d(K k10, c cVar) {
        super(k10, cVar);
        this.f17657r = null;
        this.f17658s = Float.MAX_VALUE;
        this.f17659t = false;
    }

    public void d() {
        if (!(this.f17657r.f17661b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f17648f) {
            this.f17659t = true;
        }
    }
}

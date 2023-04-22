package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class n0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f2208c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f2209f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f2210j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p.a f2211m;
    public final /* synthetic */ View n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ r0 f2212t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Rect f2213u;

    public n0(Fragment fragment, Fragment fragment2, boolean z10, p.a aVar, View view, r0 r0Var, Rect rect) {
        this.f2208c = fragment;
        this.f2209f = fragment2;
        this.f2210j = z10;
        this.f2211m = aVar;
        this.n = view;
        this.f2212t = r0Var;
        this.f2213u = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        p0.c(this.f2208c, this.f2209f, this.f2210j, this.f2211m, false);
        View view = this.n;
        if (view != null) {
            this.f2212t.j(view, this.f2213u);
        }
    }
}

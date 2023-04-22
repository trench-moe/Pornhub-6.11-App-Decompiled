package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.p0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o0 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Rect B;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r0 f2215c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.a f2216f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f2217j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p0.b f2218m;
    public final /* synthetic */ ArrayList n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ View f2219t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Fragment f2220u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Fragment f2221w;
    public final /* synthetic */ boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2222z;

    public o0(r0 r0Var, p.a aVar, Object obj, p0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z10, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f2215c = r0Var;
        this.f2216f = aVar;
        this.f2217j = obj;
        this.f2218m = bVar;
        this.n = arrayList;
        this.f2219t = view;
        this.f2220u = fragment;
        this.f2221w = fragment2;
        this.y = z10;
        this.f2222z = arrayList2;
        this.A = obj2;
        this.B = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        p.a<String, View> e10 = p0.e(this.f2215c, this.f2216f, this.f2217j, this.f2218m);
        if (e10 != null) {
            this.n.addAll(e10.values());
            this.n.add(this.f2219t);
        }
        p0.c(this.f2220u, this.f2221w, this.y, e10, false);
        Object obj = this.f2217j;
        if (obj != null) {
            this.f2215c.x(obj, this.f2222z, this.n);
            View k10 = p0.k(e10, this.f2218m, this.A, this.y);
            if (k10 != null) {
                this.f2215c.j(k10, this.B);
            }
        }
    }
}

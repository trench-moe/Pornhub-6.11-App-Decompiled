package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2200c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r0 f2201f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f2202j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Fragment f2203m;
    public final /* synthetic */ ArrayList n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2204t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2205u;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f2206w;

    public m0(Object obj, r0 r0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2200c = obj;
        this.f2201f = r0Var;
        this.f2202j = view;
        this.f2203m = fragment;
        this.n = arrayList;
        this.f2204t = arrayList2;
        this.f2205u = arrayList3;
        this.f2206w = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f2200c;
        if (obj != null) {
            this.f2201f.o(obj, this.f2202j);
            this.f2204t.addAll(p0.h(this.f2201f, this.f2200c, this.f2203m, this.n, this.f2202j));
        }
        if (this.f2205u != null) {
            if (this.f2206w != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2202j);
                this.f2201f.p(this.f2206w, this.f2205u, arrayList);
            }
            this.f2205u.clear();
            this.f2205u.add(this.f2202j);
        }
    }
}

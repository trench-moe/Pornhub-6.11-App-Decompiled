package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class t0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2264c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2265f;

    public t0(r0 r0Var, ArrayList arrayList, Map map) {
        this.f2264c = arrayList;
        this.f2265f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f2264c.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) this.f2264c.get(i10);
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.i.v(view, (String) this.f2265f.get(x.i.k(view)));
        }
    }
}

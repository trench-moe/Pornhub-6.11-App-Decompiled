package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class s0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2261c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map f2262f;

    public s0(r0 r0Var, ArrayList arrayList, Map map) {
        this.f2261c = arrayList;
        this.f2262f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f2261c.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) this.f2261c.get(i10);
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            String k10 = x.i.k(view);
            if (k10 != null) {
                Iterator it = this.f2262f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k10.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                x.i.v(view, str);
            }
        }
    }
}

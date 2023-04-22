package androidx.core.mh;

import androidx.core.mh.ComponentActivity;
import androidx.core.mh.result.d;
import c.a;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1851c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.C0046a f1852f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ComponentActivity.b f1853j;

    public d(ComponentActivity.b bVar, int i10, a.C0046a c0046a) {
        this.f1853j = bVar;
        this.f1851c = i10;
        this.f1852f = c0046a;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.core.mh.result.b<?> bVar;
        ComponentActivity.b bVar2 = this.f1853j;
        int i10 = this.f1851c;
        Object obj = this.f1852f.f3716a;
        String str = bVar2.f1862b.get(Integer.valueOf(i10));
        if (str == null) {
            return;
        }
        bVar2.f1864e.remove(str);
        d.b<?> bVar3 = bVar2.f1865f.get(str);
        if (bVar3 != null && (bVar = bVar3.f1871a) != null) {
            bVar.a(obj);
            return;
        }
        bVar2.f1867h.remove(str);
        bVar2.f1866g.put(str, obj);
    }
}

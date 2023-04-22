package j0;

import android.graphics.Typeface;
import d0.f;
import e0.e;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t3.a f11093c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Typeface f11094f;

    public a(c cVar, t3.a aVar, Typeface typeface) {
        this.f11093c = aVar;
        this.f11094f = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        t3.a aVar = this.f11093c;
        Typeface typeface = this.f11094f;
        f.c cVar = ((e.a) aVar).f8975u;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}

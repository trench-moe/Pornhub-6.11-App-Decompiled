package b2;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class j implements Callable<r<f>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WeakReference f3472c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f3473f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f3474j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f3475m;

    public j(WeakReference weakReference, Context context, int i10, String str) {
        this.f3472c = weakReference;
        this.f3473f = context;
        this.f3474j = i10;
        this.f3475m = str;
    }

    @Override // java.util.concurrent.Callable
    public r<f> call() {
        Context context = (Context) this.f3472c.get();
        if (context == null) {
            context = this.f3473f;
        }
        return g.e(context, this.f3474j, this.f3475m);
    }
}

package b2;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class i implements Callable<r<f>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f3469c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3470f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f3471j;

    public i(Context context, String str, String str2) {
        this.f3469c = context;
        this.f3470f = str;
        this.f3471j = str2;
    }

    @Override // java.util.concurrent.Callable
    public r<f> call() {
        return g.b(this.f3469c, this.f3470f, this.f3471j);
    }
}

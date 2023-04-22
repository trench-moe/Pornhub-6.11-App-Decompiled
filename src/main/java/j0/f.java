package j0;

import android.content.Context;
import j0.j;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class f implements Callable<j.a> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11104c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f11105f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f11106j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f11107m;

    public f(String str, Context context, e eVar, int i10) {
        this.f11104c = str;
        this.f11105f = context;
        this.f11106j = eVar;
        this.f11107m = i10;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        return j.a(this.f11104c, this.f11105f, this.f11106j, this.f11107m);
    }
}

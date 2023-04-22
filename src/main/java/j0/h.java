package j0;

import android.content.Context;
import j0.j;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class h implements Callable<j.a> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11109c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Context f11110f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f11111j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f11112m;

    public h(String str, Context context, e eVar, int i10) {
        this.f11109c = str;
        this.f11110f = context;
        this.f11111j = eVar;
        this.f11112m = i10;
    }

    @Override // java.util.concurrent.Callable
    public j.a call() {
        try {
            return j.a(this.f11109c, this.f11110f, this.f11111j, this.f11112m);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}

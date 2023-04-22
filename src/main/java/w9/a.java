package w9;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17054c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17055f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f17054c = i10;
        this.f17055f = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f17054c) {
            case 0:
                return new w5(((m0) this.f17055f).d);
            case 1:
                return new w5(((m0) this.f17055f).f17235c);
            default:
                return ((Context) this.f17055f).getSharedPreferences("google_sdk_flags", 0);
        }
    }
}

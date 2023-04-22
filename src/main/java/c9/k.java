package c9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class k extends s9.f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3885a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f3886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f3886b = eVar;
        this.f3885a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        boolean z10 = true;
        if (i10 != 1) {
            a0.a.p(50, "Don't know how to handle this message: ", i10, "GoogleApiAvailability");
            return;
        }
        int d = this.f3886b.d(this.f3885a);
        Objects.requireNonNull(this.f3886b);
        AtomicBoolean atomicBoolean = h.f3879a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            z10 = false;
        }
        if (z10) {
            e eVar = this.f3886b;
            Context context = this.f3885a;
            eVar.h(context, d, null, eVar.b(context, d, 0, "n"));
        }
    }
}

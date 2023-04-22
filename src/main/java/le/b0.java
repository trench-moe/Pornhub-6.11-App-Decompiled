package le;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class b0 extends d {

    /* renamed from: c  reason: collision with root package name */
    public final Function1<Throwable, Unit> f12793c;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(Function1<? super Throwable, Unit> function1) {
        this.f12793c = function1;
    }

    @Override // le.d
    public void a(Throwable th) {
        this.f12793c.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        this.f12793c.invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("InvokeOnCancel[");
        m10.append(a0.b.w(this.f12793c));
        m10.append('@');
        m10.append(a0.b.B(this));
        m10.append(']');
        return m10.toString();
    }
}

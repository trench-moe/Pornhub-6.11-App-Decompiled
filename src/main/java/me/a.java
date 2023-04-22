package me;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import le.j0;

/* loaded from: classes3.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f13086f;

    /* renamed from: j  reason: collision with root package name */
    public final String f13087j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f13088m;
    public final a n;

    public a(Handler handler, String str, boolean z10) {
        super(null);
        this.f13086f = handler;
        this.f13087j = str;
        this.f13088m = z10;
        this._immediate = z10 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            Unit unit = Unit.INSTANCE;
        }
        this.n = aVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f13086f == this.f13086f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f13086f);
    }

    @Override // kotlinx.coroutines.b
    public void m(CoroutineContext coroutineContext, Runnable runnable) {
        this.f13086f.post(runnable);
    }

    @Override // kotlinx.coroutines.b
    public boolean n(CoroutineContext coroutineContext) {
        return (this.f13088m && Intrinsics.areEqual(Looper.myLooper(), this.f13086f.getLooper())) ? false : true;
    }

    @Override // le.j0
    public j0 s() {
        return this.n;
    }

    @Override // le.j0, kotlinx.coroutines.b
    public String toString() {
        String t2 = t();
        if (t2 == null) {
            String str = this.f13087j;
            if (str == null) {
                str = this.f13086f.toString();
            }
            return this.f13088m ? Intrinsics.stringPlus(str, ".immediate") : str;
        }
        return t2;
    }
}

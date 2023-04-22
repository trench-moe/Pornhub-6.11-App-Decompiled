package w9;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgs;

/* loaded from: classes2.dex */
public final class w1 extends u0 {

    /* renamed from: a  reason: collision with root package name */
    public final zzgs f17355a;

    public w1(zzgs zzgsVar) {
        this.f17355a = zzgsVar;
    }

    @Override // w9.v0
    public final int c() {
        return System.identityHashCode(this.f17355a);
    }

    @Override // w9.v0
    public final void w(String str, String str2, Bundle bundle, long j10) {
        this.f17355a.onEvent(str, str2, bundle, j10);
    }
}

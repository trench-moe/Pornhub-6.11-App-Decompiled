package w9;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgr;

/* loaded from: classes2.dex */
public final class v1 extends u0 {

    /* renamed from: a  reason: collision with root package name */
    public final zzgr f17333a;

    public v1(zzgr zzgrVar) {
        this.f17333a = zzgrVar;
    }

    @Override // w9.v0
    public final int c() {
        return System.identityHashCode(this.f17333a);
    }

    @Override // w9.v0
    public final void w(String str, String str2, Bundle bundle, long j10) {
        this.f17333a.interceptEvent(str, str2, bundle, j10);
    }
}

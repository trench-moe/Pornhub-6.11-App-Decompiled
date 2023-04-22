package h9;

import android.os.Bundle;
import h9.b;

/* loaded from: classes2.dex */
public final class a0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e9.c f10276a;

    public a0(e9.c cVar) {
        this.f10276a = cVar;
    }

    @Override // h9.b.a
    public final void onConnected(Bundle bundle) {
        this.f10276a.onConnected(bundle);
    }

    @Override // h9.b.a
    public final void onConnectionSuspended(int i10) {
        this.f10276a.onConnectionSuspended(i10);
    }
}
